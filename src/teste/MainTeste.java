package teste;

import java.sql.SQLException;

import entidade.Espessura;

public class MainTeste {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
	
		for (Espessura i : Espessura.values()) {
			System.out.println(i);
		}
		
		
		
	}

}
