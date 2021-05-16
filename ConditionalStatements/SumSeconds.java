import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int min = sum / 60;
        int sec = sum % 60;

        if (sec <= 9) {
            System.out.println(min + ":0" + sec);
        } else {
            System.out.println(min + ":" + sec);
        }
    }
}