import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double money = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double suitPrise = Double.parseDouble(scanner.nextLine());
        double neededMoney = 0;
        double decor = 0.1 * money;
        double suits = suitPrise * people;

        if (people > 150) {
            suits = suits * 0.9;
        }
        neededMoney = suits + decor;
        double diff = money - neededMoney;

        if (neededMoney <= money) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", diff);
        } else System.out.printf("Not enough money!%nWingard needs %.2f leva more.", Math.abs(diff));


    }
}