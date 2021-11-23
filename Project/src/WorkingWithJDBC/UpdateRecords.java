package WorkingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecords {
	static final String DB_URL = "jdbc:mysql://localhost/jdbcpractice";
	static final String USER = "root";
	static final String PASS = "123456";
	static final String QUERY = "SELECT * FROM Employee";

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String query1 = "update employee set EmployeeName = 'Venky' where id = 4";
			String query2 = "insert into employee values(6,'Sweety',70000)";

			stmt.execute(query1);
			stmt.execute(query2);

			ResultSet rs = stmt.executeQuery(QUERY);
			System.out.println("id  EmployeeName Salary");

			while (rs.next()) {
				int id = rs.getInt("id");
				String EmployeeName = rs.getString("EmployeeName");
				String Salary = rs.getString("Salary");
				System.out.println(id + "   " + EmployeeName + "    " + Salary);
			}
		} catch (

		SQLException e) {
			System.out.println("SQL exception occured" + e);
		}
	}
}
