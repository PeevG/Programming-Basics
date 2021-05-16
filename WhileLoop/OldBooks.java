import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int count = 0;

        String command = scanner.nextLine();

        while (!command.equals("No More Books")) {
            if (command.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", count);
                break;
            }
            count++;
            command = scanner.nextLine();
        }
        if (command.equals("No More Books")) {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", count);

        }

    }
}