package Serializacja;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski", 4565);
        serializableObject(employee);

        Employee employee1 = deserializeObject();
        System.out.println(employee1);
    }

    private static void serializableObject(Employee employee){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("src/Serializacja/employee.ser");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data saved");
        } catch (IOException ex){
            if(fileOutputStream != null)
                ex.printStackTrace();
        }
    }

    private static Employee deserializeObject(){
        try{
            FileInputStream fileInputStream = new FileInputStream("src/Serializacja/employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return employee;
        } catch (IOException ex){
            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex){
            System.out.println("Emplayee class not found");
            ex.printStackTrace();
            return null;
        }
    }
}


