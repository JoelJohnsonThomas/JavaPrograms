import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter The Side Of The Square :\n");
        Scanner SC = new Scanner(System.in);
        float a = SC.nextInt();
        float ar =(float) a *a ;
        float p = (float) 4 * a;
        System.out.println("The Area Of The Square        :"+ar+"Sq.units");
        System.out.println("The Perimeter Of The Square:"+p+" Sq.units");
    }
}
