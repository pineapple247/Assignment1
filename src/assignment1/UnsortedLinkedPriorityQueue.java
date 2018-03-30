/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13005626
 * @param <T>
 */
public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T>
{
    private ListNode<T> top;
    private PriorityItem<T> pItem;
    
    //default constructor
    public UnsortedLinkedPriorityQueue()
    {
        top = null;
        pItem = null;
    }
    
    //constructor
    public UnsortedLinkedPriorityQueue(ListNode top, PriorityItem pItem) 
    {
        this.top = top;
        this.pItem = pItem;
    }
    
    @Override
    public void add(T item, int priority)
    {
        pItem = new PriorityItem<>(item, priority);
        if(isEmpty())
        {
            top = new ListNode<>(pItem, null);
            top.setFirst(top);
        }
        else
        {
            ListNode tmp = top;
            top = new ListNode<>(pItem, tmp);
        }
    }
    
    // WRONG, NEEDS TO FIND ITEM WITH HIGHEST PRIORITY
    @Override
    public T head() throws QueueUnderflowException
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();
        }
        else if(top.getNext() == null)
        {
            return (T) top.getItem();
        }
        else
        {
            int count = 0;
            for(int i = 0; i <= count; i++)
            {
                ListNode<T> nextNode = top.getNext();
                PriorityItem<T> nextItem = nextNode.getItem();
                if(top.getItem().getPriority() > nextItem.getPriority())
                {
                    nextNode = top.getNext().getNext();
                    top = nextNode;
                    count++;
                    System.out.println("if: "+top);
                }
                else
                {
                    top = top.getNext().getNext();
                }
            }
            return (T) top.getItem();
            
           // int p1 = top.getItemPriority();
          /*  PriorityItem Item = top.getItem();
            int Priority = Item.getPriority();
        
            ListNode<T> nextNode = top.getNext();
            PriorityItem nextItem = nextNode.getItem();
            int nextPriority = nextItem.getPriority();
            
            
            
            for(int i = 0; i < Priority; i++)
            {
                while(Priority > nextPriority)
                {
                    nextNode = nextNode.getNext();
                }
            }
            return (T) nextNode.getItem();*/
        }
    }
    
    @Override
    public void remove() throws QueueUnderflowException
    {
        if(isEmpty())
        {
           throw new QueueUnderflowException();            
        }
        else
        {
            // This is removing first node not node with highest priority
            pItem = (PriorityItem<T>) pItem.getItem();
            top = top.getNext();
        }
    }
    
    @Override
    public boolean isEmpty()
    {
       return top == null;
    }
    
    @Override
    public String toString()
    {

            int count = 1;
            while(top.getItem() != null)
            {
                count++;
            }

            String result = "[";
            for(int i = 0; i <= count; i++)
            {
               if(i > 0)
               {
                   result = result + ", ";
               }
               result = result + top.getItem();
               top = top.getNext();
            }
            result = result + "]";
        return result;
    }
}
