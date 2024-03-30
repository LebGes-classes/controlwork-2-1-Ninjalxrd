package org.example;

public class MyQueue <T>{
    Node <T> head;
    MyQueue() {}
    MyQueue (T ... data) {
        head = new Node<T>(data[0]);
        Node<T> cur = head;
        for (int i = 1; i < data.length; i++) {
            cur.next = new Node<T>(data[i]);
            cur = cur.next;
        }
    }
    public String add (T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node<>(data);
        }
        return " object added";
    }


    public String remove () {
        head = head.next;
        return "first object is removed";
    }


    public Object poll() { // забираем по индексу
        head = head.next;
        return head;
    }

    public Object peek (int index) {
        return head;
    }
}
