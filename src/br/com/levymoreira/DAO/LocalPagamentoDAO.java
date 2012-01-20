package br.com.levymoreira.DAO;

import java.util.ArrayList;
import br.com.levymoreira.model.LocalPagamento;

/**
 * Classe que realiza acessos e logicas relacionadas a banco de dados para o pojo
 * LocalPagamento.
 * 
 * @author levy
 * @since 27/11/2011
 */
public class LocalPagamentoDAO extends DAOGenerico{
	
	 /**
     * Salva uma instancia de LocalPagamento, que e passada por parametro, no banco de dados.
     * 
     * @author Levy Moreira
     * @since 23/12/2011
     * @param localPagamento 
     *        Instancia do usuario a ser salvo 
     * @return boolean
     *         Retorna true caso o usuario tenha sido deletado com sucesso
     */
    public boolean salvar(LocalPagamento localPagamento) {
         return salvarOuAlterarPojo(localPagamento);
    }

    /**
     * Deleta um usuario que e passado por parametro do banco de dados.
     * 
     * @author Levy Moreira
     * @since 23/12/2011
     * @param localPagamento 
     *        Instancia do pojo LocalPagamento a ser deletada
     * @return boolean
     *         Retorna true caso o objeto LocalPagamento tenha sido deletado com sucesso       
     */
    public boolean deletar(LocalPagamento localPagamento) {
        return deletarPojo(localPagamento);
    }
    
    /**
     * Retorna todos os usuarios cadastrados no banco de dados
     * 
     * @author Levy Moreira
     * @since 04/12/2011
     * @return ArrayList<Usuario> 
     *         Lista com todos os usuarios cadastrados
     */    
	public ArrayList<LocalPagamento> getTodos(){		
        return getTodos(LocalPagamento.class);
    }

}
