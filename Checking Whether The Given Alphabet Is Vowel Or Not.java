import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter Any Character :\n");
        Scanner SC = new Scanner(System.in);
        char c = SC.next().charAt(0);
        switch (c){
            case 'a':
            case 'A':
                System.out.println(c+" is a vowel");
                break;
            case 'e':
            case 'E':
                System.out.println(c+" is a vowel");
                break;
            case 'i':
            case 'I':
                System.out.println(c+" is a vowel");
                break;
            case 'o':
            case 'O':
                System.out.println(c+" is a vowel");
                break;
            case 'u':
            case 'U':
                System.out.println(c+" is a vowel");
                break;
            default:
                System.out.println(c+" is not a vowel");
                break;
        }

    }
}
