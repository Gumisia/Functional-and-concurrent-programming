package Interfaces;

public interface InterfaceA {

    void log(String msg); //this method must be implemented

    static String connectS(int a, int b){
        int wynik = a+b;
        return String.valueOf(wynik);
    }

    default String connect(int a, int b){
        int wynik = a+b;
        return intToString(wynik);
    }

    default String connectWith2And(int a, int b){
        int wynik = 2+a+b;
        return intToString(wynik);
    }

    private String intToString(int a){ //private method available in Java 8+
        return String.valueOf(a);
    }
}
