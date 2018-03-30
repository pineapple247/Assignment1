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
public abstract class PriorityQueueTest {
    
    public PriorityQueue<Person> instance;
    
    public PriorityQueueTest() {
    }
        
    @Before
    public abstract void setUp();
    
//    /**
//     * Test of add method, of class PriorityQueue.
//     */
//    @Test
//    public void testAdd() throws Exception {
//        System.out.println("add");
//        Object item = null;
//        int priority = 0;
//        PriorityQueue instance = new PriorityQueueImpl();
//        instance.add(item, priority);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of head method, of class PriorityQueue.
//     */
//    @Test
//    public void testHead() throws Exception {
//        System.out.println("head");
//        PriorityQueue instance = new PriorityQueueImpl();
//        Object expResult = null;
//        Object result = instance.head();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class PriorityQueue.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        PriorityQueue instance = new PriorityQueueImpl();
//        instance.remove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of isEmpty method, of class PriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        //PriorityQueue instance = new PriorityQueueImpl();
        
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of toString method, of class PriorityQueue.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        PriorityQueue instance = new PriorityQueueImpl();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
