package com.app;

import java.util.ArrayList;

public class MyQueue {

    ArrayList<String> queue = new ArrayList<>();

    public void enqueue (String x){
        queue.add(x);
    }

    public String dequeue (){
        String first_number = queue.get(0);
        queue.remove(0);
        return first_number;
    }

    public void clear(){
        queue.clear();
    }

    public int count(){
        return (int)queue.stream().count();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "numbers_queue=" + queue +
                '}';
    }
}
