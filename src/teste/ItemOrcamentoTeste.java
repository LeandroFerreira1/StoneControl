package teste;

import java.sql.SQLException;

import dao.ItemOrcamentoDaoHib;
import entidade.Comercializavel;
import entidade.ItemOrcamento;
import entidade.Orcamento;

public class ItemOrcamentoTeste {

	
	public static void main(String[] args) throws SQLException {

		ItemOrcamento io = new ItemOrcamento();
		//Comercializavel c = new Comercializavel();
		//c.setId(1);
		//io.setIdComercializavel(c);
		Orcamento o = new Orcamento();
		o.setId(1);
		//io.setIdOrcamento(o);
		
		ItemOrcamentoDaoHib ioDao = new ItemOrcamentoDaoHib();
		//ioDao.insertOrUpdate(io);
		
		for (ItemOrcamento i : ioDao.query(ItemOrcamento.class, o)) {
			System.out.println(i);
		}
	}
	
	
}
