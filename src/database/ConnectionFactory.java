package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection(final String ipAdress, final String port, final String nameDb, final String user, final String password) throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://" + ipAdress + ":" + port + "/" + nameDb, user, password);
    }
}
