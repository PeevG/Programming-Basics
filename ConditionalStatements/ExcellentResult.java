import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double rating = Double.parseDouble(scan.nextLine());

        if (rating >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}

