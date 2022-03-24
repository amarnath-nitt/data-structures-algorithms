package main.java.datastructures;

public class Array {
    public static void main(String [] args){
        int [] arr = new int[]{1,2,3,4,5, 6};
        System.out.println("Array Before reverse: ");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Array After reverse: ");
        printArray(arr);
    }
    public static void printArray(int [] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static int []  reverseArray(int [] arr){
        int l=0, h=arr.length-1;
        while(l<h){
            arr[l] = arr[l] + arr[h];
            arr[h] = arr[l] - arr[h];
            arr[l] = arr[l] - arr[h];
            l++; h--;
        }
        return arr;
    }
}
