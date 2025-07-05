package oops_test;

public class multiple_numbers {
    public static void main(String[] args){
        MathOperations m=new MathOperations();
        int m1=m.mul(1,2);
        int m2=m.mul(1,2,3);
        System.out.println(m1);
        System.out.println(m2);

    }
}
class MathOperations {
    int mul(int a,int b){
        return a*b;
    }
    int mul(int a,int b,int c){
        return a*b*c;
    }
}
