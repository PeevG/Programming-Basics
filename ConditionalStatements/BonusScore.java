import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (number % 2 == 0) {
            bonus = bonus + 1;
        } else if (number % 5 == 0) {
            bonus = bonus + 2;
        }
        if (number <= 100) {
            bonus = bonus + 5;
        }
        if (number > 1000) {
            bonus = bonus + 0.1 * number;
        }
        if (number > 100 && number <= 1000) {
            bonus = bonus + 0.2 * number;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}