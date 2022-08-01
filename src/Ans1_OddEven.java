import java.util.Scanner;
// 1.	Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)
// first change
public class Ans1_OddEven {
   // 1.Write a java program that tells us that Input number is odd or even?
    // HINT: use ternary operator (? :)\
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a number : ");
       int number = sc.nextInt();
       // java odd or even
       String strOutput = (number % 2 == 0) ? "even" : "odd";
       System.out.println(number + " is " + strOutput);

   }
}

