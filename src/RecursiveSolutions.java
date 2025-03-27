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

}
