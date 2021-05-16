import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startHour = Integer.parseInt(scanner.nextLine());
        int startMin = Integer.parseInt(scanner.nextLine());
        int totalStartTime = startHour * 60 + startMin;
        int totalFinalHour = totalStartTime + 15;
        int finalHour = totalFinalHour / 60;
        int finalMinutes = totalFinalHour % 60;
        if (finalHour == 24) {
            finalHour = 0;
        }
        System.out.printf("%d:%02d", finalHour, finalMinutes);
    }
}