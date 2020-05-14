package Serializacja;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 564564548;

    public String name;
    public transient String address; //default value null
    public int pin;

    public Employee(String name, String address, int pin) {
        this.name = name;
        this.address = address;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pin=" + pin +
                '}';
    }
}
