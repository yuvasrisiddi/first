package ex_01_Java_Basic;

public class string {
    public static void main(String[] args){
//        String s1="yuvasri";
//        s1="yuva";
//        System.out.println(s1);
//        String s2=new String("yuvasri");
//        System.out.println(s2);
//        String s1="yuvasri";
//        s1=s1.toUpperCase();
////        s1.toLowerCase();
//        System.out.println(s1);


//        String s1="yuva";
//        s1=s1.concat("sri");
//        System.out.println(s1);

//        String s1="yuvasri";
//        System.out.println(s1.length());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.concat("dimpu"));

        String s1="yuvasri";
        String s2="yuvasri";
        String s3="yuvasri";

        String s4=new String("yuvasri");
        String s5=new String("yuvasri");
        String s6=new String("YUVAsri");

        System.out.println(s1==s5);
        System.out.println(s2==s6);
        System.out.println(s4==s5);
        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));

        String y="yuvasri";
        System.out.println(y.contains("a"));
        System.out.println(y.contains("z"));

        String y1="madam";
        System.out.println(y1.indexOf("m"));
        System.out.println(y1.lastIndexOf("m"));

        System.out.println(y1.replace("d","n"));

        System.out.println(y1.startsWith("m"));
        System.out.println(y1.endsWith("z"));

        String v="yuva@com.vishnu@123";
        String[] split=v.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

//        String yuva="wsdfgbbnbgvfcyhu jsdhugfuhdijsk wefjrdklm";
//        System.out.println(yuva.substring(12,14));

//       int i=123;
//       String s=String.valueOf(i);
//       System.out.println(s);

//       String s1="     hello ";
//       System.out.println(s1.trim());


//       String s2="yuvasri";
//       char [] s3=s2.toCharArray();
//       System.out.println(s3);

//        String s2= "hello";
//        char[] arr = s2.toCharArray(); // ['h','e','l','l','o']
//        System.out.println(arr);
//
//        String t="";
//        boolean t1=t.isEmpty();
//        System.out.println(t1);
//
//        String ch="hello";
//        char c=ch.charAt(0);
//        System.out.println(c);
//
//







    }
}
