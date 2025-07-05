package oops_test;

public class greet_user {
    public static void main(String [] args){
        Greeter g1=new Greeter();
        String g=g1.greet();
        System.out.println(g);

        String g2=g1.greet( "Hello, [name]!");
        System.out.println(g2);

    }
}
class Greeter{
    String greet(){
        return "Hello!";
    }
    String greet(String name){
        return name;
    }
}
