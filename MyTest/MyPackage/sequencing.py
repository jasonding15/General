'''
Created on Jul 1, 2020

@author: jasonding15
'''
import re

def checkDamagingMutation(gene, sampleID):
    f = open("/Users/jasonding15/Desktop/Admera/Resource/TCGA_COAD_READ_Gene.txt", "r")
    sum = -1
    for line in f:
        fields = line.split("\t")
        if (fields[0] == gene and sampleID in fields[17]):
            if(fields[86] == "." or float(fields[86]) < 0.01):
                if(fields[80] == "high"):
                    continue
                elif(fields[7] != "."):
                    value = float(re.search('\((.*)\)',fields[7]).group(1))
                    if not (("deleterious(" in fields[6] and value > 0.3) or ("deleterious_low_confidence" in fields[6] and value > 0.44) or (fields[6] == "." and value > 0.44) or ("tolerated_low_confidence" in fields[6] and value > 0.9)):
                        continue
                elif("deleterious" in fields[6]):
                        continue
                else:
                    print("hi", fields[6], fields[7], fields[80])
                    next                        
                print (fields[6], fields[7], fields[80])
    f.close()
    return sum
    
def checkDamagingMutation2(gene, sampleID):
    f = open("/Users/jasonding15/Desktop/Admera/Resource/TCGA_COAD_READ_Gene.txt", "r")
    sum = -1
    for line in f:
        fields = line.split("\t")
        if (fields[0] == gene and sampleID in fields[17]):
            print(0, fields[6], fields[7], fields[80], fields[86], fields[102].split(":")[0])
            if(fields[86] == "." or float(fields[86]) < 0.01):
                if(fields[80] == "HIGH"):
                    sum = 1
#                    if (sum < calcS(fields[102])):
#                        sum = calcS(fields[102])
                    print (1, fields[6], fields[7], fields[80], "is damaging", "\n")                
                elif(fields[7] != "."):
                    value = float(re.search('\((.*)\)',fields[7]).group(1))
                    if (("deleterious(" in fields[6] and value > 0.3) or ("deleterious_low_confidence" in fields[6] and value > 0.44) or (fields[6] == "." and value > 0.44) or ("tolerated_low_confidence" in fields[6] and value > 0.9)):
                        print(2,fields[6], fields[7], fields[80], "is damaging", "\n")
                        sum = 1
#                        if (sum < calcS(fields[102])):
#                            sum = calcS(fields[102])
                elif("deleterious" in fields[6]):
                        print(3,fields[6], fields[7], fields[80], "is damaging", "\n")
                        sum = 1
#                        if (sum < calcS(fields[102])):
#                            sum = calcS(fields[102])

                else:
                    next
                    #print(4, fields[6], fields[7], fields[80])
    f.close()
    print(sum)
    return sum


    
def calcS(x):
    y = x.split(":")
    if (y[0] == '\"0/1'):
        return 0.5
    elif(y[0] == '\"1/1'):
        return 1
    else:
        return 0

def hi():
    f = open("/Users/jasonding15/Desktop/Admera/Resource/TCGA_COAD_READ_Gene.txt", "r")
    x = next(f).split("\t")
    i = 0
    while i < len(x):
        print(i, x[i])
        i+=1
    '''for line in f:
        fields = line.split("\t")
        print (fields[0], fields[17])'''
        
def createData():
    f = open("/Users/jasonding15/Desktop/Admera/Resource/TCGA_COAD_READ_Gene.txt", "r")
    sampleIDs = open("/Users/jasonding15/Desktop/Admera/Resource/Sample_MSI_Status.tsv", "r")
    count = 0
    for i, line in enumerate(sampleIDs):       
        contains = False
        samples = line.split("\t")
        sample = samples[0]
        f.seek(0)
        for j, l in enumerate(f):
            fields = l.split("\t")
            field = fields[17]
            if (sample in field):
                contains = True 
                break 
        if (not contains):
            print("Not contain", i, j, sample, count)
            count +=1
        #else:
        #    print("CONTAIN", i, j, sample, count)
    f.close()
    sampleIDs.close()
#hi()
#checkDamagingMutation2("DNMT1", "TCGA")
createData()
    