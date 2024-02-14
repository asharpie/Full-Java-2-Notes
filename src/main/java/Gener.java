
public class Gener<T> {
    /** The angle brackets MUST come after the class name
     Letters used by Generic classes
     T stands for Type the most commonly used
     E for element
     K for key
     V for value
     N for number */

    private T element;
    private Gener<T> next;
    private Gener<T> previous;

    public Gener() {
        element = null;
        next = null;
    }

    public Gener(T ele) {
        element = ele;
        next = null;
    }

    public void setElement(T ele) {
        element = ele;
    }
    public T getElement() {
        return element;
    }

    public void setNext(Gener<T> n){
        next = n;
    }
    public Gener<T> getNext(){
        return next;
    }


    @Override
    public String toString() {
//        return "Gener element: " + element;
        return "Gener element: " + element + " ---> the next element " + next;
    }

}