package fila.banco;


public class Cliente {
	int id;
	int idade;
	
	/**
	 * retorna o ID do cliente...
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * entra com o ID do cliente...
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * retorna a idade do cliente...
	 * @return
	 */
	public int getIdade() {
		return idade;
	}
	
	/**
	 * insere a idade do cliente...
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * Construtor do cliente, com um ID e a idade do cliente...
	 * @param id
	 * @param idade
	 */
	public Cliente(int id, int idade) {
		this.id = id;
		this.idade = idade;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", idade=" + idade + "]";
	}
}
