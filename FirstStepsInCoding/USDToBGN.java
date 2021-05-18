import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //1. променлива за доларите (конзолата)
        //2. 1 usd = 1.79549 BGN
        //3. променлива за бг лева = долари * курс
        //4. принтираме

        //тип, име, стойност
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);

    }
}