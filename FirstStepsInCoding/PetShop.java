import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dog = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());

        double dogsFood = dog * 2.50;
        double restFood = rest * 4.00;
        double total = dogsFood + restFood;
        System.out.println(total + " lv.");
    }
}
