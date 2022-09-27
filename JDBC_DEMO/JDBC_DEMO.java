package jdbc_demo;
import java.sql.*;
import java.util.Scanner;

public class JDBC_DEMO {
    public static void main(String[] args)throws Exception {
try{
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","@i1r2s3h4a5d6@");
      Scanner s=new Scanner(System.in); 
    System.out.println("connection established");
            System.out.println("Enter  course-name,No_Of_Student and Fees ");
        PreparedStatement ps=conn.prepareStatement("insert into collage values(?,?,?)");
             ps.setString(1,s.nextLine());
             ps.setInt(2,s.nextInt());
             ps.setInt(3,s.nextInt());
             int x=ps.executeUpdate();
             System.out.println(x+" rows inserted");
            
     /* PreparedStatement ps=conn.prepareStatement("select *from collage");
      ResultSet rs=ps.executeQuery();
       while(rs.next()){
           System.out.println(rs.getString("Course")+"  "+rs.getInt("No_of_Student")+"  "+rs.getInt("Fees"));
       */
             
   }
        catch(SQLException e){
            System.out.println(e);
    }
    }
    
    
}
