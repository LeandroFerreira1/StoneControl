package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static Connection getConexao() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://localhost:3306/stonecontrol";
		
		Connection con = DriverManager.getConnection(url, "root", "mysql");
		
		return con;
		
	}
	

}
