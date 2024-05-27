package lab9_1;

import lab9_1.IQueue;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue {
    private int CAPACITY;
    private ArrayList<Object> items;
    public ArrayListQueue(int capacity){
        items = new ArrayList<>(capacity);
        this.CAPACITY = capacity;
    }
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }
    @Override
    public void enQueue(Object object) {
        if(isFull()){
            System.out.println("FULL");
        }
        else{
            items.add(object);
        }
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("EMPTY");
            return null;
        }
        else {
            return items.remove(0);
        }
    }


    @Override
    public void printQueue() {
        System.out.println("Sor: ");
        for (Object item : items){
            System.out.print(item + " ");
        }
        System.out.println();
    }


}
