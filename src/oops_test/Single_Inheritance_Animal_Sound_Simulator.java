package oops_test;

public class Single_Inheritance_Animal_Sound_Simulator {
    public static void main(String[] args){

        Cat c1=new Cat();
        c1.meow();
        c1.makeSound();


    }
}
class Animal {
    void makeSound(){
        System.out.println("sound");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}
