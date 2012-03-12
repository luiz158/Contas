package br.com.levymoreira.testes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import br.com.levymoreira.DAO.ContaDAO;
import br.com.levymoreira.DAO.LocalCompraDAO;
import br.com.levymoreira.DAO.LocalPagamentoDAO;
import br.com.levymoreira.DAO.ParcelaDAO;
import br.com.levymoreira.DAO.UsuarioDAO;
import br.com.levymoreira.model.Conta;
import br.com.levymoreira.model.LocalCompra;
import br.com.levymoreira.model.LocalPagamento;
import br.com.levymoreira.model.Parcela;
import br.com.levymoreira.model.Usuario;
import br.com.levymoreira.util.HibernateUtil;

public class Main {

	public static ContaDAO contaDAO = new ContaDAO();
	public static LocalCompraDAO localCompraDAO = new LocalCompraDAO();
	public static LocalPagamentoDAO localPagamentoDAO = new LocalPagamentoDAO();
	public static ParcelaDAO parcelaDAO = new ParcelaDAO();
	public static UsuarioDAO usuarioDAO = new UsuarioDAO();
	public static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	

		// TODO Auto-generated method stub

		
		  HibernateUtil hb = new HibernateUtil(); 
		  hb.recriarTodasTebelas();
		  
		  
		 /* * 
		 * //Criar uma conta com tres parcelas LocalPagamento localPagamento1 =
		 * new LocalPagamento("Local Pagamento 1lol");
		 * 
		 * LocalCompra localCompra1 = new LocalCompra("Local Compra 1lol");
		 * 
		 * //Usuario usuario = new Usuario("a", "a");
		 * 
		 * Conta conta1 = new Conta("Conta 1lol", new Date(), 3, new
		 * BigDecimal(300.00), localPagamento1, localCompra1);
		 * 
		 * 
		 * Date data = new Date(); Calendar c = Calendar.getInstance();
		 * 
		 * c.add(Calendar.MONTH,1); Parcela parcela1 = new Parcela(data, 1, new
		 * BigDecimal(100.00), new BigDecimal(0)); parcela1.setConta(conta1);
		 * 
		 * c.add(Calendar.MONTH,1); Parcela parcela2 = new Parcela(data, 2, new
		 * BigDecimal(100.00), new BigDecimal(0)); parcela2.setConta(conta1);
		 * 
		 * c.add(Calendar.MONTH,1); Parcela parcela3 = new Parcela(data, 3, new
		 * BigDecimal(100.00), new BigDecimal(0)); parcela3.setConta(conta1);
		 * 
		 * //usuarioDAO.salvar(usuario);
		 * 
		 * localCompraDAO.salvar(localCompra1);
		 * localPagamentoDAO.salvar(localPagamento1); contaDAO.salvar(conta1);
		 * parcelaDAO.salvar(parcela1); parcelaDAO.salvar(parcela2);
		 * parcelaDAO.salvar(parcela3);
		 * 
		 * System.out.println("Tudo Salvo!");
		 

		ContaDAO contaDAO = new ContaDAO();
		ParcelaDAO parcelaDAO = new ParcelaDAO();
		Conta conta = contaDAO.getContaPorId(1);

		for (Parcela parcela : parcelaDAO.getParcelasPorConta(conta)) {
			System.out.println(parcela);
		}*/

	}



}
