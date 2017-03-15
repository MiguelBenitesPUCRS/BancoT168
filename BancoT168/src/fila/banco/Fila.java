package fila.banco;

import java.util.ArrayList;

public class Fila {
	
	//Duas filas de normais e prioritários...
	ArrayList<Cliente> filaNormal = new ArrayList<>();
	ArrayList<Cliente> filaPrioritaria = new ArrayList<>();
	
	/**
	 * insere o cliente na fila dos clientes normais...
	 * @param cli
	 */
	public void insereFilaNormal(Cliente cli){
		filaNormal.add(cli);
	}
	
	/**
	 * insere o cliente na fila de prioritárias...
	 * @param cli
	 */
	public void insereFilaPrioritaria(Cliente cli){
		filaPrioritaria.add(cli);
	}
	
	/**
	 * chama o cliente o primeiro cliente da fila retornando ele...
	 * @return
	 */
	public Cliente chamaFilaNormal(){
		return filaNormal.remove(0);
	}
	
	/**
	 * chama o cliente o primeiro cliente da fila retornando ele...
	 * @return
	 */
	public Cliente chamaFilaPrioritaria(){
		return filaPrioritaria.remove(0);
	}
	
	/**
	 * retorna o toString da fila de normais, ou seja a lista de clientes na fila..
	 * @return
	 */
	public String getFilaNormal(){
		String str = filaNormal.toString();
		return str;
	}
	
	/**
	 * retorna o toString da fila de prioritários, ou seja a lista de clientes na fila..
	 * @return
	 */
	public String getFilaPrioritaria(){
		String str = filaPrioritaria.toString();
		return str;
	}
	
	

}
