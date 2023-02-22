package Model;

/**
 * The interface Stack.
 *
 * @param <T> the type parameter
 */
public interface IStack<T> {

    /**
     * Count int.
     *
     * @return the int
     */
    int count();

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    boolean isEmpty();

    /**
     * Push.
     *
     * @param value the value
     */
    void push(T value);

    /**
     * Pull t.
     *
     * @return the t
     */
    T pull();

    /**
     * Peek t.
     *
     * @return the t
     */
    T peek();

}

//Decription: Código para lectura de archivo
//Author: Sebastian Huertas, Gerson Ramirez, Xavier Lopez - Hoja de Trabajo #2
//Date: 2023
//URL: https://github.com/Gxrco/CalculatorPostFix