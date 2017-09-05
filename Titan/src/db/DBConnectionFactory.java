package db;

import db.mysql.MySQLConnection;
import db.mongodb.MongoDBConnection;


public class DBConnectionFactory {
	
	private static final String DEFAULT_DB = "mysql";
	// private static final String DEFAULT_DB = "mongodb";

	// Create a DBConnection based on given db type.
	public static DBConnection getDBConnection(String db) {
		switch (db) {
		case "mysql":
			return MySQLConnection.getInstance();
		
		case "mongodb":
			return MongoDBConnection.getInstance();
		// You may try other dbs and add them here.

		// You may try other dbs and add them here.
		default:
			throw new IllegalArgumentException("Invalid db " + db);
		}
	}

	// This is overloading not overriding.
	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
	}
}




















