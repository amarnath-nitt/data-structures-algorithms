package main.java.oops.staticKeyword.staticVariable;

import javax.sound.midi.Soundbank;

public class Student {
    int rollNo;
    String fullName;
    static String collegeName = "NITT"; //static variable;

    public Student(int rollNo, String fullName) {
        this.rollNo = rollNo;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public void display(){
        System.out.println(rollNo + " , " + fullName + " , " + collegeName);
    }
}
