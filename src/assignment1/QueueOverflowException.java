/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 * @author 13005626
 * 
 * Queue is full.
 *
 * Cannot accept a new item.
 */
public class QueueOverflowException extends Exception {

    public QueueOverflowException() {
        super("Queue is full");
    }
}
