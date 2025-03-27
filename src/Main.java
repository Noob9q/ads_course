import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
//        System.out.println("Minimum: " + RecursiveSolutions.FindMin(arr));
        System.out.println("Average: " + RecursiveSolutions.findAvg(arr));
    }
}