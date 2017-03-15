package fila.banco;


public class Cliente {
	int id;
	int idade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cliente(int id, int idade) {
		this.id = id;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", idade=" + idade + "]";
	}
}
