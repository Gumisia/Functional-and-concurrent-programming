package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> text = Arrays.asList("Dawno", "dawno", "temu");

//        Bajkopisarz fairyTailWriter = s -> System.out.println(s);
        FairyTailWriter fairyTailWriter = System.out::println;
        tellMe(text, fairyTailWriter);

//        int n=10;
//        for(int i=0; i<n; i++){
//            new Thread(() ->System.out.println(i)).start();
//        }


        massages("hej", 20);
    }
    public static void tellMe(List<String> list, FairyTailWriter fairyTailWriter){
        for (String test: list
             ) {
            fairyTailWriter.tell(test);
        }
    }

    public static void massages(String text, int numberOfRepetitons) {
        Runnable r = () -> {
            for (int i = 0; i < numberOfRepetitons; i++) System.out.println(text); // only final variables not modificated in the programme
        };
        new Thread(r).start();
    }
}
