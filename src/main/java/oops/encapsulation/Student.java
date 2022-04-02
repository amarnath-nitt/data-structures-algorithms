package main.java.oops.encapsulation;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class Student {
    private Long rollNumber;
    private String fullName;

    public Student(Long rollNumber, String fullName) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
    }

    public Student() {
    }

    public Long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
