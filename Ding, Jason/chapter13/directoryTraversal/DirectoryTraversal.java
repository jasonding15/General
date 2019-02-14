package directoryTraversal;

import java.io.File;

public class DirectoryTraversal
{
    public static void main(String[] args)
    {
        File f = new File("/Users/jding/Documents");
    		printFileNames(f, 8);
    }
    
    public static void printFileNames(File f, int maxLevels)
    {
        if(maxLevels == 0)
        {
        		System.out.println(f.getAbsolutePath());
        		return;
        }
        if (f.isDirectory())
        {
//        		File[] arr = f.listFiles();
        		for(File a : f.listFiles())
        		{
        			printFileNames(a, maxLevels - 1);
        		}		
        }
        else
        		printFileNames(f, maxLevels - 1);
        
        // getAbsolutePath = returns file path in string, isDirectory = boolean if folder, listFiles = array of files in folder
    }
}
