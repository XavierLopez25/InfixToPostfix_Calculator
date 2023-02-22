package Model;

public class ListFactory<T> {

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
