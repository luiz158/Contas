package br.com.levymoreira.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Pojo representando a tabela local da compra do banco de dados, 
 * configurado com annotation para usar o hibernate.
 * 
 * @author levy
 * @since 21/01/2012
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "LOCAL_COMPRA")
public class LocalCompra implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="descricao", nullable=false, length=50)
    private String descricao;
    
    //Constructor Default
    
    public LocalCompra(){}
    
    //Constructor
    
    public LocalCompra(String descricao){
    	this.descricao = descricao;
    }
    
    //Getters and Setters
    
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getId() {
		return id;
	}    
    
}
