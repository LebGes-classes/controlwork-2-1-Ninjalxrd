package org.example;

import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    public MyQueue<String> queue = new MyQueue<>();
    @BeforeEach
    void setQ(){
        queue = new MyQueue<>();
    }

    @Test
    void testAdd() {
        queue.add("x");
        assertEquals("x", queue.peek(0));
    }


//    void testRemove() {
//        queue.add("test");
//        queue.remove();
//        assertTrue(queue.isEmpty());
//    }

    @Test
    void testPeek() {
        queue.add("test");
        assertEquals("test", queue.peek(0));
    }


//    void testPoll() {
//        queue.add("test");
//        assertTrue(queue.isEmpty());
//    }
}