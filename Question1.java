public class Question1 {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 1; i <= 10; i++)
            sum1 += i;

        for (int i = 20; i <= 37; i++)
            sum2 += i;

        for (int i = 35; i <= 49; i++)
            sum3 += i;

        System.out.println("Sum from 1 to 10: " + sum1);
        System.out.println("Sum from 20 to 37: " + sum2);
        System.out.println("Sum from 35 to 49: " + sum3);
    }
}
