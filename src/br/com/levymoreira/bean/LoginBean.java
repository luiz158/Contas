package br.com.levymoreira.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.levymoreira.DAO.UsuarioDAO;
import br.com.levymoreira.model.Usuario;
import br.com.levymoreira.util.FacesUtil;

@ManagedBean
@RequestScoped
public class LoginBean {

	//private static final long serialVersionUID = 1L;	
	private Usuario usuario = new Usuario();
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public LoginBean(){
	    //tirar isso quando colocar em producao
		this.usuario.setNome("a");
		this.usuario.setSenha("a");
	}
	
	public boolean isLogged(){
		return usuario.getNome().equals("a");
	}
	
	public String entrar(){
		String result = "/paginas/login/login.xhtml"; // "/paginas/login/falhaLogin.xhtml";
		if(usuarioDAO.validarLogin(usuario) != null){
			result = "/paginas/index.xhtml";
		}else{
			FacesUtil.addInfoMsg("Login inv‡lido!","Usu‡rio ou senha incorreto(s)!");
		}
		return result;
	}
	
	//Getters and Setters
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
