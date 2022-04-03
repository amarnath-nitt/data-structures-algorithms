package main.java.oops.inheritance;
/*
 * @author amarnath-nitt on 03-04-2022;
 */
public class Inheritance extends Employee{
    Long salary = 2500L;
    public static void main(String []args){
        Inheritance inheritance = new Inheritance();
        System.out.println(inheritance.salary);
        System.out.println(inheritance.bonus);
    }
}
