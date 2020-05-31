'''
Created on Apr 19, 2020

@author: jasonding15
'''
import re

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
    
#process_Genes1()
#find_DM_by_gene("POLE")
process_Genes2()