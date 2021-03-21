package com.app;

import java.util.ArrayList;

public class MyLimitedList<E> {

    protected ArrayList<E> m_items = new ArrayList<>();
    protected final int  m_max_items;

    public MyLimitedList(int m_max_items) {
        this.m_max_items = 7;
    }

    public void addItem (E item){
        if (m_items.size() == m_max_items){
            removeFirstItem();
        }
        m_items.add(item);
    }

    public E getItem  (int index){
        return m_items.get(index);
    }

    public void removeFirstItem (){
        m_items.remove(0);
    }

    @Override
    public String toString() {
        return "MyLimitedList{" +
                "m_items=" + m_items +
                ", m_max_items=" + m_max_items +
                '}';
    }
}
