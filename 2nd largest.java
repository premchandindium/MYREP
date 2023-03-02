import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.printf("\n\n%d is the 2nd largest number\n", b);
            } else {
                System.out.printf("\n\n%d is the 2nd largest number\n", c);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.printf("\n\n%d is the 2nd largest number\n", a);
            } else {
                System.out.printf("\n\n%d is the 2nd largest number\n", c);
            }
        } else if (a >= b) {
            System.out.printf("\n\n%d is the 2nd largest number\n", a);
        } else {
            System.out.printf("\n\n%d is the 2nd largest number\n", b);
        }

        scanner.close();
    }
}
