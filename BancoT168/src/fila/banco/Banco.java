package fila.banco;

import java.util.ArrayList;

public class Banco {

	//lista de caixas...
	ArrayList lstCaixas = new ArrayList<>();
	
	int cliCount=0;
	
	//Cria uma caixa e insere na lista...
	public void abreCaixa(int numero){
		Caixa caixa = new Caixa(numero);
		lstCaixas.add(caixa);
	}
	
	//Retorna a os Caixas abertos...
	public String retornaCaixas(){		
		Caixa aux;	
		String strCaixas="[";		
		for (int i=0;i<lstCaixas.size();i++){
			aux = (Caixa) lstCaixas.get(i);			
			if (i==lstCaixas.size()-1){
				strCaixas = strCaixas + aux.getNumero();
			} else {
				strCaixas = strCaixas + aux.getNumero() + ",";
			}
			
		}
		strCaixas = strCaixas + "]";
		return strCaixas;
	}
	
	//Retorna a quantidade de caixas abertos..
	public int qtdCaixas(){
		return lstCaixas.size();
	}
	
	//Filas de clientes...
	ArrayList lstFilaNormal = new ArrayList<>();
	ArrayList lstFilaPrioritaria = new ArrayList<>();
	
	
	//Clientes...
	
	/**
	 * Cria um cliente
	 * public Cliente(int id, int idade)
	 * @param idade
	 * @return
	 */
	public Cliente criaCliente(int idade){
		Cliente cli = new Cliente(cliCount++,idade);
		return cli;
	}	
	
	/**
	 * Adiciona um cliente nas filas corretas...
	 * @param cli
	 */
	public void addCliente(Cliente cli){
		if (cli.idade >= 65){
			lstFilaPrioritaria.add(cli);
		}else{
			lstFilaNormal.add(cli);
		}
	}
	
	public String retornaClientes(){
		Cliente aux;
		
		String strClientes="[Prioritarios: ";
		for(int i=0;i<lstFilaPrioritaria.size();i++){
			aux = (Cliente) lstFilaPrioritaria.get(i);			
			if (i==lstFilaPrioritaria.size()-1){
				strClientes = strClientes + "Cliente="+aux.getId() + "-" + "Idade="+aux.idade + "]\n";
			} else {
				strClientes = strClientes + "Cliente="+aux.getId() + "-" + "Idade="+aux.idade + ",";
			}
		}
		
		strClientes = strClientes +"[Normais     : ";
		for(int i=0;i<lstFilaNormal.size();i++){
			aux = (Cliente) lstFilaNormal.get(i);			
			if (i==lstFilaNormal.size()-1){
				strClientes = strClientes + "Cliente="+aux.getId() + "-" + "Idade="+aux.idade + "]\n";
			} else {
				strClientes = strClientes + "Cliente="+aux.getId() + "-" + "Idade="+aux.idade + ",";
			}
		}
		return strClientes;
	}
	
	
	
	public void atender(){
		
		// retorna o PRIMEIRO cliente da fila de priorit�rios
		// verifica se h� algum caixa priorit�rio livre
		// se tiver adiciona o cliente na fila
		
		
		ArrayList lstAux = new ArrayList<>();
		
		Cliente prioritario;
		prioritario = (Cliente) lstFilaPrioritaria.get(0);
		
		Boolean token = false;
		
		
		while (token==false){
			
			for(int i=0;i<lstFilaPrioritaria.size();i++){
				Caixa aux;
				aux = (Caixa) lstCaixas.get(i);
				if (aux.getNumero()<=5){
			
					
					
					
					
				}
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		//encontra um caixa para atender...
		for(int i=0; i<lstCaixas.size(); i++){
			Caixa aux;
			Cliente cliente;
			aux = (Caixa) lstCaixas.get(i);
			
			//se o caixa tiver o n�mero menor que 5
			//e o caixa n�o tiver ningu�m em atendimento
			if (aux.getNumero() <=5){
				if (aux.getCliente()==null){
					String strAtende = aux.atendeCliente(prioritario);
					
				}
			}
		}
		
		
//		Cliente normal;
//		normal = (Cliente) lstFilaNormal.get(0);
//		
		
		
	}
	
	
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Fila fila = new Fila();
//		Caixa caixa = new Caixa(1);
//		Caixa caixaAux;
//		Caixa caixa1;
//		
//		ArrayList listaDeCaixas = new ArrayList<>();
//		
//		for(int i=1; i<5; i++){
//			caixaAux = new Caixa(i);
//			listaDeCaixas.add(caixaAux);
//		}
//			
//		
//		Cliente cli0 = new Cliente(1,18);
//		Cliente cli1 = new Cliente(2,25);
//		Cliente cli2 = new Cliente(3,36);
//		Cliente cli3 = new Cliente(4,45);
//		
//		fila.insereFilaNormal(cli0);
//		fila.insereFilaNormal(cli1);
//		fila.insereFilaNormal(cli2);
//		
//		
//		fila.insereFilaPrioritaria(cli3);
//		
//		
//		caixa1 = (Caixa) listaDeCaixas.get(0);
//		System.out.println("Caixa numero:"+caixa1.getNumero());
//		
//		
//		System.out.println(fila.getFilaNormal());
//		System.out.println(fila.getFilaPrioritaria());
//		
//		
//		System.out.println("Caixa vazio? "+caixa1.isEmpty());		
//		caixa1.atendeCliente(cli2);		
//		System.out.println("Caixa vazio? "+caixa1.isEmpty());		
//		System.out.println(caixa1.getCliente().getIdade());	
//		System.out.println("Insere cliente:"+caixa1.atendeCliente(cli1));
//	
//
//		
//	}
	
	
	

}
