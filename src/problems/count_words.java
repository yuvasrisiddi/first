package problems;

public class count_words {
    public static void main(String[] args){
        String str="yuvasri dimpu vish u";
        String[] words=str.split("\\s+");

        System.out.println("words" +words.length);
    }
}
