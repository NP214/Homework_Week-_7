public class Ans20_ArrayContainsSpValue {
    // 20.	Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 20, 25};
        System.out.println(value(a, 25)); // true
        System.out.println(value(a, 60)); // false
    }

    public static boolean value(int a[], int item) {
        for (int x : a) {
            if(item == x){
                return true;
            }

        }
        return false;
    }


}

