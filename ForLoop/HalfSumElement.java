import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number >= maxNum) {
                maxNum = number;
            }

        }
        if ((sum - maxNum) == maxNum) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - 2 * maxNum));
        }
    }
}