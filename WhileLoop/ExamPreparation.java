import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFails = Integer.parseInt(scanner.nextLine());

        String problem = scanner.nextLine();

        int countFails = 0;
        int sumGrades = 0;
        int totalProblems = 0;
        String lastProblem = "";

        while (!problem.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            totalProblems++;
            lastProblem = problem;
            sumGrades += grade;
            if (grade <= 4) {
                countFails++;
            }
            if (countFails == maxFails) {
                System.out.printf("You need a break, %d poor grades.", countFails);
                break;
            }
            problem = scanner.nextLine();

        }
        if (problem.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", 1.0 * sumGrades / totalProblems);
            System.out.printf("Number of problems: %d%n", totalProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}