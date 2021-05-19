import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        System.out.println("Enter The Value Of Principal :\n");
        Scanner SC = new Scanner(System.in);
        float p = SC.nextFloat();
        System.out.println("Enter The Value Of Rate :\n");
        Scanner SV = new Scanner(System.in);
        float r = SV.nextFloat();
        System.out.println("Enter The Value Of Year :\n");
        Scanner SH = new Scanner(System.in);
        int n = SH.nextInt();
        float SI = (p* n* r)/ 100;
        float Q = 1 + (r /100);
        float CI = (float) (p * (Math.pow(Q,n)))-p ;
        System.out.println("Simple Interest ,SI:"+SI);
        System.out.println("Compound Interest,CI:"+CI);

    }
}
