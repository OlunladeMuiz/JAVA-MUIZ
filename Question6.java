import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        System.out.println("Enter six integers: ");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
        }

        System.out.println("Largest: " + largest);
    }
}
