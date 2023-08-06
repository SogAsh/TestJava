import java.util.Scanner;

public class Main {
    public static void printString() {
        System.out.println("Amigo\"\nFirst"); //ee
        System.out.println("The");
        System.out.print("Best");
        System.out.print("2");
    }

    public static void variables() {
        int a;
        a = 30;

        String s = " is small";

        System.out.println("Age: " + a + s);
    }

    public static void varFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя или число: ");
//        String username = scan.nextLine();
//        System.out.println("Привет " + username);

        int num = scan.nextInt();
        System.out.println("Число " + num);
    }

    public static void math() {
        short num1 = 50, num2 = 10;
        int res = num1 + num2;
    }

    public static void main(String[] args) {
//        printString();
//        variables();
//        varFromUser();
        math();
    }
}