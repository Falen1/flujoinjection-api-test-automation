package ejemplo.utils.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection{

	public Connection OpenConnection(String dbUrl, String dbUsuario, String dbPassword) throws SQLException {
		return DriverManager.getConnection(dbUrl, dbUsuario, dbPassword);
	}

	public void CloseConnection(Connection Conn) throws SQLException {
		Conn.close();
	}
}
