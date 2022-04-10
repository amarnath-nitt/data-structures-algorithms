package main.java.oops.aggregation;

public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println("Id: " + id);
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
    }
}
