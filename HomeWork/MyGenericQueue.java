package com.app;

import java.util.ArrayList;

public class MyGenericQueue<E> {

    ArrayList<E> queue = new ArrayList<>();

    public void enqueue (E x){
        queue.add(x);
    }

    public E dequeue (){
        E first_number = queue.get(0);
        queue.remove(0);
        return first_number;
    }

    public void clear(){
        queue.clear();
    }

    public int count(){
        return queue.size();
    }

    @Override
    public String toString() {
        return "MyGenericQueue{" +
                "queue=" + queue +
                '}';
    }
}
