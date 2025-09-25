import java.util.List;

public class Listimmutable {
    public static void main(String[] args){
        List<Integer> number = List.of(1,2,3,4,5,6);

        number.stream()
        .filter(n-> n%2 == 0)
        .map(n-> n*n)
        .forEach(System.out::println);
    }
    
}
