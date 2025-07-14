package oops;

public class constructor_overloading {
    public static void main(String[] args){
        Student s1=new Student("yuva",123);
        System.out.println(s1.name);
        System.out.println(s1.id);

        System.out.println("----------   --");

        Employee e1=new Employee("banglore","yuva",1234);
        Employee e2=new Employee("hyderabad","sri",45678);
        System.out.println(e1.name);
        System.out.println(e1.location);
        System.out.println(e1.salary);
        System.out.println("--------------------");
        System.out.println(e2.name);
        System.out.println(e2.location);
        System.out.println(e2.salary);


    }
    static class Student{
        String name;
        int id;
        Student(String name,int id){
            this.name=name;
            this.id=id;
        }
    }

    static class Employee{
        String location;
        String name;
        int salary;

        Employee(String location,String name,int salary){
            this.location=location;
            this.name=name;
            this.salary=salary;
        }
    }
}
