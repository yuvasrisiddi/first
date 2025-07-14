public class Interface_with_Default_and_StatiMethod {
    public static void main(String[] args){
        car c=new car();
        c.start();
        vehicle.fueltype();



    }
}
interface vehicle{
    default void start(){
        System.out.println("vehicle started");
    }
    static void fueltype(){
        System.out.println("fuel type is petrol");
    }
}
class car implements vehicle{

}

