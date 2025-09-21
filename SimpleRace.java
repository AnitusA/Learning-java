class Racer extends Thread {
    private String name;

    Racer(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " ran step " + i);

            try {
                Thread.sleep((int)(Math.random() * 500));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name + "finished!");
    }
}

public class SimpleRace {
    public static void main(String[] args) {
        System.out.println("Race Started!");

        Racer r1 = new Racer("Racer 1");
        Racer r2 = new Racer("Racer 2");

        r1.start();
        r2.start();
    }
}
