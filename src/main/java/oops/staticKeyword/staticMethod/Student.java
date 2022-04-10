package main.java.oops.staticKeyword.staticMethod;

public class Student {
    int rollNo;
    String fullName;
    static String collegeName = "NITT";

    public static void changeCollegeName(){
        collegeName = "ITT";
    }

    public Student(int rollNo, String fullName) {
        this.rollNo = rollNo;
        this.fullName = fullName;
    }

    public void display(){
        System.out.println(rollNo + " , " + fullName + " , " + collegeName);
    }
}
