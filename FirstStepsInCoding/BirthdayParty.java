import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //наем на залата -> от конзолата
        //цена за тортата -> 20 % от залата = 0.2 * наем на залата
        //цена за напитки -> тортата - 45% = тортата - 0.45 * тортата
        //цена за аниматора -> 1 / 3 от наем на залата = наем на залата / 3
        //разходите = наем на залата + торта + напитки + аниматор
        
        int hallPrice = Integer.parseInt(scanner.nextLine());
        double cakePrice = 0.2 * hallPrice;
        double drinksPrice = cakePrice - 0.45 * cakePrice; //0.55 * cakePrice
        double animatorPrice = hallPrice / 3.0;
        double expenses = hallPrice + cakePrice + drinksPrice + animatorPrice;
        System.out.println(expenses);
    }
}