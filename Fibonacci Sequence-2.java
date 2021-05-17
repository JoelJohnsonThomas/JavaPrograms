import java.util.Scanner;
import java.util.Scanner;
public class Fibonacci {
        public static void main(String[] args) {
            int i = 0;
            int j = 1;
            int k = i + j;
            Scanner SC = new Scanner(System.in);
            System.out.println("Enter The Upper Limit:\n");
            int n = SC.nextInt();
            System.out.println("The First "+n+" Fibonacci Sequences are:");
            System.out.println(i);
            System.out.println(j);
            System.out.println(j);
            for(int c = 0;c <=n-4;c++) {
                i = j;
                j = k;
                k = i + j;
                System.out.println(k);
                if (c ==n)
                    break;

            }


        }

}
