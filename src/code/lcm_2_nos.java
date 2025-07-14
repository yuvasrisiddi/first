package code;

public class lcm_2_nos {
    public static void main(String[] args){
        int a =12;
        int b=6;
        int gcd=gcd_lcm(a,b);
        int lcm=a*b/gcd;
        System.out.println("lcm" +a+ "and" +b+ "is" +lcm);

    }

    static int gcd_lcm(int a,int b){
        while(b!=0){
            int temp=a;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
