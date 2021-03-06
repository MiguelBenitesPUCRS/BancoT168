package fila.banco;

import java.util.ArrayList;

public class Caixa {
	int numero;
	Cliente cliente;
	
	/**
	 * retorna o numero do caixa...
	 * @return
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * insere o número do caixa...
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * retorna o cliente que está no caixa...
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Altera o cliente
	 * @param cli
	 */
	public void setCliente(Cliente cli){
		cliente = cli;
	}
	
	/**
	 * atende o cliente, recebe um cliente como parâmetro...
	 * @param cliente
	 * @return
	 */
	public String atendeCliente(Cliente cliente) {
		if (this.getCliente()==null){
			this.cliente = cliente;
			return "True";
		}
		return "False";
	}
	
	/**
	 * verifica se o caixa está vazio...
	 * @return
	 */
	public boolean isEmpty(){
		if (this.getCliente()==null){
			return true;
		}
		return false;
	}
	
	/**
	 * Construtor do caixa recebe um número...
	 * @param numero
	 */
	public Caixa(int numero) {
		this.numero = numero;
	}
	
	
}
