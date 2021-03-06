import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());
        double delay = Math.floor(distance / 15) * 12.5;
        double swimTime = distance * timePerMeter + delay;

        if (swimTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimTime);
        } else System.out.printf("No, he failed! He was %.2f seconds slower.", (swimTime - record));

    }
}