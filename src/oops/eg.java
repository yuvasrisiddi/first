package oops;

public class eg {
    public static void main(String[] args){
        company c=new company();
        c.mailcheck();

    }
}
class company extends employee{
    @Override
    double computepay(){
        return 10;
    }
}

abstract class employee{
    private String name;
    private int id;
    employee(){
        System.out.println("dc");
    }
    employee(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("pc");
    }

    abstract double computepay();
    void mailcheck(){
        System.out.println("mail check" +this.name+ " " +this.id);
    }


}
