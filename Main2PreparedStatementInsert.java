package JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main2PreparedStatementInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","cdac@123");

        PreparedStatement ps = con.prepareStatement("INSERT INTO CAR values(?,?)");
        ps.setString(1,"punch");
        ps.setString(2,"tata");
        ps.addBatch();

        ps.setString(1,"safari");
        ps.setString(2,"tata");
        ps.addBatch();

        ps.executeBatch();
        System.out.println("success");


    }
}
