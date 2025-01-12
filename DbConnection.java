package recipes.dao;

import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.exceptions.CJConnectionFeatureNotAvailableException;
import com.mysql.cj.exceptions.StatementIsClosedException;
import com.mysql.cj.telemetry.TelemetryAttribute;

public class DbConnection {
private static final String SCHEMA_STRING = "recipes";
private static final String USER = "recipes";
private static final String PASSWORD_STRING = "recipes";
private static final String HO_STRING = "localhost";
private static final int PORT = 3306; }

public static Connection getConnection() {
	String urlString = String.format("jdbc.mysql://%s:%d/%s?user=%s&password=%s*useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);
	
	System.out.println("Connecting with url=" + url);
	
	try {
	Connection conn = DriverManager.getConnection(url);
	System.out.println("Successfully obtained connection!");
	return conn;
	
	} catch (SQLException e) {
		throw new DbException(e);
	
	
}
