package oops;



public class abstraction {
    public static void main(String[] args){
        wagon w=new wagon();
        w.driver();
    }






}

abstract class engine{
    abstract  void startengine();
    abstract void stopengine();

    void checkengine(){
        System.out.println("everything is good!");
    }
}

class wagon extends engine{

    @Override
    void startengine() {
        System.out.println("start");
    }

    @Override
    void stopengine() {
        System.out.println("stop");

    }
    void driver(){
        checkengine();
        startengine();
        stopengine();

    }
}
