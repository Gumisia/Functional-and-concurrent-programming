package Interfaces;

public interface InterfaceB {

    default String connect(int a, int b){
        return a+" "+b;
    }
}
