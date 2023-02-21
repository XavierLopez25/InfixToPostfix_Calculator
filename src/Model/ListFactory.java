package Model;

public class ListFactory {

    public IStack<Integer> getInstance(String selection){

        IStack<Integer> stack;

        switch (selection.toLowerCase()){

            case "arraylist":
                stack = new StackUsingArrayList<>();
                break;

            case "vector":
                stack = new StackUsingVector<>();
                break;

            default:
                stack = null;
                System.out.println("NO.");


        }

        return stack;

    }

}
