package UnitTesting;

import Controller.Calculator;
import Controller.InfixToPostfix;
import Model.IStack;
import Model.StackFactory;
import Model.StackUsingArrayList;
import Model.StackUsingList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Calculator test.
 */
class CalculatorTest {

    /**
     * Postfix evaluation.
     */
    @org.junit.jupiter.api.Test
    void postfixEvaluation() {

        StackFactory sF = new StackFactory();
        IStack<Integer> stack;
        String stackModel = "vector";
        stack = sF.getInstance(stackModel);
        Calculator calculator = Calculator.getInstance();
        assertEquals(182, calculator.postfixEvaluation("223+6*6*+", stack));


    }

    /**
     * Infix to postfix.
     */
    @org.junit.jupiter.api.Test
    void infixToPostfix() {

        InfixToPostfix iTP = new InfixToPostfix();
        assertEquals("223+6*6*+", iTP.infixToPostfix(" 2 + ( ( 2 + 3 ) * 6 ) * 6"));

    }

    /**
     * Test lista y pila.
     */
    @org.junit.jupiter.api.Test
    void TestListaYPila() {

        StackUsingArrayList<Integer> suAL = new StackUsingArrayList<>();
        StackUsingList<Integer> suL = new StackUsingList<>("double");

        suAL.push(60);

        assertEquals(60, suAL.peek());

        assertTrue(suL.isEmpty());

    }


}