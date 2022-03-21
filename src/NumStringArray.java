import java.util.Arrays;

public class NumStringArray {
/*
17.	Write a Java program to sort a numeric array and a string array.
 */
public static void main(String[] args) {


    int[] numarray = {5, 10, 15, 20, 25, 30, 35};
    String[] stringarray = {"Arizona", "Boston", "colorado", "Delaware", "Florida", "Georgia", "hawaii"};
    System.out.println("Actual array is "+ Arrays.toString(numarray));
    Arrays.sort(numarray);
    System.out.println("Sorted numeric array is "+ Arrays.toString(numarray));
   System.out.println("-----------------------------");
    System.out.println("------------------------------");
    System.out.println("Actual string array is "+ Arrays.toString(stringarray));
    Arrays.sort(stringarray);
    System.out.println("Sorted string array is "+ Arrays.toString(stringarray));
}








}
