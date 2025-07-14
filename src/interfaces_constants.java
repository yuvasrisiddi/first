public class interfaces_constants {
    public static void main(String[] args){
        Car c=new Car();
        c.access();


    }
}
interface Speedlimit{
    int  MAX_SPEED =120;

}
class Car implements Speedlimit{
    public void access(){
        System.out.println("max speed is:" +MAX_SPEED);
    }

}
