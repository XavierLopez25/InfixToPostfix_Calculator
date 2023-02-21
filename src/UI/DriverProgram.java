package View;

import Controller.Calculator;
import Model.ReadFile;

public class DriverProgram {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String postfix = ReadFile.text("C:\\Users\\thege\\GitAED\\CalculatorPostFix\\src\\View\\example.txt");
        Calculator calculator = new Calculator();
        System.out.println(postfix);

        System.out.println((Calculator.mainOperation(postfix)));
    }

}
