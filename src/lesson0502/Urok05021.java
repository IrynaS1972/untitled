package lesson0502;

public class Urok05021 {
    public static void main(String[] args) {
        //есть массив чисел. заменить каждый нечетный элемент на 0.
        int[] anArray = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] % 2 != 0) {
                anArray[i] = 0;
            }
            System.out.println(anArray[i]);
        }
        //есть массив чисел. Пользователь вводит число. Определить, есть ли число в массиве. Решить используя while
//        if ();
//        else{
//            System.out.println("The number dos'n exist");
//        }
//
//        i++;
    }
}
