package main.java.oops.staticKeyword.staticBlcok;

public class StaticBlock {
    static int count=0;
    static {
        System.out.println("Count: "+ count); // Non-static variable is not accessible in static method;
        System.out.println("This is static block");
    }
    public static void main(String []args){
        System.out.println("Count : " + count);  // Non-static variable is not accessible in static method;
        System.out.println("This is main method.");
    }
}
