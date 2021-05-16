import java.util.Scanner;

public class Fibonacci {
    public static void main (String a[])
    {
        int i = 0;
        int j = 1;

        Scanner SC = new  Scanner(System.in);
        System.out.println("Enter The Upper Limit:");
        int n = SC.nextInt();


        for(int k =1 ; k<=n;k ++){
            if (n ==1) {
                System.out.println("0");
                System.out.println("1");
                break;
            }
             else{
                k = i + j;
                System.out.println(k);
                i = j;
                j = k;
            }


        }
    }
}
