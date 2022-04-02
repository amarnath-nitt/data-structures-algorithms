package main.java.oops.objectAndClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class DeclarationInstantiationInitialization {
    public static void main(String []args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Student s1; // Declaration;
        s1 = new Student(); // Instantiation;
        s1 = new Student("Amarnath", simpleDateFormat.parse("1997-08-10")); // Initialization;
        System.out.println(s1);
    }
}
