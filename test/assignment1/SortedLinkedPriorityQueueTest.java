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
public class SortedLinkedPriorityQueueTest extends PriorityQueueTest
{
    
    public SortedLinkedPriorityQueueTest() {
    }
    
    @Before
    @Override
    public void setUp() {       
        instance = new SortedLinkedPriorityQueue<>();
    }


    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     * @throws assignment1.QueueOverflowException
     */
    @Test
    public void testAdd() throws QueueOverflowException {
        System.out.println("add");
        
        String name = "Callum";
        int priority = 1;
        Person person = new Person(name);
                
        instance.add(person, priority);
        
        String expResult = "(Callum, 1)";
        String result = instance.toString();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     * @throws assignment1.QueueOverflowException
     * @throws assignment1.QueueUnderflowException
     */
    @Test
    public void testHead() throws QueueOverflowException, QueueUnderflowException {
        System.out.println("head");
        
        String name = "Colin";
        int priority = 3;
        Person person = new Person(name);
        
        String name2 = "Stuart";
        int priority2 = 5;
        Person person2 = new Person(name2);
        
        String name3 = "Patrick";
        int priority3 = 1;
        Person person3 = new Person(name3);

        String name4 = "Sam";
        int priority4 = 2;
        Person person4 = new Person(name4);
        
        String name5 = "Megan";
        int priority5 = 4;
        Person person5 = new Person(name5);
        
        instance.add(person, priority);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person5, priority5);       
        
        String expResult = "Stuart";
        Object head = instance.head();
        String result = head.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     * @throws assignment1.QueueOverflowException
     * @throws assignment1.QueueUnderflowException
     */
    @Test
    public void testRemove() throws QueueOverflowException, QueueUnderflowException {
        System.out.println("remove");
        
        String name = "Colin";
        int priority = 3;
        Person person = new Person(name);
        
        String name2 = "Stuart";
        int priority2 = 5;
        Person person2 = new Person(name2);
        
        String name3 = "Patrick";
        int priority3 = 1;
        Person person3 = new Person(name3);

        String name4 = "Sam";
        int priority4 = 2;
        Person person4 = new Person(name4);
        
        String name5 = "Megan";
        int priority5 = 4;
        Person person5 = new Person(name5);
        
        instance.add(person, priority);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person5, priority5);       
        
        String expResult = "(Stuart, 5), (Megan, 4), (Colin, 3), (Sam, 2), (Partick, 1)";
        String result = instance.toString();
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SortedLinkedPriorityQueue.
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
        String name = "Colin";
        int priority = 3;
        Person person = new Person(name);
        
        instance.add(person, priority);
        
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
