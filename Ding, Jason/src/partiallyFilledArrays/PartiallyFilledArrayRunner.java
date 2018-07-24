package partiallyFilledArrays;

<<<<<<< HEAD
=======
import java.util.Arrays;

>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/jding2.git
public class PartiallyFilledArrayRunner
{
    public static void main(String[] args)
    {
        PartiallyFilledArray pfa = new PartiallyFilledArray(5);
        // [0.0, 0.0, 0.0, 0.0, 0.0], size: 0
        
        pfa.addToEnd(7.9);
        pfa.addToEnd(8.9);
        pfa.addToEnd(9.3);
        // [7.9, 8.9, 9.3, 0.0, 0.0], size: 3
        
        pfa.insert(2, 5.5);
        pfa.set(3, 6.6);
        pfa.remove(0);
        System.out.println(pfa.getArray());
//        System.out.println(Arrays.toString(pfa));
        // [7.3, 5.5, 8.9, 9.3, 0.0], size: 4
        System.out.println(pfa.get(3));
    }
}