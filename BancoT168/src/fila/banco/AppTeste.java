package fila.banco;

public class AppTeste {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		banco.abreCaixa(1);
		banco.abreCaixa(2);
		banco.abreCaixa(10);
		
		System.out.println("[Caixas Abertos: "+banco.retornaCaixasComClientes()+"]");
		
		System.out.println("[Caixas Vazios : "+banco.retornaStatusCaixas()+"]");
		
		banco.addCliente(banco.criaCliente(70));
		banco.addCliente(banco.criaCliente(65));
		banco.addCliente(banco.criaCliente(67));
		
		banco.addCliente(banco.criaCliente(18));
		banco.addCliente(banco.criaCliente(21));
		banco.addCliente(banco.criaCliente(23));
		
		System.out.println(banco.retornaClientes());
		
		banco.atender();	
		System.out.println("[Situacao Caixas: "+banco.retornaCaixasComClientes()+"]");	
		
		banco.atender();
		System.out.println("[Situacao Caixas: "+banco.retornaCaixasComClientes()+"]");
		
		banco.atender();
		System.out.println("[Situacao Caixas: "+banco.retornaCaixasComClientes()+"]");
		
	}
}
