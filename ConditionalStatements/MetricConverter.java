import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        double m = 1;
        double result = 0;

        if (input.equals("mm")) {
            m = number / 1000;
        }
        if (input.equals("cm")) {
            m = number / 100;
        }
        if (input.equals("m")) {
            m = number;
        }
        if (output.equals("mm")) {
            result = m * 1000;
        }
        if (output.equals("cm")) {
            result = m * 100;
        }
        if (output.equals("m"))
            result = m;
        System.out.printf("%.3f", result);
    }
}