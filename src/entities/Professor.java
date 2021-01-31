package entities;

public class Professor {

	private Integer idProfessor;
	private String nome;
	private String email;

	public Professor() {
	}
	
	
	public Professor(Integer idProfessor, String nome, String email) {
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.email = email;
	}

	

	
	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", nome=" + nome + ", email=" + email + "]";
	}

	
	

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
