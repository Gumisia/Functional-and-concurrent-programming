package GenericTypes;

public class FruitBox<T extends Fruit> {
    private T element;

    public FruitBox(T fruit) {
        this.element = fruit;
    }

    public T getFruit() {
        return element;
    }

    public void setFruit(T element) {
        this.element = element;
    }
}
