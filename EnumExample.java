enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {

        Day today = Day.FRIDAY;

        System.out.println("Today is: " + today);

        System.out.println("All days of the week:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
