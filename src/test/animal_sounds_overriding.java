package test;

public class animal_sounds_overriding {
    public static void main(String[] args){
        dog a=new dog();
        a.sound();
        cat c=new cat();
        c.sound();

        cow o=new cow();
        o.sound();


    }
}
class Animal1{

    void sound()
    {
        System.out.println("default sound");

    }
}
class dog extends Animal1{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
class cat extends Animal1{
    void sound(){
        System.out.println("meow");
    }
}
class cow extends Animal1{
    void sound(){
        System.out.println("moo");
    }
}
