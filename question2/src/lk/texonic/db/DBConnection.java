package lk.texonic.db;/*
 * @Author  dilus
 * @Project question2
 * @Created 15/03/2024 - 9:38 PM

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/texonic", "root", "1234");

    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();



        }
        return dbConnection;
    }
    public Connection getConnection(){

        return this.connection;
    }
}
