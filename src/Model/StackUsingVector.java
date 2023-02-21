package Model;

import java.util.ArrayList;
import java.util.Vector;
public class StackUsingVector<T> implements  IStack<T>{

    private Vector<T> myVector;

    /**
     *Constructor de un stack
     */
    public StackUsingVector() {
        myVector = new Vector<T>();
    }

    @Override
    public int count() {
        return myVector.size();
    }

    @Override
    public boolean isEmpty() {
        return myVector.isEmpty();
    }

    @Override
    public void push(T value) {
        myVector.add(value);
    }

    @Override
    public T pull() {
        return myVector.remove(myVector.size()-1);
    }

    @Override
    public T peek() {
        return myVector.get(myVector.size()-1);
    }
}
