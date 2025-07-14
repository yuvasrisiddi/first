package interfaces;

public class Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args){
        document d=new document();
        d.print();
        d.show();



    }
}
interface  printable{
    void print();
}
interface showable{
    void show();
}
class document implements printable,showable{
    @Override
    public void print(){
        System.out.println("printing document");
    }

    @Override
    public void show() {

        System.out.println("showing document");
    }
}
