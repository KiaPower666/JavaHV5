import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий день(число от 1 до 7)");
        CurrentDay day = new CurrentDay(scanner.nextInt());
        System.out.println("Введите текущее время(число от 0 до 23)");
        CurrentTime time = new CurrentTime(scanner.nextInt());
        System.out.println("Хозяева дома? (Введите число от 0 до 1)");
        Signaling signaling = new Signaling(scanner.nextInt());
    }
}
