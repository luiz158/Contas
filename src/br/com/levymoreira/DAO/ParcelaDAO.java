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
	
	/**
     * Salva uma parcela que e passada por parametro no banco de dados.
     * 
     * @author Levy Moreira
     * @since 22/01/2012
     * @param parcela 
     *        Instancia de Parcela a ser salvo 
     * @return boolean
     *         Retorna true caso a Parcela tenha sido salva com sucesso
     */
	public boolean salvar(Parcela parcela) {
        return salvarOuAlterarPojo(parcela);
    }
	
	/**
     * Deleta uma instancia de parcela, que e passada por parametro, do banco de dados.
     * 
     * @author Levy Moreira
     * @since 22/01/2012
     * @param parcela 
     *        Instancia da parcela a ser deletada
     * @return boolean
     *         Retorna true caso o registro tenha sido deletado com sucesso       
     */
	public boolean deletar(Parcela parcela) {
        return deletarPojo(parcela);
    }
	
	/**
     * Retorna todas as parcelas cadastradas no banco de dados
     * 
     * @author Levy Moreira
     * @since 22/01/2012
     * @return ArrayList<Parcela> 
     *         Lista com todas as parcelas cadastradas
     */ 
	public ArrayList<Parcela> getTodos(){		
        return getTodos(Parcela.class);
    }
}
