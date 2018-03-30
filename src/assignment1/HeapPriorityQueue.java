/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 13005626
 * @param <T>
 */

public class HeapPriorityQueue<T> implements PriorityQueue<T>
{
    private Object[] heap; // Array
    private int size; // Length of array
    
    public HeapPriorityQueue(int capacity)
    {
        heap = new Object[capacity];
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException
    {
        if(isFull())
        {
            throw new QueueOverflowException();
        }
        else
        {
            heap[size] = new PriorityItem<>(item, priority);
            fixAbove(size);
            size++;
        }
    }
    
    public void fixAbove(int index)
    {
        PriorityItem newValue = (PriorityItem) heap[index];
        PriorityItem Parent = (PriorityItem) heap[Parent(index)];
        int valuePriority = newValue.getPriority();
        int parentPriority = Parent.getPriority();
        System.out.println("newValue: " + newValue);
        System.out.println("Parent: " + Parent);
        System.out.println();

            while(index > 0 && valuePriority > parentPriority)
            {
                heap[index] = heap[Parent(index)];
                index = Parent(index);
            }
            heap[index] = newValue;
    }
    
    public void fixBelow(int index)
    {
        int childToSwap;  // index position of child to swap
        
        // get priority of item at index position
        PriorityItem index1 = (PriorityItem) heap[index];
        int indexPriority = index1.getPriority();
        
        // left child
        int leftChild = leftChild(index);
        System.out.println("index: " + index);
        System.out.println("Left: " + leftChild);
        PriorityItem leftChild1 = (PriorityItem) heap[leftChild];
        //int leftChildPriority = leftChild1.getPriority();   
        
        // right child
        int rightChild = rightChild(index);
        //PriorityItem rightChild1 = (PriorityItem) heap[rightChild];
        //int rightChildPriority = rightChild1.getPriority();

        if(leftChild <= index)
        {
            if(rightChild > index)
            {
                 childToSwap = leftChild;
            }
            else
            {
                childToSwap = rightChild;
                // childToSwap = (leftChildPriority > rightChildPriority);
            }
            //childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);

            PriorityItem swapPriority = (PriorityItem) heap[childToSwap];
            int swapPriority1 = swapPriority.getPriority();

            if(indexPriority < swapPriority1)
            {
                Object temp = heap[index];
                heap[index] = heap[childToSwap];
                heap[childToSwap] = temp;
            }
        } 
    }
    
    private int Parent(int index) 
    {
        return (index - 1) / 2;
    }
    
    public int leftChild(int index)
    {
        return (2 * index) + 1;
    }
    
    public int rightChild(int index)
    {
        return (2 * index) + 2;
    }
    
    @Override
    public T head() throws QueueUnderflowException
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();
        }
        else
        {
            return ((PriorityItem<T>) heap[0]).getItem();  // doesnt work :(
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
            PriorityItem index = (PriorityItem) heap[0];
            PriorityItem parent = (PriorityItem) heap[Parent(0)];
            int parentPriority = parent.getPriority();
            int indexPriority = index.getPriority();
            //heap[0] = heap[size - 1];
            
            if(indexPriority < parentPriority)
            {
                fixBelow(0);
            }
            else
            {
                fixAbove(0);
            }

            Object[] heap2 = Arrays.copyOfRange(heap, 1, heap.length);
            heap = heap2;
            size--;
        }
    }

    
    
    public boolean isFull()
    {
        return size == heap.length;
    }
    
    @Override
    public boolean isEmpty()
    {
       return heap == null;
    }
    
    @Override
    public String toString()
    {
        String result = "[";
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + heap[i];
        }
        result = result + "]";
        System.out.println(result);
        return result;  // Doesn't seem to be returning.
    }
}    
    
    










    
   /* 
    private ArrayList<T> heap;
    
    public HeapPriorityQueue()
    {
        this.heap = new ArrayList<T>();
    }
    
    public HeapPriorityQueue(ArrayList<T> items) 
    {
        this.heap = items;
        buildHeap();
    }
    
    public void buildHeap()
    {
        for(int i = heap.size() / 2; i >=0; i--)
        {
            minHeapify(i);
        }
    }
    
    public T extractMin() throws QueueUnderflowException 
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();   
        }
        else if(heap.size() == 1)
        {
            T min = heap.remove(0);
            return min;
        }
        T min = heap.get(0);
        T lastItem = heap.remove(heap.size() - 1);
        heap.set(0, lastItem);
        
        // bubble down
        minHeapify(0);
        
        // return minimum value
        return min;
    }
    
    public void minHeapify(int index)
    {
        int leftIndex = leftIndex(index);
        int rightIndex = rightIndex(index);
        int min = -1;

        // find min index between current & child node
        if(leftIndex <= heap.size() - 1 && heap.get(leftIndex) < /* this part is wrong -->*/ 


/*heap.get(index))
        {
            min = leftIndex;
        }    
        else
        {
            min = index;
        }
        
        
    }
    
    private int leftIndex(int index)
    {
        return 2 * index + 1;
    }
    
    private int rightIndex(int index)
    {
        return 2 * index + 2;
    }        
    
    private int parent(int index)
    {
        if (index % 2 == 1) {
            return index / 2;
        }

        return (index - 1) / 2;
    }
    
    @Override
    public void add(T item, int priority)
    {
        // need to implement priority
        heap.add(priority, item);
        int index = heap.size() - 1;
        int parent = parent(index);
        int size = heap.size();
        
       // while(parent != index && heap.get(index) < heap.get(parent)
       // {
        while(size > 0 && priority > heap.)
        {
            swap(index, parent);
            index = parent;
            parent = parent(index);
        }
      //  }
    }
    
    private void swap(int i, int parent)
    {
        T temp = heap.get(parent);
        heap.set(parent, heap.get(i));
        heap.set(i, temp);
    }
    
    @Override
    public T head()
    {
        return heap.get(0);
    }
    
    @Override
    public void remove() throws QueueUnderflowException 
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();   
        }
        else if(heap.size() == 1)
        {
           T min = heap.remove(0);
            
       }
        //T min = heap.get(0);
        T lastItem = heap.remove(heap.size() - 1);
        heap.set(0, lastItem);
        
        // bubble down
        minHeapify(0);
    }
    
    @Override
    public boolean isEmpty()
    {
       return heap == null;
    }
    
    @Override
    public String toString()
    {
        
    }*/
