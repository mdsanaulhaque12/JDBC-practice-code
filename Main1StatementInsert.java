package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class Main1StatementInsert {
    public static void main(String[] args) {
        System.out.println("enter name roll");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int roll=sc.nextInt();
        sc.nextLine();
        try {

            //1. load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.create connection
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","password");

            //3.statement
            Statement s = con.createStatement();

            //4.execute
            int count = s.executeUpdate("insert into student values('"+name+"','"+roll+"')");
            System.out.println("Rows affected: " + count);

        }catch(Exception e){e.printStackTrace();}
    }
}
