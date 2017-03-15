package fila.banco;

import java.util.ArrayList;

public class Fila {
	
	ArrayList<Cliente> filaNormal = new ArrayList<>();
	ArrayList<Cliente> filaPrioritaria = new ArrayList<>();
	
	public void insereFilaNormal(Cliente cli){
		filaNormal.add(cli);
	}
	
	public void insereFilaPrioritaria(Cliente cli){
		filaPrioritaria.add(cli);
	}
	
	
	public Cliente chamaFilaNormal(){
		return filaNormal.remove(0);
	}
	
	public Cliente chamaFilaPrioritaria(){
		return filaPrioritaria.remove(0);
	}
	
	public String getFilaNormal(){
		String str = filaNormal.toString();
		return str;
	}
	
	public String getFilaPrioritaria(){
		String str = filaPrioritaria.toString();
		return str;
	}
	
	

}
