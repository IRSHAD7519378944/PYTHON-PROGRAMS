package jdbc;

import com.sun.jdi.connect.spi.Connection;

public class JDBC {

    public static void main(String[] args) {

        Connection conn=DriveManager.getConnection("jdbc:mysql://localhost:3306/Student","root","@i1r2s3h4a5d6@");
        System.out.println("Connection Estalished");
    }
    
}