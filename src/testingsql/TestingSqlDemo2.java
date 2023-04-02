package testingsql;
import java.sql.*;

public class TestingSqlDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Students",
																"root","shxxbi131");
			Statement statement = connection.createStatement();
			String sqlUpdate = " Insert into data(`id`,`name`,`mark`) values(2,'Andrew',80)";
			statement.executeUpdate(sqlUpdate);
			sqlUpdate = " Insert into data(`id`,`name`,`mark`) values(3,'Arthur',73)";
			statement.executeUpdate(sqlUpdate);
			sqlUpdate = " Insert into data(`id`,`name`,`mark`) values(4,'Amelia',83)";
			statement.executeUpdate(sqlUpdate);
			sqlUpdate = " Insert into data(`id`,`name`,`mark`) values(5,'Amber',80)";
			statement.executeUpdate(sqlUpdate);
			PreparedStatement preparedStatement = connection.prepareStatement("Select * from data");
			ResultSet result = preparedStatement.executeQuery();
			
			while(result.next()) {
				int idNo = result.getInt("id");
				String name = result.getString("name");
				int mark = result.getInt("mark");
				System.out.println(idNo + " " + name + " " + mark );
			}
		
		}
		catch(SQLException se){
			System.out.println("Database is not conected!");
		}

	}

}
