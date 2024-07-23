package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection connectDB_JDBC() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB?serverTimezone=UTC", "admin", "password");
    }
    public static Connection connectDB_Hibernate() {
        return null;
    }
}
