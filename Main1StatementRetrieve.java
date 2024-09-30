package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main1StatementRetrieve {
    public static void main(String [] args){
        try {
            //1.load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.Create Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","cdac@123");

            //3.Statement
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery("select * from student");

            while (rs.next()){
               String name=rs.getString(1);
               int roll = rs.getInt(2);
                System.out.println("name: "+name+"  roll : "+roll);
            }

        }catch(Exception e){e.printStackTrace();}
    }
}
