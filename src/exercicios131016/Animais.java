package exercicios131016;

public class Animais {

	double preco;
	String tipo;
	String raca;
	double idade;
	double peso;
	
	
	public Animais(double preco, String tipo, String raca, double idade, double peso) {
		super();
		this.preco = preco;
		this.tipo = tipo;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getIdade() {
		return idade;
	}
	public void setIdade(double idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
