package WorkingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {
	static final String DB_URL = "jdbc:mysql://localhost/jdbcpractice";
	static final String USER = "root";
	static final String PASS = "123456";
	static final String QUERY = "SELECT * FROM employee";

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
			while (rs.next()) {
				// Display values
				System.out.print("ID: " + rs.getInt("id"));
				System.out.print(", EmployeeName: " + rs.getString("EmployeeName"));
				System.out.println(", Salary: " + rs.getString("Salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
