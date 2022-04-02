package main.java.oops.encapsulation;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class Encapsulation {
    public static void main(String []args){
        Student student = new Student();
        /*
 * Note: As id and name are encapsulated in Person class, those cannot be accessed
 * directly here and also there is no way to assign id in this
 * class. Try to uncomment below code, and you would find compile time error.
       */

//        student.fullName = "Amarnath";
//        student.rollNumber = 10L;

/*
* So, we set value using setter methods & access value using getter methods;
 */
        student.setRollNumber(10L);
        student.setFullName("Amarnath");
        System.out.println("Student: " + student);

    }
}
