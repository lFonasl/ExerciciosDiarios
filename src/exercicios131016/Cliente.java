package exercicios131016;

public class Cliente {
	
	String nome;
	String telefone;
	int nif;
	
	public Cliente(String nome, String telefone, int nif) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.nif = nif;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	
}
