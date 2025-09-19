public class CountdownTimer {
    public static void main(String[] args) {
        int seconds = 10;

        try {
            while (seconds > 0) {
                int minutes = seconds / 60;
                int secs = seconds % 60;

                System.out.printf("%02d:%02d%n", minutes, secs);

                Thread.sleep(1000); // wait 1 second
                seconds--;
            }

            System.out.println("Time up");

        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
    }
}
