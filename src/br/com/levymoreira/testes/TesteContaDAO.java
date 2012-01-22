package br.com.levymoreira.testes;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.levymoreira.DAO.ContaDAO;
import br.com.levymoreira.DAO.LocalPagamentoDAO;
import br.com.levymoreira.DAO.ParcelaDAO;
import br.com.levymoreira.model.Conta;
import br.com.levymoreira.model.LocalPagamento;
import br.com.levymoreira.model.Parcela;
import br.com.levymoreira.util.HibernateUtil;

//Arrumar isso que ta uma bagunca...

public class TesteContaDAO {
	private static ContaDAO contaDAO;	
	private static Conta conta; 
	private static LocalPagamentoDAO lpDAO;
	private static LocalPagamento lp;
	private static ParcelaDAO parcelaDAO;
	private static Parcela parcela;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/*Roda uma vez antes de se iniciarem os testes*/
		HibernateUtil hu = new HibernateUtil();
		hu.recriarTodasTebelas();
		System.out.println("Recriou as tabelas");
		lpDAO = new LocalPagamentoDAO(); 
		lp = new LocalPagamento("LocalPagamentoT1");
		lpDAO.salvar(lp);
		System.out.println("Local de pagamento salvo");
		
		contaDAO = new ContaDAO();	
		conta = new Conta("Descricaoo", new Date(), 1, BigDecimal.valueOf(60.50), lp);
		
		//Parcela parcela = new Parcela(conta, dt, 1, 0, 0);
				parcela = new Parcela();
				parcela.setConta(conta);
				if (conta == null){
					System.out.println("Contas e null");
				}
				
				Date dt = new Date();
				dt.setDate(dt.getDate() + 30);
				
				parcelaDAO = new ParcelaDAO();
				parcela.setDataPagamento(dt);
				parcela.setNumeroParcela(1);
				parcela.setValorPago(BigDecimal.valueOf(0));
			    parcela.setValorParcela(BigDecimal.valueOf(60.50));
	}
	
	@Test
	public void testeSalvarConta() {				
		assertEquals(true, contaDAO.salvar(conta));
	}
	
	@Test
	public void testeSalvarParcela1() {		
		
				
		assertEquals(true, parcelaDAO.salvar(parcela));
	}

}
