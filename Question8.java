import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        System.out.print("Enter second string: ");
        String second = input.nextLine();

        System.out.println("Result: " + first.concat(second));
    }
}
