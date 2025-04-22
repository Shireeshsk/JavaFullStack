class Student{
    String name;
    int roll;
    String password;

    Student(){
        System.out.println("constructor is called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int rollno){
        this.roll = rollno;
    }

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

}
public class Copyconstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "shireesh";
        s1.roll = 456;
        s1.password = "abcd";

        Student s2 = new Student(s1);
        s2.password = "xyz";

    }

}
