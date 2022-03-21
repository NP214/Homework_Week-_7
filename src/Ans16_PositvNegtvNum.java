import java.util.Scanner;

public class Ans16_PositvNegtvNum {
    /*
    16.	Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num <= -1 && num != 0){
            System.out.println("Enter number is NEGATIVE");
        }else if(num >= 1 && num != 0){
            System.out.println("Enter number is POSITIVE");
        }else{
            System.out.println("ZERO");
        }
    }
}
