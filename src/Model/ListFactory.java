package Model;

/**
 * The type List factory.
 *
 * @param <T> the type parameter
 */
public class ListFactory<T> {

    /**
     * Get instance abstract list.
     *
     * @param selection the selection
     * @return the abstract list
     */
    public AbstractList<T> getInstance(String selection){

        AbstractList<T> list = null;

        switch (selection.toLowerCase()) {

            case "single":
                list = new SingleLinkedList<>();
                break;

            case "double":
                list = new DoubleLinkedList<>();
                break;

        }

        return list;

    }

}
