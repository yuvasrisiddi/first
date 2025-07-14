package abstract_test;

public class abstarctvsconcretemethod {
    public static void main(String[] args){
        child c=new child();
        c.show();
        c.display();

    }
}
abstract class parent{
    abstract void show();
    public void display(){
        System.out.println("concrete method");
    }

}
 class child extends parent{
    @Override
    void show(){
        System.out.println("abstract method");

    }

}
