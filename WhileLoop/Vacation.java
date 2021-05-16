import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendDays = 0;

        while (money < neededMoney) {
            String spendOrSave = scanner.nextLine();
            double actionMoney = Double.parseDouble(scanner.nextLine());
            days++;
            if (spendOrSave.equals("save")) {
                money += actionMoney;
                spendDays = 0;
            } else if (spendOrSave.equals("spend")) {
                money -= actionMoney;
                spendDays++;
                if (money < 0) {
                    money = 0;
                }
            }
            if (spendDays == 5) {
                System.out.printf("You can't save the money.%n%d", days);
                break;
            }
        }
        if (money >= neededMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}