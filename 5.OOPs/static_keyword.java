public class static_keyword {
    public static void main(String args[]){
        student s1 = new student();

        student s2 = new student();
        System.out.println(s2.schoolname);

        s1.schoolname = "STJHS";
        System.out.println(s2.schoolname);

        student s3 = new student();
        System.out.println(s3.schoolname);
    }
}

class student {
    String name;
    int roll;
    static String schoolname = "KMIT";

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }

    static int returnpercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
}
