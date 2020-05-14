package GenericTypes;

public class Apple implements Fruit{
    String name = "apple";

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
