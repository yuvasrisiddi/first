package interfaces;

public class eg2 {
    public static void main(String[] args){
        car c=new car();
        c.applybreak();
        c.start();
        c.stop();



    }
}


class car implements engine,brakes{
    @Override
    public void applybreak() {
        System.out.println("applybreak");
    }

    @Override
    public void start() {
        System.out.println("start");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }



}
interface brakes{
    void applybreak();

}
interface engine{
     abstract void start();
    void stop();
    default void complete(){
        System.out.println("complete class");
    }
}
