interface Playable{
    void play();
    void pause();
    void stop();
}
class Game implements Playable{
    private String gamename;

    Game(String g){
        gamename  = g ;
    }

    public void play(){
        System.out.println(gamename + " is runing");
    }

    public void pause(){
        System.out.println( gamename + " is paused");
    }

    public void stop(){
        System.out.println( gamename + " is stopped");
    }

}

public class Interface {
    public static void main(String [] args){
        Game g1 = new Game("bashers");

        g1.play();
        g1.pause();
        g1.stop();
    }
}
