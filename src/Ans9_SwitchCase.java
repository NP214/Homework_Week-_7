import java.util.Scanner;

public class Ans9_SwitchCase {
    /*
    9.	Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
    if any other alphabet should be invalid entry
     */

    public String alphabate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        String input = sc.next();
        return input;

    }

    public static void main(String[] args) {
        Ans9_SwitchCase obj = new Ans9_SwitchCase();
        String alp = obj.alphabate();

        switch (alp) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Chennai");
                break;
            case "D":
                System.out.println("Dehradun");
                break;
            case "E":
                System.out.println("Elora");
                break;
            case "F":
                System.out.println("Farizabad");
                break;
            default:
                System.out.println("Invalid entry");
        }

    }
}
