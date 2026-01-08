public class DynamicStringList implements StringList {
    private String[] theStrings;
    private int capacity;
    private int size;

    public DynamicStringList()
    {
        this.theStrings = new String[10];
        this.capacity = 10;
        this.size = 0;
    }

    public DynamicStringList(int num)
    {
        this.capacity = num;
        this.theStrings = new String[num];
        this.size = 0;
    }

    /**
    * Retrieves the string at the specified index in the list.
    *
    * @param index the index of the string to retrieve.
    * @return the string at the specified index.
    * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
    */
    public String get(int index)
    {
        if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        return "test";
    }

    /**
    * Replaces the string at the specified index with the given value.
    *
    * @param index the index of the string to replace.
    * @param value the new value to set at the specified index.
    * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
    */
    public void set(int index, String value)
    {
        
    }

    /**
    * Adds a new string to the end of the list.
    *
    * @param value the string to add to the list.
    */
    public void add(String value)
    {
        size++;
    }

    /**
    * Removes the string at the specified index from the list.
    *
    * @param index the index of the string to remove.
    * @return the string that was removed.
    * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
    */
    public String remove(int index)
    {
        size--;
        return "test";
    }

    /**
    * Returns the number of strings currently in the list.
    *
    * @return the size of the list.
    */
    public int size() {
        return size;
    }

    /**
    * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
    *
    * @return the capacity of the list.
    */
    public int capacity()
    {
        return capacity;
    }
}
