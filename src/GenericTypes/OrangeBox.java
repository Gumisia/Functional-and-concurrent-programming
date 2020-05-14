package GenericTypes;

public class OrangeBox<T extends Orange>{
    private T element;

    public OrangeBox(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

}