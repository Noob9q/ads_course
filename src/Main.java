import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Minimum: " + RecursiveSolutions.FindMin(arr));
//       System.out.println("Average: " + RecursiveSolutions.findAvg(arr));
//        int num = scanner.nextInt();
//        System.out.println("Is prime: " + RecursiveSolutions.isPrime(num,2));
//        int factNum = scanner.nextInt();
//        System.out.println("Factorial:" + RecursiveSolutions.factorial(factNum));
//        int FibNum = scanner.nextInt();
//        System.out.println(RecursiveSolutions.fibonacci(FibNum));
//        int[] arr = new int[2];
//        for (int i=0;i<2;i++){
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(RecursiveSolutions.
//                PowerNum(arr));
        int a = scanner.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(RecursiveSolutions.RevList(b, a)));

    }
}