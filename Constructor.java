class Book {
    String title;
    String author;
    double price;

    public Book(String t,String a,double p){
        title = t;
        author = a;
        price = p;
    }

    public Book(String t,String a){
        title = t; 
        author = a;
        price = 300;
    }

    public void discount(double present){
        if( present > 0 && present <= 100){
            price = price - (price * present / 100);
        }
    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
}
}
public class Constructor{
    public static void main(String[] args){
        Book b1 = new Book("Bashers", "Pon Partheeban", 250.50);
        Book b2 = new Book("Growth", "Anitus A");

        b1.discount(10);
        b2.discount(20);

        b1.display();
        System.out.println();
        b2.display();

    }
}