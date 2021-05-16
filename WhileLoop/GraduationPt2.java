import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum = 0;
        double average = 0;
        int level = 0;
        int notPassed = 0;

        while (level <= 11) {
            level++;
            double evaluation = Double.parseDouble(scanner.nextLine());
            if (evaluation >= 4) {
                sum = sum + evaluation;
                average = sum / level;
                notPassed = 0;
            } else {
                notPassed += 1;
                if (notPassed >= 2) {
                    level--;
                    System.out.printf("%s has been excluded at %d grade", name, level);
                    break;
                }
            }
        }
        if (notPassed < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}