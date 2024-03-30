package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {326,123,767,577,666,767,997,356,254,345,56,454};
        MyQueue <Integer> queueByNumber = new MyQueue<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(queueByNumber.add(numbers[i])); //добавляем в очередь машины по номерам
        }
        System.out.println(queueByNumber.remove());
        System.out.println(queueByNumber.peek(6));
        System.out.println(queueByNumber.poll());


    }
}