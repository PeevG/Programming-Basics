import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= 2 * n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                leftSum += number;
            }
            if (i > n) {
                rightSum += number;
            }
        }
        int diff = leftSum - rightSum;
        if (diff == 0) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(diff));
        }
    }
}