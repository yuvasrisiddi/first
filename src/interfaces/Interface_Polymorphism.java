package interfaces;

public class Interface_Polymorphism {
    public static void main(String[] args){
        playable yuva;
        yuva =new guitar();
        yuva.play();
        yuva =new piano();
        yuva.play();


    }
}





interface  playable{
    void play();
}

class guitar implements playable{


    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}
class piano implements playable{

    public void play(){
        System.out.println("Playing Piano");
    }

}


