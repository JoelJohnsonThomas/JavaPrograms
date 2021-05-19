import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter The Radius Of The Circle:\n");
        Scanner SC = new Scanner(System.in);
        float r = SC.nextInt();
        float Area = (float) (3.14 *r *r);
        float Circumference = (float)(2*3.14*r);
        System.out.println("The Area Of The Circle               :"+Area+"sq.units");
        System.out.println("The Circumference Of The Circle:"+Circumference+"sq.units");



    }
}
