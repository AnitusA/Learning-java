class Vehicles{
    void run(){
        System.out.println("Vehicles is runing ");
    }
}
class Car extends Vehicles{
    void run(){
        System.out.println("Car is moving");
    }
}
class Bike extends Vehicles{
    void run(){
        System.out.println("Bike is chasing at 123 km/h");
    }
}


public class Vehicle{
    public static void main(String[] agrs){
        Vehicles v1 = new Car();
        Vehicles v2 = new Bike();
        Vehicles v3 = new Vehicles();

        v1.run();
        v2.run();
        v3.run();
    }
    
}
