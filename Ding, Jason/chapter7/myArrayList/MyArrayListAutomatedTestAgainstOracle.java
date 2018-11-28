package myArrayList;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyArrayListAutomatedTestAgainstOracle extends TestCase
{
    private static final boolean OUTPUT_METHOD_CALLS = false;
    private static final int NUMBER_OF_METHOD_CALLS = 1000000;
    
    private ArrayList<Integer> oracle;
    private MyArrayList<Integer> underTest;
    
    private int abortedCalls;
    private int maxSize;
    
    public void setUp()
    {
        underTest = new MyArrayList<Integer>();
        oracle = new ArrayList<Integer>();
        
        abortedCalls = 0;
        maxSize = 0;
    }
    
    private void size()
    {
        if(OUTPUT_METHOD_CALLS)
            System.out.println("size()");
        
        int oracleSize = oracle.size();
        int underTestSize = underTest.size();
        assertTrue(oracleSize == underTestSize);
    }
    
    private int getValidIndexForGetSetRemove()
    {
        if(oracle.size() == 0)
            return -1;
        
        return (int) (Math.random() * oracle.size());
    }
    
    private void getValid()
    {
        int index = getValidIndexForGetSetRemove();
        
        if(index == -1)
        {
            abortedCalls++;
            return;
        }
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("get(" + index + ")");
        
        Integer oracleGet = oracle.get(index);
        Integer underTestGet = underTest.get(index);
        assertTrue(oracleGet.equals(underTestGet));
    }
    
    private void getInvalid()
    {
        // note: this test doesn't actually check the result against the oracle
        
        int invalidIndex = oracle.size();
        if(Math.random() < 0.5)
            invalidIndex = -1;
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("get(" + invalidIndex + ")");
        
        try
        {
            underTest.get(invalidIndex);
            assertTrue(false); // should have thrown exception
        }
        catch(IndexOutOfBoundsException e)
        {
            assertTrue(true); // threw correct exception
        }
    }
    
    private Integer getRandomValue()
    {
        Integer value = (int) (Math.random() * 1000 - 500);
        return value;
    }
    
    private void setValid()
    {
        int index = getValidIndexForGetSetRemove();
        
        if(index == -1)
        {
            abortedCalls++;
            return;
        }
        
        Integer value = getRandomValue();
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("set(" + index + ", " + value + ")");
        
        Integer oracleSet = oracle.set(index, value);
        Integer underTestSet = underTest.set(index, value);
        assertTrue(oracleSet.equals(underTestSet));
    }
    
    // TODO: is testing invalid calls to set worthwhile?

    private void contains()
    {
        Integer value = getRandomValue();
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("contains(" + value + ")");
        
        boolean oracleContains = oracle.contains(value);
        boolean underTestContains = underTest.contains(value);
        assertTrue(oracleContains == underTestContains);
    }

    private void trimToSize()
    {
        if(OUTPUT_METHOD_CALLS)
            System.out.println("trimToSize()");
        
        oracle.trimToSize();
        underTest.trimToSize();
    }
    
    private int getValidIndexForAdd()
    {
        return (int) (Math.random() * (oracle.size() + 1));
    }
    
    private void addValid()
    {
        int index = getValidIndexForAdd();
        Integer value = getRandomValue();
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("add(" + index + ", " + value + ")");
        
        oracle.add(index, value);
        underTest.add(index, value);
    }
    
    // TODO: is testing invalid calls to add worthwhile?
    
    private void add()
    {
        Integer value = getRandomValue();
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("add(" + value + ")");
        
        boolean oracleReturn = oracle.add(value);
        boolean underTestReturn = underTest.add(value);
        assertTrue(oracleReturn == underTestReturn);
    }
    
    private void removeValid()
    {
        int index = getValidIndexForGetSetRemove();
        
        if(index == -1)
        {
            abortedCalls++;
            return;
        }
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("remove(" + index + ") with index");
        
        Integer oracleReturn = oracle.remove(index);
        Integer underTestReturn = underTest.remove(index);
        assertTrue(oracleReturn.equals(underTestReturn));
    }
    
    // TODO: is testing invalid calls to remove worthwhile?
    
    private void remove()
    {
        Integer value = getRandomValue();
        
        if(OUTPUT_METHOD_CALLS)
            System.out.println("remove(" + value + ") with value");
        
        boolean oracleReturn = oracle.remove(value);
        boolean underTestReturn = underTest.remove(value);
        assertTrue(oracleReturn == underTestReturn);
    }

    private void runSelectedTest(int testNumber)
    {
        if(testNumber == 0)
            size();
        else if(testNumber == 1)
            getValid();
        else if(testNumber == 2)
            getInvalid();
        else if(testNumber == 3)
            setValid();
        else if(testNumber == 4)
            contains();
        else if(testNumber == 5)
            trimToSize();
        else if(testNumber == 6)
            addValid();
        else if(testNumber == 7)
            add();
        else if(testNumber == 8)
            removeValid();
        else if(testNumber == 9)
            remove();
    }
    
    public void testAgainstOracle()
    {
        for(int call = 1; call <= NUMBER_OF_METHOD_CALLS; call++)
        {
            int testNumber = (int) (Math.random() * 10);
            runSelectedTest(testNumber);
            maxSize = Math.max(oracle.size(), maxSize);
        }
        
        System.out.println("Aborted calls: " + abortedCalls);
        System.out.println("Max size: " + maxSize);
    }
}