import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenPower = 1;
        for (int i = 0; i <= n; i += 2) {
            System.out.println(evenPower);
            evenPower = evenPower * 2 * 2;
        }
    }
}