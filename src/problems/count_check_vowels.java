import java.util.Scanner;
public class count_check_vowels{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a letter");
        char ch=scanner.next().toLowerCase().charAt(0);
        if(ch>='a' &&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch +"is a vowel");
            }
            else{
                System.out.println(ch +"is a constant");
            }
        }
        else{
            System.out.println("invalid");
        }

    }
}
