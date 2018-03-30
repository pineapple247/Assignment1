/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
public class UnsortedArrayPriorityQueueTest extends PriorityQueueTest{
    
    public UnsortedArrayPriorityQueueTest() {
    }
    
    @Before
    @Override
    public void setUp() {
        instance = new UnsortedArrayPriorityQueue<>(5);
    }

    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
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
       //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemove() throws Exception {
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
        
        String expResult = "[(Bob, 1), (Sarah, 3), (Jack, 2), (Smith, 4)]";
        String result = instance.toString();
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of concat method, of class UnsortedArrayPriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testConcat() throws QueueOverflowException {
        System.out.println("concat");
        
        Object[] a = null;
        Object[] b = null;
        

        Object[] expResult = concat(a, b);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    @Override
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
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
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");

        String name = "Andrew";
        int priority = 2;
        Person person = new Person(name);
        
        String name2 = "Percy";
        int priority2 = 3;
        Person person2 = new Person(name2);
        
        String name3 = "Julian";
        int priority3 = 1;
        Person person3 = new Person(name3);
        
        String name4 = "Barry";
        int priority4 = 4;
        Person person4 = new Person(name4);
        
        instance.add(person, priority);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        
        String expResult = "[(Andrew, 2), (Percy, 3), (Julian, 1), (Barry, 4)]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
