import java.util.Scanner;

public class CurrentDay {
    int day;
    public CurrentDay(int day) {

        {
            Scanner scanner = new Scanner(System.in);
            if (day <= 5) {
                System.out.println("Будний день");
            } else if (day > 5) {
                System.out.println("Выходной день");
            }
        }
    }
}
