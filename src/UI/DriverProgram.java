package UI;

import Controller.Calculator;
import Controller.InfixToPostfix;
import Controller.RW_File;
import Model.IStack;
import Model.StackFactory;
import java.util.Scanner;

public class DriverProgram {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        Calculator calculator = Calculator.getInstance();
        RW_File rwFile = new RW_File();

        String stackModel = displayMenu(sc);
        String postfixExp;
        String infixExp;
        String endProgram;
        StackFactory sF = new StackFactory();
        IStack<Integer> stack;

        stack = sF.getInstance(stackModel);
        infixExp = rwFile.readInfixFromFile();
        postfixExp = infixToPostfix.infixToPostfix(infixExp);

        System.out.println("\nThe Infix expression: " + infixExp);
        System.out.println("\nThe Postfix expression converted from Infix: " + postfixExp);
        System.out.println("\nThe result of the expression: " + postfixExp + ", is: " +calculator.postfixEvaluation(postfixExp, stack) + ".");
        System.out.println("\nPlease write any letter to end the program. ");

        endProgram = sc.nextLine();

    }

    public static String displayMenu(Scanner sca){

        String modelStructure;
        String listType;

        System.out.println();
        System.out.println(" Welcome to the Infix to Postfix converter and Postfix Calculator. \n Please select one model for the Stack Data Structure you want to begin with: ");
        System.out.println("\t1. Stack Using Vector.\n\t2. Stack Using ArrayList.\n\t3. Stack Using List.");

        modelStructure = sca.nextLine();

        switch (modelStructure){

            case "1":
                return "vector";

            case "2":
                return "arraylist";

            case "3":
                System.out.println(" You choosed Stack Using List. Now please select one option: ");
                System.out.println("\t1. SingleLinkedList.\n\t2. DoubleLinkedList.");

                listType = sca.nextLine();

                switch (listType){

                    case "1":
                        return "single";

                    case "2":
                        return "double";

                }
        }

        return "0";

    }
}
