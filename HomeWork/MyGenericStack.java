package com.app;

import java.util.ArrayList;

public class MyGenericStack<E> {

    ArrayList<E> stack  = new ArrayList<>();

    public void push (E x){
        stack.add(x);
    }

    public E pop (){
        E last_number = stack.get(stack.size()-1);
        stack.remove(stack .size()-1);
        return last_number;
    }

    public E peek (){
        return stack.get(stack.size()-1);
    }

    public void clear (){
        stack .clear();
    }

    public int  count (){
        return stack.size();
    }

    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }
}
