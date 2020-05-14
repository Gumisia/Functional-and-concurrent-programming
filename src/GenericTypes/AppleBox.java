package GenericTypes;

public class AppleBox<T extends Apple> {
    private T element;

    public AppleBox(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
