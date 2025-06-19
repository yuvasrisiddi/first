package problems;

import java.util.Scanner;

public class vowels_constants {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the String:");
        String input=scanner.nextLine();
        int[] count=countVowelsConstants(input);
        System.out.println("Vowels_count:" +count[0]);
        System.out.println("Constants_count:" +count[1]);
        scanner.close();

    }
    public static int[] countVowelsConstants(String str){
        int vowelscount=0;
        int constantscount=0;
        String Vowels="aeiouAEIOU";
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                if(Vowels.indexOf(c)!=-1)
                {
                    vowelscount++;
                }
                else {
                    constantscount++;
                }

            }
        }
        return new int[] {vowelscount,constantscount};

    }
}
