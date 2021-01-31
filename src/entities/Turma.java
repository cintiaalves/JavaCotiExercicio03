package entities;

import java.util.List;

public class Turma {

	private Integer idTurma;
	private String nome;
	private String periodo;
	private Professor professor;
	private List<Aluno> alunos;
	
	public Turma () {
	}

	public Turma(Integer idTurma, String nome, String periodo, Professor professor, List<Aluno> aluno) {
		super();
		this.idTurma = idTurma;
		this.nome = nome;
		this.periodo = periodo;
		this.professor = professor;
		this.alunos = aluno;
	}

	
	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	


}
