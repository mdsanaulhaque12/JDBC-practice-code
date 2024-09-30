package JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main2PreparedStatementUpdate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","cdac@123");

        System.out.println("enter name and brand  and oldname for updating tables");
        Scanner sc = new Scanner(System.in);

        String name=sc.nextLine();
        String brand=sc.nextLine();
        String oldName=sc.nextLine();

        PreparedStatement ps= con.prepareStatement("update car set name='"+name+"',brand='"+brand+"' where name='"+oldName+"'");
        ps.executeUpdate();
        System.out.println("success");
    }
}
