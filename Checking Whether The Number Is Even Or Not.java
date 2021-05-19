import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter Any Number:\n");
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        if(n % 2 !=0)
            System.out.println(n +" is a odd number");
        else
            System.out.println(n+" is a even number");
    }
}
