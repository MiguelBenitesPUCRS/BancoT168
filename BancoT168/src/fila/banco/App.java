package fila.banco;

import java.util.ArrayList;

public class App {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fila fila = new Fila();
		Caixa caixa = new Caixa(1);
		Caixa caixaAux;
		Caixa caixa1;
		
		ArrayList listaDeCaixas = new ArrayList<>();
		
		for(int i=1; i<5; i++){
			caixaAux = new Caixa(i);
			listaDeCaixas.add(caixaAux);
		}
			
		
		Cliente cli0 = new Cliente(1,18);
		Cliente cli1 = new Cliente(2,25);
		Cliente cli2 = new Cliente(3,36);
		Cliente cli3 = new Cliente(4,45);
		
		fila.insereFilaNormal(cli0);
		fila.insereFilaNormal(cli1);
		fila.insereFilaNormal(cli2);
		
		
		fila.insereFilaPrioritaria(cli3);
		
		
		caixa1 = (Caixa) listaDeCaixas.get(0);
		System.out.println("Caixa numero:"+caixa1.getNumero());
		
		
		System.out.println(fila.getFilaNormal());
		System.out.println(fila.getFilaPrioritaria());
		
		
		System.out.println("Caixa vazio? "+caixa1.isEmpty());		
		caixa1.atendeCliente(cli2);		
		System.out.println("Caixa vazio? "+caixa1.isEmpty());		
		System.out.println(caixa1.getCliente().getIdade());	
		System.out.println("Insere cliente:"+caixa1.atendeCliente(cli1));
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
