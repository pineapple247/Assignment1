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
public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T>
{
    //private ListNode<T> node;
    private PriorityItem<T> p;
    
    public UnsortedLinkedPriorityQueue() 
    {
     //   node = null;
        p = null;
    }
    
    @Override
    public void add(T item, int priority)
    {
       // link = new ListNode<>(item, next);
      //  node = new ListNode<>(item, next);
        p = new PriorityItem<>(item, priority);
    }
    
    // WRONG, NEEDS TO FIND ITEM WITH HIGHEST PRIORITY
    @Override
    public T head() throws QueueUnderflowException
    {
        if(isEmpty())
        {
           throw new QueueUnderflowException();
        }
        else
        {
            int temp = 0;
            while(p.getPriority() > temp)
            {
                temp = p.getPriority();
            }
            return p.getItem();
            //
           /* int temp = p.getPriority();
            for(int i=0; i < temp; i++)
            {
                
            }
            return p.getItem();*/
            // temp = 5;
            /*
            public PriorityItem(T item, int priority) 
            {
                this.item = item;
                this.priority = priority;
            }
            */
            /*for(int i = 0; i < p.getPriority(); i++)
            {
                node.getNext();
                
            }
            return node.getItem();*/
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
            //node = (ListNode<T>) node.getItem();
            p = (PriorityItem<T>) p.getItem();
        }
    }
    
    @Override
    public boolean isEmpty()
    {
       return p == null;
    }
    
    @Override
    public String toString()
    {
      String result = "[";
      for(int i = 0; i <= p.getPriority(); i++)
      {
          if(i > 0)
          {
              result = result + ", ";
          }
          result = result + p.getItem();
      }
      result = result + "]";
      return result;
    }
}