package oops;

public class test1 {
    public static void main(String[] args){
        dog d=new dog();
        d.sound();
        cat c=new cat();
        c.sound();



    }
}

abstract class animal{
    abstract void sound();

}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("cat meows");
    }
}

