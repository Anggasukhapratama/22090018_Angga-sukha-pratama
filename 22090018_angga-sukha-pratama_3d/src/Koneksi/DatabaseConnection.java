package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/cafenice", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Koneksi ke database gagal.");
        }
    }
}
