'''
Created on Jul 2, 2020

@author: jasonding15
'''
def createData():
    f = open("/Users/jasonding15/Desktop/Admera/Resource/TCGA_COAD_READ_Gene.txt", "r")
    sampleIDs = open("/Users/jasonding15/Desktop/Admera/Resource/Sample_MSI_Status.tsv", "r")
    c = 0

    for i, line in enumerate(sampleIDs):
        contains = False
        sample = line.split("\t")[0]
        print(c, "HI", sample)
        c +=1
        x = next(f)
        print(x)
        if (i > 5):
            break
        '''for l in f:
            print("NO")
            field = l.split("\t")[17]
            print(field, sample)
            if (sample in field):
                contains = True 
                break  '''
        '''if (contains):
            #print(sample, count)
            count +=1'''
    f.close()
    sampleIDs.close()


def counter():
    sampleIDs = open("/Users/jasonding15/Desktop/Admera/Resource/Sample_MSI_Status.tsv", "r")
    cH = 0
    cL = 0
    for line in sampleIDs:
        field = line.split("\t")[10]
        if (field == "MSI-H"):
            cH +=1
        elif(field == "MSI-L" or field == "MSS"):
            cL +=1
    print(cH, cL, cH+cL)
    sampleIDs.close()
counter()
            

    