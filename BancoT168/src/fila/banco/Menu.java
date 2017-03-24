package fila.banco;

import java.util.Scanner;

public class Menu {
    
	
	
    public static void Menu(){
    	
    	Banco banco = new Banco();
    	
    	banco.abreCaixa(1);
		banco.abreCaixa(2);
		banco.abreCaixa(10);
				
		banco.addCliente(banco.criaCliente(70));
		banco.addCliente(banco.criaCliente(65));
		banco.addCliente(banco.criaCliente(67));
		
		banco.addCliente(banco.criaCliente(18));
		banco.addCliente(banco.criaCliente(21));
		banco.addCliente(banco.criaCliente(23));
    	
    	System.out.println("######                                         #    #####   #####    ******"); 
        System.out.println("#     #   ##   #    #  ####   ####     #####  ##   #     # #     #   ******");
        System.out.println("#     #  #  #  ##   # #    # #    #      #   # #   #       #     #   ******") ;
        System.out.println("######  #    # # #  # #      #    #      #     #   ######   #####    ******")  ;
        System.out.println("#     # ###### #  # # #      #    #      #     #   #     # #     #   ******") ;
        System.out.println("#     # #    # #   ## #    # #    #      #     #   #     # #     #   ******") ;
        System.out.println("######  #    # #    #  ####   ####       #   #####  #####   #####    ******") ;
        System.out.println("\nby Miguel Benites - 2017");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("*************************** Status do Banco *******************************");
        System.out.println("[Caixas Abertos: "+banco.retornaCaixas()+"]");
        System.out.println(banco.retornaClientes());
        System.out.println("[Em atendimentos: ]");
        System.out.println("******************************* Opções ************************************");
        System.out.println("0. Fim");
        System.out.println("1. Inclui");
        System.out.println("2. Altera");
        System.out.println("3. Exclui");
        System.out.println("4. Consulta");
        System.out.println("Opcao:");
    }

    public static void inclui(){
        System.out.println("Você entrou no método Inclui.");
    }
    
    public static void altera(){
        System.out.println("Você entrou no método Altera.");
    }
    
    public static void exclui(){
        System.out.println("Você entrou no método Exclui.");
    }
    
    public static void consulta(){
        System.out.println("Você entrou no método Consulta.");
    }
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            Menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                inclui();
                break;
                
            case 2:
                altera();
                break;
                
            case 3:
                exclui();
                break;
                
            case 4:
                consulta();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}