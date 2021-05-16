import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (side * side));
        } else if (figure.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (width * length));
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI * r * r);
        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * height / 2);
        }
    }
}