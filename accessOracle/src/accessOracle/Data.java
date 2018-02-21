package accessOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conob = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"Fall-2016");
			Statement st = conob.createStatement();
			ResultSet rs = st.executeQuery("select * from Ishwarya");
			while (rs.next()) {
				System.out.println(rs);
			}

			System.out.println("done");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
