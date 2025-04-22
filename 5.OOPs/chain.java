public class chain {
    public static void main(String args[]){
        student sk = new student("H.no 173 lalbazar trimulgheery secunderabad","CSE");

    }
}

class human{
    String name;
    int age;
    float height;
    float weight;
    String dateofbirth;
    human(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("name : "+this.name+"\nage : "+this.age);
    }
    human(String dateofbirth){
        this("poosa shireesh kumar",18);
        this.dateofbirth = dateofbirth;
        System.out.println("date of birth : "+this.dateofbirth);
    }
    human(float height, float weight){
        this("5th january 2005");
        this.height = height;
        this.weight = weight;
        System.out.println("height : "+this.height+"\nweight : "+this.weight);
    }
}

class student extends human{
    String phoneNo;
    String address;
    int rollno;
    String deparment;

    student(String phoneNo,int rollno){
        super(6f,58f);
        this.phoneNo = phoneNo;
        this.rollno = rollno;
        System.out.println("phoneNo : "+this.phoneNo+"\nrollNo : "+this.rollno);
    }

    student(String address,String department){
        this("7032581911",250);
        this.address = address;
        this.deparment = department;
        System.out.println("address : "+this.address+"\ndepartment : "+this.deparment);
    }
}