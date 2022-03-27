package houmwork1302;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //Заполнить массив с консоли (предусмотреть исключительные ситуации) Если пользователь во время заполнения
        // массива вводит отрицательно число, то инициализацию массива прекратить, вывести сообщение и закончить
        // программу. Вывести полученный массив с помощью foreach

        //Заполнить массив с консоли. Если пользователь во время заполнения массива вводит отрицательное
// число, то инициализацию массива прекратить, вывести сообщение и закончить программу.Вывести полученный массив с помощью foreach.

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter size array");
                int size = sizeArrays(scanner);
                int[] array = new int[size];
                System.out.println("Enter array elements");
                boolean negative = inputArray(scanner, array);
                if (!negative) {
                    outputArray(array);
                }
            }
            //initSize(..) better
            static int sizeArrays(Scanner scanner) {
                return scanner.nextInt();
            }

            static boolean inputArray(Scanner scanner, int[] array) {
                boolean negativeNumber = false;
                for (int i = 0; i < array.length; i++) {
                    array[i] = scanner.nextInt();
                    if (array[i] < 0) {
                        System.out.println("You entered negative element!");
                        negativeNumber = true;
                        break;
                    }
                }
                return negativeNumber;

            }

            static void outputArray(int[] array) {
                System.out.println(Arrays.toString(array));
            }
        }



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size array: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Enter number: ");
//        int number = scanner.nextInt();
//        int counter = 0;
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0 && array[i] % number == 0) {
//                counter++;
//                System.out.print(array[i] + " ");
//            }
//        }
//
//        System.out.println();
//        System.out.println("Counter " + counter);
//    }
//}
//




