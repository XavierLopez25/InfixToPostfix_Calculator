package Controller;

import Model.IStack;
import Model.PostfixCalculator;
import Model.StackUsingArrayList;

public class Calculator {

    static PostfixCalculator pc = new PostfixCalculator();

    /**
     * Constructor
     */


    public int postfixEvaluation(String postfix, IStack<Integer> stack){
        int  result = 0;
        //step 1
        postfix = postfix.concat(String.valueOf(')'));
        //step 2
        for (int i = 0; i < postfix.length(); i++) {
            char character = postfix.charAt(i);
            if(Character.isDigit(character)){
                stack.push(Integer.valueOf(Character.toString(character)));
            }else if(pc.isOperator(String.valueOf(character))){
                int second = stack.pull();
                int first = stack.pull();
                stack.push(evaluate(first, second,character));
            }
        }

        result = stack.peek();
        return result;

    }

    private int evaluate(int first, int second, char operator){
        int result = 0;
        switch (operator) {
            case '/':
                result = pc.division(first,second);
                break;
            case '*':
                result = pc.multiplicacion(first,second);
                break;
            case '+':
                result = pc.suma(first,second);
                break;
            case '-':
                result = pc.resta(first, second);
        }
        return result;
    }

}
