package code;

public class all_primeno {
    public static void main(String[] args){
        System.out.println("enter the prime numbers 1to 100");
        for(int n=2;n<=100;n++) {
            boolean is_prime = true;

            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    is_prime=false;
                    break;
                }
            }
            if(is_prime){
                System.out.println(n+ "");
            }

        }

    }

}
