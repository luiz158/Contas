package br.com.levymoreira.DAO;

import java.util.ArrayList;
import br.com.levymoreira.model.Parcela;

/**
 * Classe que realiza acessos e logicas relacionadas a banco de dados para o pojo
 * Parcela.
 * 
 * @author levy
 * @since 21/01/2012
 */
public class ParcelaDAO extends DAOGenerico{
	
	public boolean salvar(Parcela parcela) {
        return salvarOuAlterarPojo(parcela);
    }
	
	public boolean deletar(Parcela parcela) {
        return deletarPojo(parcela);
    }
	
	public ArrayList<Parcela> getTodos(){		
        return getTodos(Parcela.class);
    }
}
