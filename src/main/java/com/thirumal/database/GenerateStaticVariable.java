/**
 * 
 */
package com.thirumal.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Thirumal
 *
 */
public class GenerateStaticVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sql = "SELECT * FROM information_schema.columns where table_name = 'vote'";
		printVariables(sql);
		//getConnection();
	}

	private static void printVariables(String sql) {
		Statement statement = null;
		try {
			statement = getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println(": " + statement);
			System.out.println("Total number of row: " + resultSet.getFetchSize());
			while (resultSet.next()) {
				System.out.println("private " + convertToJavaDataType(resultSet.getString("data_type")) + " "
						+ saniziteForVariable(resultSet.getString("column_name")) + ";");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private static String convertToJavaDataType(String dataType) {
		switch (dataType) {
		case "integer":
			return "Integer";
		case "character varying": 
			return "String";
		case "date":
			return "Date";
		case "money":
			return "BigDecimal";
		case "timestamp":
			return "Date";
		case "timestamp without time zone":
			return "Date";
		case "numeric":
			return "Double";
		default: 
			System.out.println("Java data type is not found for: " + dataType);
		}
		return dataType;
	}

	public static final String saniziteForVariable(String variable){
		StringBuilder result = new StringBuilder();
		String[] variableAsStrArray = variable.split("_");
		result.append(variableAsStrArray[0]);
		for(int i = 1; i < variableAsStrArray.length; i++) {			
			result.append(variableAsStrArray[i].substring(0, 1).toUpperCase());
			result.append(variableAsStrArray[i].substring(1));
		}		
		return result.toString();
	}
	
	private static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
		}
		System.out.println("PostgreSQL JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://192.168.0.20:5432/indsolv", "postgres",	"enkindle");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		if (connection != null) {
			try {
				connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		/*Statement statement;
		try {
			statement = connection.createStatement();
			System.out.println("s: " + statement);
			ResultSet rs = statement.executeQuery("SELECT * FROM indsolv.party");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		return connection;
	}
}
