package accessOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Fall-2016");
			Statement st = co.createStatement();
			String strselect = "select title,price,qty from books";
			System.out.println("the sql query is:" + strselect);
			ResultSet rs = st.executeQuery(strselect);
			System.out.println("the records selected are:");
			int rowCount = 0;
			while (rs.next()) {
				String title = rs.getString("title");
				int qty = rs.getInt("qty");
				int price = rs.getInt("price");
				System.out.println(title + " " + qty + " " + price);
				++rowCount;
			}
			System.out.println("total num of records =" + rowCount);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
