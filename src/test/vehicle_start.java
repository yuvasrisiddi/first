package test;

public class vehicle_start {
    public static void main(String[] args){
        bike b=new bike();
        b.start();

        car c=new car();
        c.start();


    }
}
class vehicle{
    void start(){
        System.out.println("starts the vehicle");

    }
}
class bike extends vehicle{
    @Override
    void start(){
        System.out.println("Kick start the bike");

    }
}
class car extends vehicle{
    @Override
    void start(){
        System.out.println("Turn the key to start the car");
    }

}

