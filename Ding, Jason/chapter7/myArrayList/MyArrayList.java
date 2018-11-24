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
        E value = (E) a[index];
        for (int i = 0; i < size; i++)
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
        Object[] b = new Object[size];
        for (int i = 0; i < size; i++)
        	b[i] = a[i];
        a = b;
    }

    public void add(int index, E element)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        size++;
        Object[] b = new Object[size];
        for (int i = 0; i < index; i++)
        	b[i] = a[i];
        b[index] = element;
        for (int i = index + 1; i < size; i++)
        	b[i] = a[i - 1];
        
        // TODO: implement
    }
    
    public boolean add(E elem)
    {
        return false; // TODO: implement
    }

    public E remove(int index)
    {
        if (true) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();

        return null; // TODO: implement
    }

    public boolean remove(Object elem)
    {
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
