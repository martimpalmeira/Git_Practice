package exerciciofIXACAOsecao10.entities;

public class Quarto {
	private Estudante estudante;
	private boolean estaOcupado;
	
	public Quarto(Estudante estudante, boolean estaOcupado){
		this.estudante = estudante;
		this.estaOcupado = estaOcupado;
	}
	
	public String toString() {
		return estudante.getQuartoescolhido()+": "+estudante.getNome()+", "+estudante.getEmail();
	}
	
	public boolean getEstaOcupado() {
		return estaOcupado;
	}
	
	
}
