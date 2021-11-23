package WorkingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {
	static final String DB_URL = "jdbc:mysql://localhost/jdbcpractice";
	static final String USER = "root";
	static final String PASS = "123456";

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			// Execute a query
			System.out.println("Inserting records into the table...");
			String sql = "INSERT INTO employee VALUES (1, 'Rajendra',50000)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO employee VALUES (2, 'Prassana',60000)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO employee VALUES (3, 'Deepika',70000)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO employee VALUES(4, 'Chintu',80000)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO employee VALUES(5, 'Poornima',90000)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
