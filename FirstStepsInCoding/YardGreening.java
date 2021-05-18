import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m2 = Double.parseDouble(scanner.nextLine());
        double price = m2 * 7.61;
        double otstypka = 0.18 * price;
        System.out.printf("The final price is: %.2f lv.%n", price - otstypka);
        System.out.printf("The discount is: %.2f lv.", otstypka);
    }
}
