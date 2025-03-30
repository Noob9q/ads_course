import java.util.Scanner;
public class RecursiveSolutions {
    public static int FindMin(int[] arr) {
        //Функция ищет минимальное число в массиве
        int min=arr[0];
        for(int num :arr){
            if(num<min){//Если нашли меньше обновляем
                min=num;
            }
        }
        return min;
    }
    //Функция считает среднее значение массива
    public static double findAvg(int[] arr) {
        int sum = 0; //Переменная для суммы элементов
        for (int num : arr) {
            sum += num; //Складываем все числа
        }
        return (double) sum / arr.length; //Возвращаем среднее значение
    }
    //Проверяем, простое ли число
    public static String isPrime(int n, int i) {
        if (n <= 2) return (n == 2) ? "Prime" : "Composite"; //Если 2 простое, если меньше нет
        if (n % i == 0) return "Composite"; //Если делится на i составное
        if (i * i > n) return "Prime"; // Eсли проверили все возможные делители простое
        return isPrime(n, i + 1); //Проверяем следующее число
    }
    //Функция считает факториал через рекурсию
    public static int factorial(int n) {
        return (n==0) ? 1 : n * factorial(n - 1); //Если0 возвращаем 1,иначе n * (n-1)!
    }
    //Решение фибоначчи, использование рекурсий
    public static int fibonacci(int n) {
        if (n == 0 || n==1) return n;//Если п=1 - 0, возвращается п
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //Just Power function
    public static int PowerNum(int[] arr) {
        int a=arr[0];
        for(int i=1;i<arr[1];i++){
            a=a*arr[0];
        }
        return a;
    }
    public static int[] RevList(int[] b, int a) {
        int[] total = new int[a];
        for (int i = 0; i < a; i++) {
            total[a - 1 - i] = b[i];
        }
        return total;
    }
}
