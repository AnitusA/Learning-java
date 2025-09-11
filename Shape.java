abstract class Shapes{
    abstract void area();
}

class circle extends Shapes{
    double radius;
    circle(double r){
        radius = r;
    }

    void area(){
        System.out.println("The area of the circle is " + (3.14*radius*radius));
    }
}
class square extends Shapes{
    double length;
    square(double l){
        length = l;
    }

    void area(){
        System.out.println("The area of the circle is " + (length*length));
    }
}
public class Shape{
    public static void main(String[] args){
        Shapes c = new circle(6);
        Shapes s = new square(8);
        
        c.area();
        s.area();
    }
    
}
