/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author 13005626
 * @param <T>
 */
public class ListNode<T>
{
    private final PriorityItem<T> item;
    private final ListNode<T> next;
    private ListNode<T> first;
    
    public ListNode(PriorityItem<T> item, ListNode<T> next)
    {
        this.item = item;
        this.next = next;
    }
    
    public PriorityItem<T> getItem()
    {
        return item;
    }
    
    public void setFirst(ListNode f)
    {
        first = f;
    }
    
    public ListNode<T> getFirst()
    {
        return first;
    }
    
    public ListNode<T> getNext()
    {
        return next;
    }
    
    public boolean isEmpty()
    {
        return first == null;
    }
}