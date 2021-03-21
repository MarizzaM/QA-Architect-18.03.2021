package com.app;

import java.util.ArrayList;

public class MyStack {
    ArrayList<String> stack  = new ArrayList<>();

    public void push (String x){
        stack.add(x);
    }

    public String pop (){
        String last_number = stack.get(stack.size()-1);
        stack.remove(stack .size()-1);
        return last_number;
    }

    public String peek (){
        return stack.get(stack.size()-1);
    }

    public void clear (){
        stack .clear();
    }

    public int  count (){
       return (int)stack.stream().count();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "numbers_stack=" + stack  +
                '}';
    }
}
