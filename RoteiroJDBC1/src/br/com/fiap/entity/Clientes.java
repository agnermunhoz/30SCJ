package br.com.fiap.entity;

import java.io.Serializable;
import java.util.List;

public class Clientes implements Serializable {

	private int id;
	private String nome;
	private String email;
	private List<Pedidos> pedidos;
	
	public Clientes()
	{
		
	}
	
	public Clientes(String nome, String email, List<Pedidos> pedidos) {
		super();
		this.nome = nome;
		this.email = email;
		this.pedidos = pedidos;
	}
	
	public Clientes(int id, String nome, String email, List<Pedidos> pedidos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.pedidos = pedidos;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
}
