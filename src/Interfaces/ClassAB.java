package Interfaces;

public class ClassAB implements InterfaceA, InterfaceB {

    @Override
    public void log(String msg) {

    }

    @Override
    public String connect(int a, int b) {
        return InterfaceA.super.connect(a,b)+" "+InterfaceB.super.connect(a,b);
    }
}
