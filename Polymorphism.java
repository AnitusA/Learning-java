abstract class Greeting{
    abstract void hello();
}
public class Polymorphism {
    public static void main(String[] args){
        Greeting Mor = new Greeting(){
            public void hello(){
                System.out.println("Good morning");
            }
        };
        Greeting Evg = new Greeting(){
            public void hello(){
                System.out.println("Good Evening");
            }
        };

        Mor.hello();
        Evg.hello();
    }
}
