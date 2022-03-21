import java.util.Scanner;

public class Ans10_IfElseCalculator {
    /*  10.	Write a java program to input any two number and ask user to enter their
  symbol/OPERATORS (+, -, /, *) find addition, Subtraction, multiplication and division according
  to their symbol (using if else)
     */
    public static void main(String[] args) {
        double num1 , num2 ;
        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextDouble(); // num1

        System.out.println("Enter second number");
        num2 = sc.nextDouble(); //num2

        System.out.println("Enter an operators (+, -, /, *) ");
       char operators = sc.next().charAt(0); // any operator entered is stored here\
        sc.close(); // close the scanner class
        double output; // initialised output
        if (operators == '+'){
            output = num1 + num2;
            System.out.println(num1 +" "+operators+ " "+  num2 + " = " + output);
        }else if (operators == '-'){
            output = num1 - num2 ;
            System.out.println(num1 +" "+operators+ " "+  num2 + " = " + output);
        }else if (operators == '*'){
            output = num1*num2;
            System.out.println(num1 +" "+operators+ " "+  num2 + " = " + output);
        }else if (operators == '/'){
            output = num1/num2;
            System.out.println(num1 +" "+operators+ " "+  num2 + " = " + output);
        }else {
            System.out.println("Enter invalid operators");
        }

// in switch entered operators go, according operatord case statement run
//       switch (operators){
//           case '+':
//               output = num1 + num2;
//               break;
//           case '-' :
//               output = num1 - num2;
//               break;
//           case '*' :
//               output = num1 * num2;
//               break;
//           case '/':
//               output = num1/num2;
//               break;
//           default:
//               System.out.println("You entered wrong operators");
//               return;
//       }
       // runned case (selected operators ) value in below and how sum is create
        //System.out.println(num1 +" "+operators+ " "+  num2 + " = " + output);
    }}



