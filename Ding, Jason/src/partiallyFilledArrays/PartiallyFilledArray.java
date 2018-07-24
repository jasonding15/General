package partiallyFilledArrays;

import java.util.Arrays;

public class PartiallyFilledArray
{
    private double[] values;
    private int size;
    
    public PartiallyFilledArray(int length)
    {
        values = new double [length];
        size = 0;
    }
    
    // returns the old value
    public double set(int index, double newValue)
    {
        double oldValue = values[index];
    		values[index] = newValue;
    		return oldValue; 
    }
    public void addToEnd(double value)
    {
        values[size] = value;
        size++;
    }
    
    public double get(int index)
    {
        return values[index]; 
    }
    
    // returns the element that was removed
    public double remove(int index)
    {
        double oldValue = values[index];
    		values[index] = 0.0;
    		return oldValue; 
    }
    
    public void insert(int index, double value) 
    {
        for(int i = size - 1; i >= index; i--)
            values[i + 1] = values[i];
        
        values[index] = value;
        size++;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public String getArray()
    {
    		return Arrays.toString(values);
    }
}
