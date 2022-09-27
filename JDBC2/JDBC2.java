package jdbc2;

import com.sun.jdi.connect.spi.Connection;
import java.util.Scanner;
import java.sql.*;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statment;


public class JDBC2 {
    public static void main(String[] args) {
try{
     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root", "@i1r2s3h4a5d6@");
             System.out.println("connected....");
          /*   Scanner s=new Scanner(System.in);
             System.out.println("Enter  course-name,No_Of_Student and Fees ");
             PreparedStatement ps=conn.prepareStatement("insert into collagenvalues(?,?,?)");
             ps.setString(1,s.nextLine());
             ps.setInt(2,s.nextInt());
             ps.setInt(3,s.nextInt());
             
             int x=ps.executeUpdate();
             System.out.println(x+" rows inserted");*/
             
   }
        catch(Exception e){
            System.out.println(e);
    }
    }
    
}
