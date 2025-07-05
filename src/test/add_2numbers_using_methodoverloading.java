package test;

public class add_2numbers_using_methodoverloading {
    public static void main(String[] args){
        calc c1=new calc();
         int c=c1.add(1,2);
         System.out.println(c);
         double d=c1.add(1.34,44.56);
         System.out.println(d);


    }
}
class calc{
    int add(int a ,int b){
        return a+b;
    }
    double add(double a ,double b){
        return a+b;
    }
}
