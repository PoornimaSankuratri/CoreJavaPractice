package WorkingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement {
	static final String DB_URL = "jdbc:mysql://localhost/jdbcpractice";
	static final String USER = "root";
	static final String PASS = "123456";
	static final String QUERY = "SELECT * FROM Employee";

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String query1 = "Select Count(id),Max(Salary),Min(Salary) from employee ";
			String query2 = "Select * from employee having Max(Salary)";

			ResultSet rs = stmt.executeQuery(query1);
			System.out.println("Count(id) MaxSalary  MinSalary");

			while (rs.next()) {
				int id = rs.getInt("Count(id)");
				int MaxSalary = rs.getInt("Max(Salary)");
				int MinSalary = rs.getInt("Min(Salary)");
				System.out.println(id + "         " + MaxSalary + "      " + MinSalary);
			}

			ResultSet rs1 = stmt.executeQuery(query2);
			System.out.println("id EmployeName   Salary");

			while (rs1.next()) {
				int empid = rs1.getInt("id");
				String EmployeeName = rs1.getString("EmployeeName");
				int Salary = rs1.getInt("Salary");
				System.out.println(empid + "    " + EmployeeName + "   " + Salary);
			}
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
		}
	}
}
