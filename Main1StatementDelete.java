package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main1StatementDelete {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","password");

            Statement s= con.createStatement();
            int count = s.executeUpdate("delete from student where rollno=110");
            System.out.println(count+" rows affected");

        }catch(Exception e){e.printStackTrace();}
    }
}
