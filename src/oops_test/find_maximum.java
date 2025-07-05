package oops_test;

public class find_maximum {
    public static void main(String [] args){
        utility u=new utility();
        int u1=u.max(1,2,3);
        System.out.println("max value:" +u1);

        int u2=u.max(1,2);
        System.out.println("max value" +u2);


    }
}
class utility{
    int max(int a,int b){
        return (a>b) ? a:b;
    }
    int max(int a,int b,int c){
        return max(max(a,b),c);
    }
}
