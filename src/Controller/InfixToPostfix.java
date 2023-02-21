package Controller;

import Model.StackUsingArrayList;

public class InfixToPostfix {

    public String infixToPostfix(String infixString){
        String postfix = "";
        StackUsingArrayList<Character> stack = new StackUsingArrayList<>();
        //step 1
        stack.push('(');
        infixString = infixString.concat(String.valueOf(')'));
        //step 2
        for (int i = 0; i < infixString.length() ; i++) {
            char character = infixString.charAt(i);
            //step 3
            if(Character.isAlphabetic(character) || Character.isDigit(character)){
                postfix = postfix.concat(String.valueOf(character));
            }
            //step 4
            else if(character == '('){
                stack.push(character);
            }
            //step 5
            else if(isOperator(character)){
                while(!stack.isEmpty()){
                    if(precedence(stack.peek()) >=
                            precedence(character) ){
                        postfix = postfix.concat(String.valueOf(stack.pull()));
                    }
                    else{
                        stack.push(character);
                        break;
                    }
                }
            }
            //step 6
            else if(character == ')'){
                while (!stack.isEmpty()){
                    if(stack.peek() != '('){
                        postfix = postfix.concat(String.valueOf(stack.pull()));
                    }
                    else{
                        stack.pull();
                        break;
                    }
                }
            }
        }
        return postfix;
    }
    private boolean isOperator(char character){
        boolean response = false;
        switch (character){
            case '/':
            case '*':
            case '+':
            case '-':
                response = true;
        }

        return response;
    }
    private int precedence(char operator){
        int response = 0;
        switch (operator){
            case '/':
            case '*':
                response = 2;
                break;
            case '+':
            case '-':
                response = 1;
        }
        return response;
    }

}

