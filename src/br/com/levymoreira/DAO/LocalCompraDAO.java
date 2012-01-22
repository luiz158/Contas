package br.com.levymoreira.DAO;

import java.util.ArrayList;
import br.com.levymoreira.model.LocalCompra;

/**
 * Classe que realiza acessos e logicas relacionadas a banco de dados para o pojo
 * LocalCompra.
 * 
 * @author levy
 * @since 21/01/2012
 */
public class LocalCompraDAO extends DAOGenerico{
	
	public boolean salvar(LocalCompra localCompra) {
        return salvarOuAlterarPojo(localCompra);
    }
	
	public boolean deletar(LocalCompra localCompra) {
        return deletarPojo(localCompra);
    }
	
	public ArrayList<LocalCompra> getTodos(){		
        return getTodos(LocalCompra.class);
    }
}
