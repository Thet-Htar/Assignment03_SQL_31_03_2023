package testingsql;
import java.sql.*;

public class TestingSqlConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testing","root","shxxbi131");
			Statement statement = connection.createStatement();
			String sqlUpdate = " Insert into schoolId values(1)";
			statement.executeUpdate(sqlUpdate);
		}
		catch(Exception e){
			System.out.println("Database is not conected!");
		}
}
}
