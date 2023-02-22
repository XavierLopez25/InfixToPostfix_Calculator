package Model;

import java.util.ArrayList;
import java.util.Collections;

public class StackUsingArrayList<T> extends AbstractStack<T> {
    /**
     *
     */
    private ArrayList<T> myList;

    /**
     *Constructor de un stack
     */
    public StackUsingArrayList() {
        myList = new ArrayList<T>();
    }

    /**
     * Cuenta la cantidad de elementos en un StackUsingArrayList
     * @return myList.size
     */
    @Override
    public int count() {
        return myList.size();
    }

    /**
     * Revisa si la StackUsingArrayList esta vacia
     * @return
     */
    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    /**
     * Añade un elemento al StackUsingArrayList
     * @param value
     */
    @Override
    public void push(Object value) {
        myList.add(0, (T) value);
    }

    /**
     * Retira un elemento del StackUsingArrayList
     * @return
     */
    @Override
    public T pull() {
        return myList.remove(0);
    }

    /**
     * Llama al ultimo objeto ingresado al StackUsingArrayList
     * @return
     */
    @Override
    public T peek() {
        return myList.get(0);
    }

    @Override
    public String toString(){
        Collections.reverse(myList);
        return myList.toString();
    }
}

