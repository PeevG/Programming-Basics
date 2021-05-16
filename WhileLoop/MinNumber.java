import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String number = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!(number.equals("Stop"))) {
            int num = Integer.parseInt(number);
            if (num <= minNum) {
                minNum = num;
            }
            number = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
