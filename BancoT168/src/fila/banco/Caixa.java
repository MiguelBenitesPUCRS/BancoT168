package fila.banco;

import java.util.ArrayList;

public class Caixa {
	int numero;
	Cliente cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public String atendeCliente(Cliente cliente) {
		if (this.getCliente()==null){
			this.cliente = cliente;
			return "True";
		}
		return "False";
	}
	
	public String isEmpty(){
		if (this.getCliente()==null){
			return "True";
		}
		return "False";
	}
	public Caixa(int numero) {
		this.numero = numero;
	}
	
	
}
