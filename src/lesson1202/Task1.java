package lesson1202;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 4, 5, 40};
        int numToFind = 5;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (numToFind == array[i]) {
                index = i;
                System.out.println(i);
                break;
            }
            System.out.println(index);
        }
    }
}
