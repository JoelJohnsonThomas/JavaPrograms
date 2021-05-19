import java.util.Scanner;

public class Kelvin {
    public static void main(String[] args) {
        System.out.println("Enter The Celsius Value :\n");
        Scanner SC = new Scanner(System.in);
        float c = SC.nextInt();
        float k = (float) c + 273;
        System.out.println("Kelvin value:"+k+"k");
    }
}
