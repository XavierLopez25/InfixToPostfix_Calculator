package Model;

import java.util.ArrayList;

public class Stack<T> implements IStack<T>{
    /**
     *
     */
    private ArrayList<T> myList;

    /**
     *Constructor de un stack
     */
    public Stack() {
        myList = new ArrayList<T>();
    }

    /**
     * Cuenta la cantidad de elementos en un Stack
     * @return myList.size
     */
    @Override
    public int count() {
        return myList.size();
    }

    /**
     * Revisa si la Stack esta vacia
     * @return
     */
    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    /**
     * Añade un elemento al Stack
     * @param value
     */
    @Override
    public void push(T value) {
        myList.add(0, value);
    }

    /**
     * Retira un elemento del Stack
     * @return
     */
    @Override
    public T pull() {
        return myList.remove(0);
    }

    /**
     * Llama al ultimo objeto ingresado al Stack
     * @return
     */
    @Override
    public T peek() {
        return myList.get(0);
    }
}

