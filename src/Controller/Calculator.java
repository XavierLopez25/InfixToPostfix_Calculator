package Controller;

import Model.PostfixCalculator;
import Model.Stack;

import java.util.ArrayList;

public class Calculator {
    /**
     *
     */
    private static Stack<Integer> stackuwu_nia;

    static PostfixCalculator pc = new PostfixCalculator();

    /**
     * Constructor
     */
    public Calculator(){
        stackuwu_nia = new Stack<Integer>();
    }

    /**
     * Realiza las operaciones segun los numeros en el Stack
     * @param operator
     * @param A
     * @param B
     */
    public static void getValue(String operator, int A, int B){
        switch(operator){
            case "+":
                stackuwu_nia.push(pc.suma(A, B));
                break;

            case "-":
                stackuwu_nia.push(pc.resta(A, B));
                break;

            case "*":
                stackuwu_nia.push(pc.multiplicacion(A, B));
                break;

            case "/":
                stackuwu_nia.push(pc.division(A, B));
                break;
        }
    }

    /**
     * Realiza e introduce la expresion postfix al Stack, haciendo las operaciones necesarias
     * @param postfix
     * @return
     */
    public static int mainOperation(String postfix){
        ArrayList<String> data = pc.getItems(postfix);
        for (String datum : data) {
            if (!pc.isOperator(datum)) {
                stackuwu_nia.push(Integer.valueOf(datum));
            }
        }

        for (String datum : data) {
            if (pc.isOperator(datum)) {
                int A = stackuwu_nia.pull();
                int B = stackuwu_nia.pull();
                getValue(datum, A, B);
            }
        }

        return stackuwu_nia.pull();
    }

}
