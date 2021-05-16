import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSteps = 0;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >= 10000) {
                int diff = totalSteps - 10000;
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int stepsHome = Integer.parseInt(scanner.nextLine());
            totalSteps += stepsHome;
            int diff = 10000 - totalSteps;
            if (diff > 0) {
                System.out.printf("%d more steps to reach goal.", diff);
            } else {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(diff));
            }
        }
    }
}