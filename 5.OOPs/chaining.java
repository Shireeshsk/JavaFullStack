public class chaining {
    public static void main(String args[]){
        employee s = new employee("7032581911","H.no 173 lalbazar trimulgheery secunderabad");
    }
}

class employee{
    String name;
    int employeeID;
    String designation;
    String phoneNo;
    String address;

    employee(String name, int employeeID){
        this.name = name;
        this.employeeID = employeeID;
        System.out.println("employee name : "+this.name+"\n"+"employeeID : "+this.employeeID);
    }

    employee(String designation){
        this("shireesh kumar poosa",2005);
        this.designation = designation;
        System.out.println("designation : "+this.designation);
    }

    employee(String phoneNo, String address){
        this("Sr S/W engineer");
        this.phoneNo = phoneNo;
        this.address = address;
        System.out.println("phoneNo : "+this.phoneNo+"\n"+"address: "+this.address);
    }
}