package controle;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.CidadeDaoHib;

import entidade.Cidade;

@FacesConverter(value="cidadeConverter", forClass=Cidade.class)
public class CidadeConverter implements Converter {

	CidadeDaoHib cidadeDao = new CidadeDaoHib();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		
		try {
			return new CidadeDaoHib().get(Cidade.class, Integer.parseInt(value));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		Cidade c = (Cidade) value;
		return String.valueOf(c.getId());
	}

}
 