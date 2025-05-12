package com.Queue;
import java.util.Queue;         //  Import Queue interface
import java.util.LinkedList;
public class BasicsQ {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(56);
        queue.add(4);
        queue.add(12);
        System.out.println(queue);
    }
}
