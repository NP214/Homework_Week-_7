import java.util.Scanner;

public class Ans5_SalarySlip {
    /**
     * 5.	WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
     *     HRA = basic salary 10%
     *     DA = Basic salary 8%
     *     TA = Basic salary 9%
     *     PF= Basic salary 20%
     *     Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     * _______________________________
     * 	| 	 	 Salary Slip                 |
     * |______________________________|
     * 	| Employee Id  	: 2564            |
     * 	| Employee Name 	: Jay               |
     * |______________________________|
     * | Basic Salary 	 	: 25000.0       |
     * | HRA  10% 	 	: 2500.0         |
     * | TA   8% 	 	: 2250.0         |
     * | DA   9% 	 	: 2000.0         |
     * | PF - 20& 	 	: 5000.0         |
     * |______________________________|
     * 	| Gross Salary  	: 26750.0       |
     * |===========================|
     *
     */
    public static void main(String[] args) {
        String name;
        int empID, basic_salary, hra, ta, da, pf, gross_salary;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Employee ID");
        empID = sc.nextInt();

        System.out.println("Please Enter Employee Name");
        name = sc.next();

        System.out.println("Please Enter Basic Salary");
        basic_salary = sc.nextInt();

        hra = basic_salary * 10 / 100;

        da = basic_salary *8/ 100;
       ta = basic_salary * 9 /100;
       pf = basic_salary * 20 / 100;
       gross_salary = basic_salary + hra + ta + da - pf;

        System.out.println("_______________________________");
        System.out.println("|  Salary Slip                 |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id  :"+ empID + "             |");
        System.out.println("| Employee Name :" + name +"           |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary \t \t:" + basic_salary +"     |");
        System.out.println("| HRA  10% \t \t:" + hra + "          |");
        System.out.println("| TA   8% \t \t: " + ta + "         |");
        System.out.println("| DA   9% \t \t: " + da + "         |");
        System.out.println("| PF - 20& \t \t: " + pf + "         |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary  \t: " + gross_salary + "    |");
        System.out.println("|==============================|");















    }













}
