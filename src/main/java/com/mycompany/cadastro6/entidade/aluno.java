
import java.util.Date;

class Aluno {
    private String nome;
    private char sexo;
    private int idade;
    private String matricula;
    private Date anoDeIngresso;

	public Aluno(String nome, char sexo, int idade, String matricula, Date anoDeIngresso) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.matricula = matricula;
		this.anoDeIngresso = anoDeIngresso;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public Date getAnoDeIngresso() {
		return anoDeIngresso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setAnoDeIngresso(Date anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}

	
    @Override
	public String toString() {
		return "Aluno{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", matricula=" + matricula + ", anoDeIngresso=" + anoDeIngresso + '}';
	}
    
    public Aluno() {
        // Construtor vazio
    }
    
    // Getters e setters aqui
}