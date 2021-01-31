package repositories;

import java.io.FileWriter;

import entities.Turma;
import interfaces.ITurmaRepository;

public class TurmaRepository implements ITurmaRepository {

	@Override
	public void exportarDados(Turma turma) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter writer = new FileWriter("C:\\temp\\Turma.txt");
		
		writer.write("\nInforme seu nome: " + turma.getNome());
		writer.write("\nInfomre seu período: " + turma.getPeriodo());
		writer.write("\nInforme o ID da turma: " + turma.getIdTurma());
		writer.write("\nInforme os dados dos alunos: " + turma.getAlunos());
		writer.write("\nInforme os dados do professor: " + turma.getProfessor());
		
		writer.flush();
		writer.close();		
		
	}

}
