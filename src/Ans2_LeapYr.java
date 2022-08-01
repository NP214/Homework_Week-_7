import java.util.Scanner;
/* 2.	Write a java program to input any year like (ex.2007) and
 find out if it is leap year or not? */
// first line

public class Ans2_LeapYr {


    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the year");
        year = sc.nextInt();
        if (year % 4 == 0)  {
            System.out.println("it,s a leap year");
        }else {
            System.out.println("it,s not a leap year");
        }
    }
}
