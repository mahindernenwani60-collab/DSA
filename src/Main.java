//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        int [] a = {2,4,6,8,9};
        System.out.println("USing traditional for loop");

        for(int i = 0;i<a.length;i++){
            System.out.println("Element: "+ a[i]);
        }

        System.out.println();

        for(int value: a){
            System.out.println("Element :"+ value);
        }
    }
}
public class Main {
        static int linearSearch(int[] arr, int n, int key) {
            for(int i =0; i <= n; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60};
            int n = arr.length;
            int result = linearSearch(arr, n, 50);
            System.out.println("Index: " + result);
        }
    }

 */

//import java.util.Scanner;
//public class Main{
//
//    public static void main(String[] args){
//        int[] a = new int[5];
//        int sum =0;
//        int avg =0;
//        Scanner sc = new Scanner (System.in);
//        for (int i =0;i<=a.length - 1; i++){
//            int b = sc.nextInt();
//            a[i]=b;
//            sum = sum+a[i];
//
//        }
//        avg = sum/a.length;
//        System.out.println("Average is :"+ avg);
//        System.out.println("sum is:" + sum);
//    }
//}
public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int target = 20;


        int linearComparisons = 0;

        for (int i = 0; i < arr.length; i++) {
            linearComparisons++;

            if (arr[i] == target) {
                break;
            }
        }

        int binaryComparisons = 0;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            binaryComparisons++;

            if (arr[mid] == target) {
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Target element: " + target);
        System.out.println("Linear Search comparisons: " + linearComparisons);
        System.out.println("Binary Search comparisons: " + binaryComparisons);

        /*
         * Difference:
         *
         * Linear Search checks elements one by one from the beginning.
         * Since 20 is the last element, it needs 20 comparisons.
         *
         * Binary Search repeatedly divides the sorted array in half.
         * Therefore, it finds 20 in only 5 comparisons.
         *
         * Linear Search: O(n)
         * Binary Search: O(log n)
         */
    }
}



