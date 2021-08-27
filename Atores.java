
public class Atores {
	private String nome;
	private int idade;
	private String sexo;

	public Atores(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String VerificaIdade(int idade2) {
		if (this.idade < idade2)
			return "O(A) ator(atriz) é mais novo(a)";
		else
			return "O(A) ator(atriz) é mais velho(a)";
	}

}
