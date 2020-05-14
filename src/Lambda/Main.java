package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] a = {"cat", "mouse", "dog"};
        List<String> animals = Arrays.asList(a);

        // 1
        for (String animal : animals
             ) {
            System.out.println(animal);
        }

        // 2
        animals.forEach((animal)-> System.out.println(animal)); //FunctionalInterface implements lambda

        // 3
        animals.forEach(System.out::println);

        System.out.println("Sort: ");
        animals.sort((String s1, String s2)-> s1.compareTo(s2));
        //animals.sort(Comparator.naturalOrder());

        animals.forEach(System.out::println);
    }
}
