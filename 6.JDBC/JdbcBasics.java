import java.sql.*;
public class JdbcBasics {

    private static final String url = "jdbc:mysql://localhost:3306/practice";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement state = conn.createStatement();
            String query = "SELECT *FROM student";
            // String query2 = String.format("INSERT INTO student(name , age , marks) VALUES('%s',%o,%f)","uday",21,99.9);
            // String query3 = String.format("UPDATE student SET marks = %f WHERE name = '%s'",94.4,"sankeerth");
            // String query4 = String.format("DELETE FROM student WHERE id = %o",6);
            // int rowsaffect = state.executeUpdate(query3);
            // int rowsafftected = state.executeUpdate(query2);
            // int rows = state.executeUpdate(query4);
            ResultSet result = state.executeQuery(query);
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                double marks = result.getDouble("marks");
                System.out.print("ID: "+id);
                System.out.print(" NAME: "+name);
                System.out.print(" AGE: "+age);
                System.out.print("MARKS: "+marks);
                System.out.println();
                System.out.println();
            }

            // if(rowsafftected>0){
            //     System.out.println("data updated successfully");
            // }
            // else{
            //     System.out.println("data not inserted");
            // }
            // System.out.println();
            // System.out.println( );
            // if(rowsaffect>0){
            //     System.out.println("data updated successfully");
            // }else{
            //     System.out.println("data not inserted");
            // }
        }catch(Exception sk){
            System.out.println(sk);
        }
    }
}