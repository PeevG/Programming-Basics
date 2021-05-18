import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. прочетем входните данни и да ги съхраним в променливи
        //2. за колко часа трябва да прочете книгата = бр.стр / стр. за час
        //3. колко часа на ден  = за колко часа трябва да прочете книгата / дни
        //4. печатаме получените часове
        int pagesBook = Integer.parseInt(scanner.nextLine());
        int pagePerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hoursToRead = pagesBook /  pagePerHour; //колко часа отнема книгата
        int hoursPerDay = hoursToRead / daysToRead; //колко часа на ден
        System.out.println(hoursPerDay);

    }
}
