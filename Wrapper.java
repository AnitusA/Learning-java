import java.util.*;

public class Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);

        int sum = list.get(0) + list.get(1);

        System.out.println("List: " + list);
        System.out.println("Sum: " + sum);
    }
}
