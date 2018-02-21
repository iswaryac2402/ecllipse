package accessOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnect {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conob = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"Fall-2016");
			Statement st = conob.createStatement();
			st.execute("create table paper(sno int,name varchar(90),age int)");
			System.out.println("done");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
