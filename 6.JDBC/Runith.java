import java.util.*;
import java.sql.*;
public class Runith {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
            // if asked for statement 
                // String query = "select *from customers";
                // Statement stmt = conn.createStatement();
                // ResultSet rs = stmt.executeQuery(query);  (or)  int num = stmt.executeUpdate(query);
                // while(rs.next()){
                //     String name1 = rs.getString("first_name");
                //     String name2 = rs.getString("last_name");
                //     System.out.println(name1+name2);
                // }

            //if asked for prepared statement 
                // String query2 = "select *from customers where customer_id = ?";
                // PreparedStatement stm = conn.prepareStatement(query2);
                // stm.setInt(1,4);
                // ResultSet rsk = stm.executeQuery(); (OR)  int numr = stmt.executeUpdate();
                // while(rs.next()){
                //     String name1 = rsk.getString("first_name");
                //     String name2 = rsk.getString("last_name");
                //     System.out.println(name1+name2);
                // }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
