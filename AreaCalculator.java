public class AreaCalculator {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, int height) {
    
            return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        System.out.println("Circle Area: " + ac.calculateArea(5));
        System.out.println("Rectangle Area: " + ac.calculateArea(4, 6));
        System.out.println("Triangle Area: " + ac.calculateArea(3, 7));
    }
}
