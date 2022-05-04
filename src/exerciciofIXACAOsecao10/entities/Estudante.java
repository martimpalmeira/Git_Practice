package exerciciofIXACAOsecao10.entities;

public class Estudante {
	private String nome;
	private String email;
	private int quartoEscolhido;

	public Estudante(String nome, String email, int quartoEscolhido) {
		this.nome = nome;
		this.email = email;
		this.quartoEscolhido = quartoEscolhido;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getQuartoescolhido() {
		return quartoEscolhido;
	}
}
