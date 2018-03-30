/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

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
public class UnsortedLinkedPriorityQueueTest extends PriorityQueueTest 
{
    
    public UnsortedLinkedPriorityQueueTest() {
    }

    @Before
    @Override
    public void setUp() {
        instance = new UnsortedLinkedPriorityQueue<>();
    }

    /**
     * Test of add method, of class UnsortedLinkedPriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testAdd() throws QueueOverflowException {
        System.out.println("add");
        
        
        String name = "Percy";
        int priority = 2;
        Person person = new Person(name);
                
        instance.add(person, priority);
        
        String expResult = "(Percy, 2)";
        String result = instance.toString();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of head method, of class UnsortedLinkedPriorityQueue.
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
        Object head = instance.head();
        String result = head.toString();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UnsortedLinkedPriorityQueue.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        
        String name = "Bob";
        int priority = 2;
        Person person = new Person(name);
        
        String name2 = "Sarah";
        int priority2 = 1;
        Person person2 = new Person(name2);
        
        String name3 = "Jack";
        int priority3 = 4;
        Person person3 = new Person(name3);

        instance.add(person, priority);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        
        instance.remove();
        
        String expResult = "Bob, Sarah";
        String result = instance.toString();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class UnsortedLinkedPriorityQueue.
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
     * Test of toString method, of class UnsortedLinkedPriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        
        String name = "Bob";
        int priority = 2;
        Person person = new Person(name);
        
        String name2 = "Sarah";
        int priority2 = 1;
        Person person2 = new Person(name2);
        
        String name3 = "Jack";
        int priority3 = 4;
        Person person3 = new Person(name3);

        instance.add(person, priority);
        instance.add(person2, priority2);
        instance.add(person3, priority3);

        
        String expResult = "(Bob, 2), (Sarah, 1), (Jack, 4)";
        String result = instance.toString();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}