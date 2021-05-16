import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int space = a * b * c;
        int sumVolume = 0;
        int spaceDiff = 0;

        String input = scanner.nextLine();

        while (!(input.equals("Done"))) {
            int boxes = Integer.parseInt(input);
            sumVolume = sumVolume + boxes;
            spaceDiff = space - sumVolume;
            if (spaceDiff > 0) {
                input = scanner.nextLine();
            } else {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(spaceDiff));
                break;
            }
        }
        if (spaceDiff >= 0) {
            System.out.printf("%d Cubic meters left.", spaceDiff);
        }
    }
}