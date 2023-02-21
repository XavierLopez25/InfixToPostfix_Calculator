package UI;

import Controller.Calculator;
import Controller.InfixToPostfix;
import Model.ReadFile;

import java.util.Scanner;

public class DriverProgram {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//        String postfix = ReadFile.text("path");


        Scanner sc = new Scanner(System.in);
        InfixToPostfix iTP = new InfixToPostfix();
        Calculator calculator = new Calculator();



        //System.out.println((calculator.postfixEvaluation(iTP.infixToPostfix(" 2 + ( ( 2 + 3 ) * 6 ) * 6"))));


    }

    public void displayMenu(Scanner sca){

        String modelStructure = "";
        String listType = "";

        System.out.println("Welcome to the Infix to Postfix converter and Postfix Calculator. \nPlease select one model for the Stack Data Structure you want to begin with: ");
        System.out.println("1. Stack Using Vector.\n2.Stack Using ArrayList.\n3. Stack Using List");

        modelStructure = sca.nextLine();

        switch (modelStructure){

            case "1":
                System.out.println("You choosed Stack Using Vector.");
                break;

            case "2":
                System.out.println("You choosed Stack Using ArrayList.");

            case "3":
                System.out.println("You choosed Stack Using List. Now please select one option: ");
                System.out.printf("\t 1. SingleLinkedList.");
                System.out.println("\t2. DoubleLinkedList.");

                listType = sca.nextLine();

                switch (listType){

                    case "1":
                        System.out.println("You selected Stack Using SingleLinkedList.");

                    case "2":
                        System.out.println("You selected Stack Using DoubleLinkedList.");

                }
        }
    }

}
