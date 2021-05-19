import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        System.out.println("Enter The Temperature In Celsius :\n");
        Scanner SC = new Scanner(System.in);
        float c = SC.nextFloat();
        float f =(float) (1.8 * c) + 32;
        System.out.println("The Temperature In Fahrenheit :"+f+"f");

    }
}
