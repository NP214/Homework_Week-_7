public class Ans11 {
    /*
     11.Write a java program to print the numbers between 1 to 100 which can be divided
      by 3 and 5 separately.
     */
    // aaa
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }


            System.out.println("=====================================================");


            for (int j = 1; j <= 100; j++) {
                if (j % 5 == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }















