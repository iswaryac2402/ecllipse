package accessOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessDb {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Fall-2016");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			while (rs.next()) {
				System.out.println(rs.getInt("ID") + " " + rs.getString("NAME") + "" + rs.getInt("PHNO"));
			}
			// int sqlinsert = st.executeUpdate("insert into EMPLOYEES
			// values(2,'navya',2345)");
			// System.out.println(sqlinsert);
			int rows=st.executeUpdate("delete from EMPLOYEES where PHNO ='2345'");
			System.out.println(rows);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
