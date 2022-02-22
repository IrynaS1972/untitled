package lesson1202;

public class Task3 {
    public static void main(String[] args) {
        //найти минимальный элемент в массиве
        int[] array = {-1, 2, 3, 10, -10};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];

            }
            System.out.println(min);
            //пузырьковая сортировка
//            int temp = 0;
//            int k=0;
//            while (k<array.length) {
//                for (int i = 0; i < array.length-1-k; i++) {
//                    if (array[i] > array[i + 1]){
//                        temp=array[i+1];
//                        array[i+1]=array[i];
//                        array[i]=temp;
//                    }
//                }
//                k++;
//            }
//            System.out.println();

        }
    }
}
