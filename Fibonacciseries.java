public class Fibonacciseries {
    int series(int n){
        if( n <= 1){
            return n;
        }
        return series(n - 1) + series(n - 2);
    }

    public static void main(String[] args){
        Fibonacciseries obj = new Fibonacciseries();
        int s = 10;
        for(int i = 0; i < s; i++ ){
            System.out.println(obj.series(i));
        }

    }
}
