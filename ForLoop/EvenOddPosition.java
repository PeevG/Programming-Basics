import java.util.Scanner;

public class EvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double minOdd = 10000000;
        double maxOdd = -10000000;
        double evenSum = 0;
        double minEven = 1000000;
        double maxEven = -1000000;

        if (n == 0) {
            System.out.printf("OddSum=0.00,%nOddMin=No,%nOddMax=No,%nEvenSum=0.00,%nEvenMin=No,%nEvenMax=No");
        } else {
            for (int i = 1; i <= n; i++) {
                double num = Double.parseDouble(scanner.nextLine());
                if (n == 1) {
                    System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=0.00,%nEvenMin=No,%nEvenMax=No", num, num, num);
                    break;
                } else {
                    if (i % 2 == 0) {
                        evenSum += num;
                        if (num >= maxEven) {
                            maxEven = num;
                        }
                        if (num <= minEven) {
                            minEven = num;
                        }
                    } else {
                        oddSum += num;
                        if (num >= maxOdd) {
                            maxOdd = num;
                        }
                        if (num <= minOdd) {
                            minOdd = num;
                        }
                    }
                }
            }
            if (n > 1) {
                System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f," +
                                "%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f",
                        oddSum, minOdd, maxOdd, evenSum, minEven, maxEven);
            }
        }
    }
}