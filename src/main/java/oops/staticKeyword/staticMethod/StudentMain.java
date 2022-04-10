package main.java.oops.staticKeyword.staticMethod;

public class StudentMain {
    public static void main(String []args){
        Student s1 = new Student(1, "Amarnath");
        Student s2 = new Student(2, "Rahul");
        s1.display();
        s2.display();
        Student.changeCollegeName();
        Student s3 = new Student(3, "Raju");
        Student s4 = new Student(4, "Pankaj");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
