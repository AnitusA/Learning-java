public class Modernswitch {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        String message = switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "It's a weekday, keep working";
            case SATURDAY, SUNDAY -> "It's the weekend, enjoy your rest";
        };

        System.out.println("Today is " + today);
        System.out.println(message);
    }
}
