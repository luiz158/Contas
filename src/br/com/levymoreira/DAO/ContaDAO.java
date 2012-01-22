package br.com.levymoreira.DAO;

import java.util.ArrayList;
import br.com.levymoreira.model.Conta;

/**
 * Classe que realiza acessos e logicas relacionadas a banco de dados para o pojo
 * Conta.
 * 
 * @author levy
 * @since 21/01/2012
 */
public class ContaDAO extends DAOGenerico{
	
	public boolean salvar(Conta conta) {
        return salvarOuAlterarPojo(conta);
    }
	
	public boolean deletar(Conta conta) {
        return deletarPojo(conta);
    }
	
	public ArrayList<Conta> getTodos(){		
        return getTodos(Conta.class);
    }
}
