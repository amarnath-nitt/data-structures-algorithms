package main.java.oops.staticKeyword.examples.collegeAdmission;

public class Student {
    int rollNo;
    String fullName;
    static String collegeName = "NITT";

    public Student(String fullName) {
        Admission admission = new Admission();
        this.rollNo = admission.getAddmissionCount();
        this.fullName = fullName;
    }

    public void display(){
        System.out.println(rollNo + " , " + fullName + " , " + collegeName);
    }
}
