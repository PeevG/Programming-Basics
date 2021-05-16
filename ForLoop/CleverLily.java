import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int countToy = 0;
        int sumPresentMoney = 0;
        int count = 0;


        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                count++;
                sumPresentMoney = sumPresentMoney + i * 10 / 2;

            } else {
                countToy++;
            }

        }
        double total = sumPresentMoney + countToy * toyPrice - count;
        double diff = total - laundry;
        if (diff >= 0) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", Math.abs(diff));
        }
    }
}