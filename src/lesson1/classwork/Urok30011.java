package lesson1.classwork;

public class Urok30011 {
    public static void main(String[] args) {
        //посчитать сумму нечетных чисел (диапазон от 1 до 10)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number: ");
        int i=1;
        int sum=0;
        for (i=1;i<=10;i++) {
            if (i%2==1) {
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}

