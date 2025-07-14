package oops.polymerphism;

public class method_overloading {
    public static void main(String[] args){
        method m1=new method();
         int m=m1.add(1,2);
         String  m2=m1.add("yuva","sri");
         System.out.println(m);
         System.out.println(m2);


    }
}
class method{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
       return a-b-c;
    }
    String  add(String a,String b){
        return a+b;

    }

}

