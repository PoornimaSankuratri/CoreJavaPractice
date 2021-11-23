package WorkingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
	static final String DB_URL = "jdbc:mysql://localhost/jdbcpractice";
	static final String USER = "root";
	static final String PASS = "123456";
	static final String QUERY = "SELECT * FROM employee";

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String query1 = "delete from employee where id = 6";

			stmt.executeUpdate(query1);

			ResultSet rs = stmt.executeQuery(QUERY);
			System.out.println("id EmployeeName  Salary");

			while (rs.next()) {
				int empid = rs.getInt("id");
				String EmployeeName = rs.getString("EmployeeName");
				int Salary = rs.getInt("Salary");
				System.out.println(empid + "    " + EmployeeName + "   " + Salary);
			}
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
		}
	}
}
