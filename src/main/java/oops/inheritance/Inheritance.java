package main.java.oops.inheritance;

public class Inheritance extends Employee{
    Long salary = 2500L;
    public static void main(String []args){
        Inheritance inheritance = new Inheritance();
        System.out.println(inheritance.salary);
        System.out.println(inheritance.bonus);
    }
}
