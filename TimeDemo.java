import java.time.LocalDate;
import java.time.LocalTime;

public class TimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        System.out.println("Today's Date: " + today);
        System.out.println("Current Time: " + now);
    }
}
