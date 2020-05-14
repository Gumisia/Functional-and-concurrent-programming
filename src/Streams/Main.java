package Streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> listOfPeople = List.of(new Human("Ala", 18), new Human("Basia", 20), new Human("Ania", 12));
        var stream = listOfPeople.stream();
//        stream.forEach(o-> System.out.println(o)); // stream is exist as long as the final method is not performed on it
//        stream.limit(2).forEach(o-> System.out.println(o));
//        stream.filter(o-> o.age>=18).forEach(o-> System.out.println(o));


        stream.filter(o-> {
            System.out.println("filtr: ");
            return o.age>=18;
        }).forEach(o-> System.out.println(o));

/*        stream.filter(o-> {
            System.out.println("filtr: ");
            return o.age>=18;
        });//.forEach(o-> System.out.println(o));*/

//        stream.forEach(o-> System.out.println(o)); //error
    }
}
