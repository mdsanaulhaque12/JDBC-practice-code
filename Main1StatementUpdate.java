package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main1StatementUpdate {
    public static void main(String[] args) {
        try{
            //1.load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2 create connection
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","password");

            //3. statement
            Statement s= con.createStatement();

            //4.execute statement
            int count=s.executeUpdate("update student set name='sumit' where rollno=110" );
            System.out.println(count+" rowsffected");


        }catch(Exception e){e.printStackTrace();}
    }
}
