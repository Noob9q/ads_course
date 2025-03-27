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
}
