package jdbc1;
import java.sql.*;
import java.util.Scanner;

public class JDBC1 {
    
    public static int mainmenue(){
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("\n\n\n########  MENUE  ########\n");
        System.out.println("1. Add Item");
        System.out.println("2. Show Item");
        System.out.println("3. Update Item");
        System.out.println("4. Delete Item");
        System.out.println("0. Exit");
        System.out.print("\n\nEnter your choice : ");
        c=s.nextInt();
        return c;
    }
   //////////////////// update menu ///////////////////////////////// 
    public static int update_menue(){
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("\n########  Update Menu  ########\n");
        System.out.println("1. Update Item Course_Name");
        System.out.println("2. Update Item No_of_Student");
        System.out.println("3. Update Item Fees");
        System.out.println("4. Back");
        System.out.println("0. Exit");
        System.out.print("\n\nEnter your choice : ");
        c=s.nextInt();
        return c;
    }
    ////////////////  delete menu  /////////////////
    public static int delete_menue(){
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("\n########  Delete Menu  ########\n");
        System.out.println("1. Delete row by Course_Name");
        System.out.println("2. Delete row by No_of_Student");
        System.out.println("3. Delete row by Fees");
        System.out.println("4. Back");
        System.out.println("0. Exit");
        System.out.print("\n\nEnter your choice : ");
        c=s.nextInt();
        return c;
    }
    //////////////////////  main //////////////////////////////
    public static void main(String[] args)throws Exception {
        
try{
        while(true){

    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","@i1r2s3h4a5d6@");
      Scanner s=new Scanner(System.in); 
    System.out.println("connection established");
    //////////////////  loop  /////////////////////////
    switch(JDBC1.mainmenue()){
case 1:
           String cname;
           int nos;
           int fees;
            System.out.println("Enter  course-name,No_Of_Student and Fees ");
             cname=s.nextLine();
             nos=s.nextInt();
             fees=s.nextInt();
        PreparedStatement ps=conn.prepareStatement("insert into collage values(?,?,?)");
             ps.setString(1,cname);
             ps.setInt(2,nos);
             ps.setInt(3,fees);
             int x=ps.executeUpdate();
             System.out.println(x+" rows inserted");
            break;
case 2:
          PreparedStatement ps2=conn.prepareStatement("select *from collage");
          int i=0;
      ResultSet rs=ps2.executeQuery();
      System.out.println("\nCourse   No_Student   Fees\n");
       while(rs.next()){
           System.out.println(rs.getString("Course")+"\t  "+rs.getInt("No_of_Student")+"\t\t"+rs.getInt("Fees"));
                i++; }
       System.out.println("\t\n"+i+" rows selected");
            break;
case 3:
               switch(JDBC1.update_menue())
               {
                  case 1:
       PreparedStatement ps5=conn.prepareStatement("update collage set Course=? where No_of_Student=?");
                    System.out.println("Update course where No_of_Student ");
                    ps5.setString(1, s.nextLine());
                    ps5.setInt(2,s.nextInt());
                   int x1= ps5.executeUpdate();
                       System.out.println(x1+" rows updated");
                       break;
                   case 2:
          
          PreparedStatement ps4=conn.prepareStatement("update collage set No_of_Student=? where Fees=?");
                    System.out.println("Enter  No_of_Student where fees");
                    ps4.setInt(1,s.nextInt());
                    ps4.setInt(2,s.nextInt());
                   int x2= ps4.executeUpdate();
                       System.out.println(x2+" rows updated");
                       break;
                   case 3:
            PreparedStatement ps6=conn.prepareStatement("update collage set Fees=? where Course=?");
                    System.out.println("Update Fees where Course");
                    ps6.setInt(1,s.nextInt());
                    s.nextLine();
                    ps6.setString(2,s.nextLine());
                   int x3= ps6.executeUpdate();
                       System.out.println(x3+" rows updated");
                       break;
                   case 4:
                       break;
                   case 0:
                       System.out.println("Thank You !!");
                       System.exit(0);
                       break;
                   default : System.out.println("Invalid Choice");
               }
            break;
case 4:
     switch(JDBC1.delete_menue())
               {
                  case 1:
       PreparedStatement ps6=conn.prepareStatement("delete from  collage where Course=?");
                    System.out.println("Enter course");
                    ps6.setString(1, s.nextLine());
                   int x1= ps6.executeUpdate();
                       System.out.println(x1+" rows deleted");
                       break;
                   case 2:
          
      PreparedStatement ps7=conn.prepareStatement("delete from  collage where No_of_Student=?");

                    System.out.println("Enter  No_of_Student");
                    ps7.setInt(1,s.nextInt());
                   int x2= ps7.executeUpdate();
                       System.out.println(x2+" rows deleted");
                       break;
                   case 3:
            PreparedStatement ps8=conn.prepareStatement("delete from collage where Fees=?");
                    System.out.println("Enter Fees");
                    ps8.setInt(1,s.nextInt());
                   int x3= ps8.executeUpdate();
                       System.out.println(x3+" rows deleted");
                       break;
                   case 4:
                       break;
                   case 0:
                       System.out.println("Thank You !!");
                       System.exit(0);
                       break;
                   default : System.out.println("Invalid Choice");
               }
    break;
case 0:
            System.out.println("Thank You !!");
            System.exit(0);
            break;
        default : System.out.println("Invalid choice");
    }
    }
  }
        catch(SQLException e){
            System.out.println(e);
    }
    }
    
}
