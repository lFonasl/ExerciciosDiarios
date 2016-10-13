package exercicios101016;

public class Cliente {
		String nome;
		String telefone;
		String morada;
		int nif;
		
		public Cliente(String nome, String telefone, String morada, int nif) {
			super();
			this.nome = nome;
			this.telefone = telefone;
			this.morada = morada;
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

		public String getMorada() {
			return morada;
		}

		public void setMorada(String morada) {
			this.morada = morada;
		}

		public int getNif() {
			return nif;
		}

		public void setNif(int nif) {
			this.nif = nif;
		}
		
		
		


}
