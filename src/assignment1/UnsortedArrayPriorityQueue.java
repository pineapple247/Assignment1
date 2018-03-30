/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.*;
/**
 *
 * @author 13005626
 */
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> 
{
    private Object[] storage;  // Where the data is actually stored.
    private final int capacity;  // The size of the storage array.
    private int tailIndex;  // The index of the last item stored.  This is equal to the item count minus one.
    
    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnsortedArrayPriorityQueue(int size) 
    {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    
    /**
     * Add a new priority item to the queue
     * 
     * @param item
     * @param priority
     * @throws QueueOverflowException 
     */
    @Override
    public void add(T item, int priority) throws QueueOverflowException
    {
        tailIndex = tailIndex + 1;  // Increments tailIndex value in preparation for new item to be added.
        if (tailIndex >= capacity)  // Checks to see if adding a new item would overflow the array capacity.
        {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;  // If array is overflown, revert tailIndex to its previous value.
            throw new QueueOverflowException();  // Display queue overflown error.
        }
        else
        {
            storage[tailIndex] = new PriorityItem<>(item, priority);  // Adds new priority item to the end of the array.
        }
    }
    
    /**
     * Returns the highest priority item from the queue without removing it.
     * 
     * @return
     * @throws QueueUnderflowException 
     */
    @Override
    public T head()throws QueueUnderflowException 
    {
        if (isEmpty())  // If the queue is empty:
        {
            throw new QueueUnderflowException();  // Display queue-empty error.
        }
        else  // If queue is not empty:
        {
            int index = 0;   // Variable storing the index position of item.
            for(int i = 0; i <= tailIndex; i++)  // For each item in the queue:
            {
                int temp = ((PriorityItem<T>) storage[tailIndex]).getPriority();  // Temporary variable storing priority of an item in queue, starting with tailIndex.
                while(temp > ((PriorityItem<T>) storage[index]).getPriority())  // While the priority of the temporary variable item is less than the next item in the array:
                { 
                    temp = ((PriorityItem<T>) storage[index]).getPriority();  // Update the temporary variable with that which contains a higher priority value.
                    index = i;  // Update index value to item of highest value.
                }
            }
            return ((PriorityItem<T>) storage[index]).getItem();  // Return to the main program the item with the highest priority.
        }
    }

    /**
     * removes the highest priority item from the queue
     * (Doesn't currently work as 2nd temporary array doesn't store values)
     * 
     * @throws QueueUnderflowException 
     */
    @Override
    public void remove() throws QueueUnderflowException
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();
        }
        else
        {
            int index = 0;   // Variable storing the index position of item.
            for(int i = 0; i <= tailIndex; i++)  // For each item in the queue:
            {
                int temp = ((PriorityItem<T>) storage[tailIndex]).getPriority();  // Temporary variable storing priority of last item in queue, starting with tailIndex.
                while(temp > ((PriorityItem<T>) storage[index]).getPriority())  // If the priority of the temporary variable item is less than the next item in the array.
                { 
                    temp = ((PriorityItem<T>) storage[index]).getPriority();  // Update the temporary variable with that which contains a higher priority value.
                    index = i;  // Change index value to item of highest value.
                }
            }
            
            Object[] tmp1 = new Object[index];  // Temporary Array which holds all items before item to be removed.
            for(int i = 0; i < index; i++)
            {
                tmp1[i] = storage[i];
            }
           
            int length = tailIndex - index;  // variable storing the amount of items after the item to be removed.
            Object[] tmp2 = new Object[length];  // Temporary Array which holds all items after item to be removed.
            for(int i = tailIndex; i > index; i--)
            {
                tmp2[i] = storage[i];
            }
                        
            Object[] tmp3 = concat(tmp1, tmp2);  // combines both temporary arrays to form new array without highest priority item.
            storage = tmp3;  // Update storage array.
        }
    }
    
    /**
     * Concatenates two Object arrays.
     * 
     * @param a
     * @param b
     * @return 
     */
    public static Object[] concat(Object[] a, Object[] b)
    {
        Collection<Object> result = new ArrayList<>(a.length + b.length);  // Creates a new array with the combined lengths of two arrays.
        result.addAll(Arrays.asList(a));  // Adds the items from object array 'a' into new array.
        result.addAll(Arrays.asList(b));  // Adds the items from object array 'b' into new array.
        
        return result.toArray();  // Returns concatenated array.
    }
    
    /**
     * Checks to see if the array is empty using tailIndex.  
     * 
     * @return 
     */
    @Override
    public boolean isEmpty()
    {
       return tailIndex < 0;  // Return true if the array is empty.
    }
    
    /**
     * Formats the array into a String to make it easier to read.
     * 
     * @return 
     */
    @Override
    public String toString()
    {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {  
                result = result + ", ";
            }
            result = result + storage[i];  
        }
        System.out.println(Arrays.toString(storage));
        result = result + "]";
        return result;
    } 
}
