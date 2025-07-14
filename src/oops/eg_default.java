package oops;

public class eg_default {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();


        System.out.println(s1.student_name);
        System.out.println(s2.student_name);
        System.out.println(s1.student_id);



    }
     static class Student{
       String student_name;
       int student_id;
       Student(){
           student_name="yuvasri";
           student_id=12;
       }

    }
}
