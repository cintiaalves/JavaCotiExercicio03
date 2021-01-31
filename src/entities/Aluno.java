package entities;

public class Aluno {

	private Integer idAluno;
	private String nome;
	private String matricula;

	public Aluno() {
	}
	
	
	public Aluno(Integer idAluno, String nome, String matricula) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.matricula = matricula;
	}


	
	
	
	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
	
	
	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



}
