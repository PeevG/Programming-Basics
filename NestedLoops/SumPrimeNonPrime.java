import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int sumNonPrime = 0;
        int sumPrime = 0;
        boolean x = true;

        while (!text.equals("stop")) {
            int n = Integer.parseInt(text);
            if (n < 0) {
                System.out.println("Number is negative.");
                text = scanner.nextLine();
                continue;
            } else if (n == 0) {
                text = scanner.nextLine();
                continue;
            }
            for (int i = n - 1; i >= 2; i--) {
                if (n % i == 0) {
                    sumNonPrime += n;
                    x = false;
                    break;
                }
            }
            if (x) {
                sumPrime += n;
            }
            x = true;
            text = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}