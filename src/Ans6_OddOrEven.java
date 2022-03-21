import java.util.Scanner;

public class Ans6_OddOrEven
//6.	Write a java program to input any number and find out if it’s odd or even
 {
  public int test(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number");
      int num = sc.nextInt();
      return num;
  }

     public static void main(String[] args) {
         Ans6_OddOrEven obj = new Ans6_OddOrEven();
         int even = obj.test();
         if (even%2==0){
             System.out.println("This is a even number");
         }else {
             System.out.println("This is a odd number");
         }
     }


}
