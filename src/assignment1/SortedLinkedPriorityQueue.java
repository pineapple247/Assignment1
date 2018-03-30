/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author 13005626
 */
public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T>
{
    private final ListNode<T> top;
    private final PriorityItem<T> pItem;
    
    public SortedLinkedPriorityQueue() 
    {
        top = null;
        pItem = null;
    }
    
    public SortedLinkedPriorityQueue(ListNode<T> top, PriorityItem<T> pItem)
    {
        this.top = top;
        this.pItem = pItem;
    }
    
    @Override
    public void add(T item, int priority)
    {
        
    }

    @Override
    public T head()
    {
        return (T) top.getItem();
    }
    
    @Override
    public void remove() 
    {
        
    }
    
    @Override
    public boolean isEmpty()
    {
        return top == null;
    }
    
    @Override
    public String toString()
    {
        
    }
}