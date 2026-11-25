import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[120];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = input.nextDouble();
        }

        for (int i = 0; i < scores.length; i++)
            System.out.println("Student " + (i + 1) + ": " + scores[i]);
    }
}
