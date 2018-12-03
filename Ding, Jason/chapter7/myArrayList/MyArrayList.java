package myArrayList;

public class MyArrayList<E>
{
    private Object[] a;
    private int size;

    public MyArrayList()
    {
        a = new Object[10];// TODO: implement
        size = 0;
    }

    public MyArrayList(int initialCapacity)
    {
        if (initialCapacity < 0) // TODO: replace this with the correct condition
            throw new IllegalArgumentException();
        a = new Object[initialCapacity];
        size = 0;
    }

    public int size()
    {
        return size; // TODO: implement
    }

    @SuppressWarnings("unchecked")
	public E get(int index)
    {
        if (index < 0 || index >= size) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();

        // Note: You must cast the reference from the array to type E.
        // For example, to return element 6 from a: return (E) a[6];

        return (E) a[index]; // TODO: implement
    }

    public E set(int index, E element)
    {
        if (index < 0 || index >= size) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();
        @SuppressWarnings("unchecked")
		E value = (E) a[index];
        for (int i = 0; i < a.length; i++)
        {
        	if (i == index)
        		a[i] = element;
        }
        return value; // TODO: implement
    }

    public boolean contains(Object elem)
    {
        for (int i = 0; i < size; i++)
        	if (a[i].equals(elem))
        		return true;
        return false;
    }

    public void trimToSize()
    {
    		if (size != a.length)
    		{
    			Object[] b = new Object[size];
    			for (int i = 0; i < a.length; i++)
    				if (a[i] != null)
    					b[i] = a[i];
    			a = b;
    		}
    }

    public void add(int index, E element)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        size++;
        if (a.length >= size)
        {
        		for (int i = size - 1; i > index; i--)
        		{
        			a[i] = a[i - 1];
        		}
        		a[index] = element;
        }
        else
        {
        		Object[] b = new Object[a.length + 1];
        		for (int i = 0; i < index; i++)
        			b[i] = a[i];
        		b[index] = element;
        		for (int i = index + 1; i < size; i++)
        			b[i] = a[i - 1];
        		a = b;
        }
    }
    
    public boolean add(E elem)
    {
        add(size, elem);
        return true;
    }

    public E remove(int index)
    {
        if (index < 0 || index >= size()) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();
        @SuppressWarnings("unchecked")
		E temp = (E) a[index];
        Object[] b = new Object[a.length];
        size--;
        for (int i = 0; i < index; i++)
        		b[i] = a[i];
        for (int i = index + 1; i < a.length; i++)
        	b[i - 1] = a[i];
        a = b;
        return temp; // TODO: implement
    }

    public boolean remove(Object elem)
    {
        for (int i = 0; i < size; i++)
        {
        		if (a[i].equals(elem))
        		{
        			this.remove(i);
        			return true;
        		}
        }
        return false; // TODO: implement
    }

    // start package access methods to facilitate automated testing
    // do not modify these methods

    Object[] getA()
    {
        return a;
    }

    void setA(Object[] newA)
    {
        a = newA;
    }

    int getSize()
    {
        return size;
    }

    void setSize(int newSize)
    {
        size = newSize;
    }

    // end package access methods to facilitate automated testing
}
