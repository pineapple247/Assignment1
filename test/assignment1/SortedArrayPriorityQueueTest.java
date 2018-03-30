/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 13005626
 */
public class SortedArrayPriorityQueueTest extends PriorityQueueTest 
{
    
    public SortedArrayPriorityQueueTest() {
    }

    @Before
    @Override
    public void setUp() {
        instance = new SortedArrayPriorityQueue<>(5);
    }

    /**
     * Test of add method, of class PriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testAdd() throws QueueOverflowException {
        System.out.println("add");
        String name = "Bob";
        int priority = 1;
        Person person = new Person(name);
        
        instance.add(person, priority);
        String expResult = "[(Bob, 1)]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of head method, of class SortedArrayPriorityQueue.
     * @throws assignment1.QueueUnderflowException
     * @throws java.lang.Exception
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        String name = "Bob";
        int priority = 2;
        Person person = new Person(name);
        
        String name2 = "Sarah";
        int priority2 = 1;
        Person person2 = new Person(name2);
        
        String name3 = "Jack";
        int priority3 = 4;
        Person person3 = new Person(name3);

        String name4 = "Smith";
        int priority4 = 3;
        Person person4 = new Person(name4);
        
        String name5 = "Andrew";
        int priority5 = 5;
        Person person5 = new Person(name5);
        
        instance.add(person, priority);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person5, priority5);
        
        String expResult = "Andrew";
        Person head = instance.head();
        String result = head.toString();
        
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     /*
     * Test of head method if empty, of class SortedArrayPriorityQueue.
     * @throws assignment1.QueueUnderflowException
     */
    @Test(expected = QueueUnderflowException.class)
    public void testEmptyHead() throws QueueUnderflowException 
    {
        System.out.println("Empty Head");
        Person result = instance.head();
    }
    
    /**
     * Test of remove method, of class SortedArrayPriorityQueue.
     * @throws assignment1.QueueUnderflowException
     */
    @Test
    public void testRemove() throws Exception 
    {
        System.out.println("remove");

        String name = "Bob";
        int priority = 1;
        Person person = new Person(name);
        
        String name2 = "Sarah";
        int priority2 = 3;
        Person person2 = new Person(name2);
        
        String name3 = "Jack";
        int priority3 = 2;
        Person person3 = new Person(name3);
        
        String name4 = "Smith";
        int priority4 = 4;
        Person person4 = new Person(name4);

        String name5 = "Andrew";
        int priority5 = 5;
        Person person5 = new Person(name5);
        
        instance.add(person, priority);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person5, priority5);
        instance.remove();        
        
        String expResult = "[(Smith, 4), (Sarah, 3), (Jack, 2), (Bob, 1)]";
        String result = instance.toString();
        
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method if so return true, of class SortedArrayPriorityQueue.
     */
    @Test
    @Override
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     /**
     * Test of isEmpty method if not return false, of class SortedArrayPriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testIsNotEmpty() throws QueueOverflowException {
        System.out.println("isNotEmpty");
        String name = "Bob";
        int priority = 1;
        Person person = new Person(name);
        
        instance.add(person, priority);
        
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class SortedArrayPriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        
        String name = "Bob";
        int priority = 1;
        Person person = new Person(name);
        instance.add(person, priority);
        
        String name2 = "Sarah";
        int priority2 = 3;
        Person person2 = new Person(name2);
        instance.add(person2, priority2);
        
        String name3 = "Mike";
        int priority3 = 2;
        Person person3 = new Person(name3);
        instance.add(person3, priority3);
        
        String expResult = "[(Sarah, 3), (Mike, 2), (Bob, 1)]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
