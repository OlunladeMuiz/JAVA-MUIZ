import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        int choice;

        if (a >= b && a >= c)
            choice = 1;
        else if (b >= a && b >= c)
            choice = 2;
        else
            choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Largest: " + a);
                break;
            case 2:
                System.out.println("Largest: " + b);
                break;
            case 3:
                System.out.println("Largest: " + c);
                break;
        }
    }
}
