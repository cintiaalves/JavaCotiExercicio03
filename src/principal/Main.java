package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Aluno;
import entities.Professor;
import entities.Turma;
import repositories.TurmaRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno(01, "Cintia", "122565496-5522");
		Aluno aluno2 = new Aluno(02, "Fernando", "122565496-5520");
		Aluno aluno3 = new Aluno(03, "Judy", "122565496-5521");
		
        List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		Professor professor = new Professor(1, "Jorge", "jorge.castro@gmail.com");
		
		
		Turma turma = new Turma(5, "Nome X", "2º", professor, alunos);
		
		
		try {
			
			TurmaRepository turmaRepository = new TurmaRepository();
			turmaRepository.exportarDados(turma);
			
			System.out.println("\nDados gravados com sucesso!");
			
			
		}
		
		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
