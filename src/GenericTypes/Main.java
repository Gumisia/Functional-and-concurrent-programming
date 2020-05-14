package GenericTypes;


public class Main {
    public static void main(String[] args) {

        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();

        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<Orange>(new Orange());

        Orange fruit = orangeBox.getFruit();

        System.out.println(fruit);

        // nested generic types
        Pair<BoxOnSteroids<Orange>, BoxOnSteroids<Apple>> pairOnBoxes =
                new Pair<>(
                        new BoxOnSteroids<>(new Orange()),
                        new BoxOnSteroids<>(new Apple())
                );

        BoxOnSteroids boxWithoutType = new BoxOnSteroids(new Apple());
        BoxOnSteroids<Apple> boxWithApple = boxWithoutType;
        BoxOnSteroids<Orange> boxWithOrange = boxWithoutType;
        Apple apple = boxWithApple.getFruit();
        //Orange orange = boxWithOrange.getFruit(); //Exception in thread "main" java.lang.ClassCastException: GenericTypes.Apple cannot be cast to GenericTypes.Orange


        AppleBox<Apple> appleAppleBox = new AppleBox<>(new Apple());
//        AppleBox<Orange> orangeAppleBox = new AppleBox<Orange>(); // complilation error



    }

    

}
