public class Task_5_1a {
    public static void main(String[] args) {
        //вычислить: 1+2+4+8+...+256
       int i = 1;
       int sum=0;
        for (i=1; i<=128; i*=2)
        {
            sum=sum+i*2;
       }
        System.out.println(sum);
    }
    }
