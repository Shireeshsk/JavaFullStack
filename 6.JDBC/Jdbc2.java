import java.sql.*;
public class Jdbc2{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
            String query = "UPDATE student SET marks = ? WHERE name = ?";
            PreparedStatement state = con.prepareStatement(query);
            state.setDouble(1,99.9);
            state.setString(2,"ankita");
            int rowsaffected = state.executeUpdate();
            if(rowsaffected > 0){
                System.out.println("updated successfully ");
            }
            else{
                System.out.println("not updated");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}