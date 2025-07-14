package abstract_test;

public class AbstractClasswithConstructor {
    public static void main(String[] args){
        concreate c=new concreate() ;
        c.method();



        }
}
abstract class abstractclass{
    abstractclass(){
        System.out.println("Abstract class constructor called");
    }
    public void method(){
        System.out.println("Method from abstract class");
    }
    abstract void main();

}

class concreate extends abstractclass{

    concreate(){

    }
    @Override
    void main(){

    }

}
