
public class Filme {

	private String titulo;
	private Atores ator;
	private int copiasDisp;
	private int copiasLocadas;

	public Filme(String titulo, Atores ator, int copiasdisp) {
		this.titulo = titulo;
		this.ator = ator;
		this.copiasDisp = copiasdisp;
		this.copiasLocadas = 0;
	}

	public Filme(String titulo, Atores ator, int copiasdisp, int copiaslocadas) {
		this.titulo = titulo;
		this.ator = ator;
		this.copiasDisp = copiasdisp;
		this.copiasLocadas = copiaslocadas;
	}

	public boolean MesmoAtor(Filme filme1) {
		if (this.ator == filme1.ator)
			return true;
		else
			return false;
	}
}
