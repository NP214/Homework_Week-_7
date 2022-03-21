import java.util.Scanner;

public class Ans7_FindTheSales {
    /**
     * 7.	Write a java program input sales id, seller's name, sales amount,
     * and salary basic and then fined this sales
     * Commission
     *     Sales amount >= 50,000 35%
     *     Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
      */
    public static void main(String[] args) {
        int sales_ID , saleamount , basic_salary , commission;
        String name ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales ID");
        sales_ID = sc.nextInt();
        System.out.println("Enter Seller's name");
        name = sc.next();

        System.out.println("Enter basic salary");
        basic_salary = sc.nextInt();

        System.out.println("Enter sales amount");
        saleamount = sc.nextInt();
        if(saleamount >= 50000){
             commission = saleamount * 35 / 100;
            System.out.println("Sales commission is " + commission);
        }else if (saleamount >= 30000 && saleamount <= 49999){
            commission = saleamount * 20 / 100;
            System.out.println("Sales commission is " + commission);
        } else if (saleamount >= 20000 && saleamount <= 29999){
            commission = saleamount * 10 /100;
            System.out.println("Sales commission is " + commission);
        }else if(saleamount >= 10000 && saleamount <= 19999){
            commission = saleamount * 5 /100;
            System.out.println("Sales commission is " + commission);
        }else if(saleamount >= 10000 && saleamount <= 9999) {
            commission = saleamount * 2 / 100;
            System.out.println("Sales commission is " + commission);


        }
}}
