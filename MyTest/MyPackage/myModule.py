'''
Created on Apr 19, 2020

@author: jasonding15
'''
import re
import vcf

def find_DM_by_gene(gene, folder):
    f = open("/Users/jasonding15/Desktop/Admera/Resource/gdc_download_20200528_205913.952106/70835251-ddd5-4c0d-968e-1791bf6379f6/TCGA.COAD.somaticsniper.70835251-ddd5-4c0d-968e-1791bf6379f6.DR-10.0.somatic.maf", "r")
    fname = "%s%s/%s%s" % ("/Users/jasonding15/Desktop/Admera/Gene_Mut/", folder, gene, ".txt")
    fout = open(fname, "w")
    for line in f:
        fields = line.split("\t")
        if (fields[0] == gene):
            effects = fields[45].split(";")
            check= 0
            for effect in effects:
                x = effect.split(",")
                if(("deleterious" in x[8]) & ("damaging" in x[9])):
                    check = 1
            if (check == 1):
                fout.write("%s\t%s\%s\t%s\t%s\%s\t%s\t%s\%s\t%s\t%s\n" % (fields[0],fields[15], fields[16],  fields[4], fields[5], fields[8], fields[10], fields[11], fields[34], fields[36], fields[45]))
            
    f.close()
    fout.close()   
    
def process_Genes1():
    f = open("/Users/jasonding15/Desktop/Admera/Resource/Genes1.tsv", "r")
    next(f)
    for line in f:
        fields = line.split("\t")
        find_DM_by_gene(fields[1], "Gene1")
    f.close()

def process_Genes2():
    f = open("/Users/jasonding15/Desktop/Admera/Resource/Genes2.tsv", "r")
    for line in f:
        fields = line.split("\t")
        if (" " in fields[1]):
            find_DM_by_gene(re.search('(.*) \((.*)\)',fields[1]).group(1), "Gene2")
            find_DM_by_gene(re.search('(.*) \((.*)\)',fields[1]).group(2), "Gene2")
        else:
            find_DM_by_gene(fields[1], "Gene2")
    f.close()

def check_Sample():
    f = open("/Users/jasonding15/Desktop/Admera/Resource/Sample_MSI_Status.tsv", "r")
    next(f)
    count = 0
    count_Total = 0
    for line in f:
        fields = line.split("\t")
        count_Total+=1
        if(not check(fields[0])):
            #print(fields[0])
            count+=1
    f.close()
    print (count, count_Total)
    
    
def check(keyword):
    datafile = open("/Users/jasonding15/Desktop/Admera/Resource/data/mutation_data.maf", "r")
    found = False
    for line in datafile:
        if keyword in line:
            found = True
            break
    datafile.close()
    return found


def splitColumn():
    datafile = open("/Users/jasonding15/Desktop/Admera/Resource/GeneVCF/TCGA-A6-2686_Mutect2_V1_anno_GeneList.vcf", "r")
    reader = datafile.readlines()
    fields = reader[250].split("\t")
    print(fields[7])
    fields2 = fields[7].split(";")
    c = 0
    for f in fields2:
        if("CSQ" in f):
            break
        c +=1
    fields3 = fields2[c].split("|")
    count = 0
    for col in fields3:
        if ("deleterious" in col):
            print(count, "\t", col, "\n")
        count +=1
    #print(fields[1], fields[35], fields[165])

    #if ("missense" in fields[1]):
    #    print(fields[1], fields[35], fields[165], fields[295], fields[490], fields[685])
    datafile.close()

#process_Genes1()
#find_DM_by_gene("POLE")
#process_Genes2()
#check_Sample()
#splitColumn()
vcf_reader = vcf.Reader(open('/Users/jasonding15/Desktop/Admera/Resource/GeneVCF/TCGA-A6-2686_Mutect2_V1_anno_GeneList.vcf', 'r'))
for record in vcf_reader:
    print(record)
