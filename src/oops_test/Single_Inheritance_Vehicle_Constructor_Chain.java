package oops_test;

public class Single_Inheritance_Vehicle_Constructor_Chain {
    public static void main(String[] args){
        Bike b1=new Bike();
        b1.Bike();


    }
}

class Vehicle {
    void Vehicle(){
        System.out.println("Vehicle is ready");
    }
}
class Bike  extends Vehicle {
    void Bike(){
        System.out.println("Bike is ready");
    }
}






















