class bankAccount{
    private String password;
    public String username;
    public void setpassword(String pwd){
        password = pwd;
    }
    public String getpassword(){
        return password;
    }
}
public class OOPs {
    public static void main(String args[]){
        // pen p1 = new pen();
        // p1.setcolor("green");
        // p1.settip(10);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        // bankAccount myacc = new bankAccount();
        // myacc.username = "shireeshkumarpoosa";
        // myacc.setpassword("shireesh05");
        // System.out.println(myacc.getpassword());

        student s1 = new student();
        s1.name = "shireesh kumar poosa";
        s1.roll = 54;
        s1.department = "CSE";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 89;
        student s2 = new student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.department);
        s1.marks[2] = 100;
        for(int i = 0;i<3;i++){
            System.out.println(s2.marks[i]);
        };
    int marks[];
    student(){ 
        marks = new int[3];
    }// intializer
    k
    //shallow copy constructor
    // student(student s1){
    //     marks = new int[3];
    //     this.name = s1.name ;
    //     this.department = s1.department;
    //     this.marks = s1.marks;
    //     this.roll = s1.roll;
    // }


    //deep copy constructor 
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}