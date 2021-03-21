package com.app;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        MyGenericQueue<Integer> myQueue = new MyGenericQueue<>();

        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(15);
        myQueue.enqueue(20);
        myQueue.enqueue(25);

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue.count());

        myQueue.clear();

        System.out.println(myQueue);

        System.out.println("======================");


        MyGenericStack<Integer> myStack = new MyGenericStack<>();

        myStack.push(101);
        myStack.push(102);
        myStack.push(103);
        myStack.push(104);
        myStack.push(105);

        System.out.println(myStack);

        myStack.pop();

        System.out.println(myStack);

        System.out.println(myStack.peek());

        myStack.clear();

        System.out.println(myStack.count());

        System.out.println("======================");

        MyLimitedList<String> week = new MyLimitedList<>(7);

        week.addItem("Monday");
        week.addItem("Tuesday");
        week.addItem("Wednesday");
        week.addItem("Thursday");
        week.addItem("Friday");
        week.addItem("Saturday ");
        week.addItem("Sunday");

        System.out.println(week);

        week.addItem("Friday");

        System.out.println(week);

        System.out.println(week.getItem(6));

    }
}