package JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main2PreparedStatementCreate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","cdac@123");

        PreparedStatement ps = con.prepareStatement("CREATE TABLE car (name varchar(225)," +
                "brand varchar(225))");
        ps.executeUpdate();
        System.out.println("success");
    }
}
