import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = input.nextDouble();
        double c = (5.0 / 9) * (f - 32);

        System.out.println("Temperature in Celsius: " + c);
    }
}
