public class reversesentence {
    public static void main(String[] args){
        String word = "May i fail in my love but i want to suceend in my life";
        String[] sentence = word.split(" ");
        for( int i = sentence.length-1; i >= 0; i--){
        System.out.print(sentence[i] + " ");
        }
    }
    
    
}
