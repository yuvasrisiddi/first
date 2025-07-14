package oops;

public class bank_interest_calculation {
    public static void main(String[] args){
        sbi s=new sbi();
        double s1=s.getInterestRate();
        System.out.println(s1 + "%");
        hdfc h=new hdfc();
        double h1=h.getInterestRate();
        System.out.println(h1 +"%");

    }
}
abstract class bank{
    public abstract double getInterestRate();

}

class sbi extends bank{
    @Override
   public double getInterestRate(){
       return 6.5;

    }
}
class hdfc extends bank{
    @Override
    public  double getInterestRate(){
        return 7.0;
    }

}
