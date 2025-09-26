import java.util.Random;
public class Ramdomnumber {
    public static void main(String[] args){
        Random r = new Random();

        int num = r.nextInt(10);
        System.out.println("The random number is " + num);

    }
}
