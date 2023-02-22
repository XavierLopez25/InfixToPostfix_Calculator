package Model;

/**
 * The type Stack factory.
 */
public class StackFactory {

    /**
     * Get instance abstract stack.
     *
     * @param selection the selection
     * @return the abstract stack
     */
    public AbstractStack<Integer> getInstance(String selection){
        AbstractStack<Integer> stack = null;

        switch (selection){
            case "arraylist":
                stack = new StackUsingArrayList<>();
                break;

            case "vector":
                stack = new StackUsingVector<>();
                break;

            case "single":
                stack = new StackUsingList<>(selection);
                break;

            case "double":
                stack = new StackUsingList<>(selection);
                break;

            default:
                System.out.println("The entered option isn't valid.");
                break;
        }
        return stack;
    }

}
