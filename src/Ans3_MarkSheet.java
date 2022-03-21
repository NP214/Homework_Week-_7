import java.util.Scanner;

public class Ans3_MarkSheet {
    /* 3.	Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________ |                                                               |
|                       Mark Sheet                      |
|_______________________________|
	| 	Name  	: 	Jay      |
	| 	Roll No : 	08                    |
|_______________________________|
	| 	Subjects 	: 	Marks |
|_______________________________|
	| 	Math 	 	: 	98       |
	| 	Science : 	90                    |
	| 	English : 	85                    |
|_______________________________|
	| 	Total 	 	: 	273     |
|_______________________________|
| Percentage : 91.0             |
| Result  : Pass                |
| Grade  :  A+                |
|_______________________________|
*/
// Ask que to bhavesh bhai why string result grade = null line 33

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollnum, Mathsmark,Sciencemarks,Englishmarks,total;
        String result ,grade = null;
        double percentage , sum;

        System.out.println("Enter student name : ");
        String studentname = sc.next();

        System.out.println("Enter student roll number");
        rollnum = sc.nextInt();

        System.out.println("Enter Maths Marks : ");
        Mathsmark = sc.nextInt();
        while (Mathsmark < 0 || Mathsmark > 100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
        sc.nextInt();
           // here we write this line to stop run while loop infinitive,
           // and it goes into the next line
        }


        System.out.println("Enter Science Marks");
        Sciencemarks = sc.nextInt();
        while(Sciencemarks < 0 || Sciencemarks > 100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            sc.nextInt();
            //here we write this line to stop run while loop infinitive,
            //             and it goes into the next line
        }

        System.out.println("Enter English Marks");
        Englishmarks = sc.nextInt();
        while(Englishmarks < 0 || Englishmarks > 100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            sc.nextInt(); /* here we write this line to stop run while loop infinitive,
             and it goes into the next line */
        }
        sum = Mathsmark + Sciencemarks + Englishmarks ;
        percentage = sum / 300 * 100;
        System.out.println(percentage);
        if (percentage >= 35){
            result = "PASS";
        }else{
            result = "FAIL";
        }
        System.out.println(result);

if (percentage >= 80 ){
    System.out.println(grade);
    grade = "A+";
}else if(percentage >= 60){
    grade = "A";
    System.out.println(grade);
}else if (percentage >= 50){
    grade = "B";
    System.out.println(grade);
} else if (percentage >= 35){
    grade = "c";
    System.out.println(grade);
}

        System.out.println("|-------------------------------|\n");
        System.out.println("|         Mark Sheet            |");
        System.out.println("|_______________________________|\n");
       System.out.println(" |Name :  " + studentname +"                   |\n");
        System.out.println("|Roll No:" + rollnum  +"                     |\n");
        System.out.println("|_______________________________|\n");
        System.out.println("| Subjects : Marks              |\n");
        System.out.println("|_______________________________|\n");
        System.out.println("| Math :" + Mathsmark +"                      |");
        System.out.println("| Science :" + Sciencemarks +"                   |");
        System.out.println("| English :" + Englishmarks +"                   |");
        System.out.println("|_______________________________|");
        System.out.println("\n"+"|_______________________________|");
        System.out.println("| Percentage :" + percentage + " |");
        System.out.println("| Result : " + result + "                 |");
        System.out.println("| Grade : " + grade + "                  |");
        System.out.println("|_______________________________| ");



    }

}
