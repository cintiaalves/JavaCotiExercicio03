package interfaces;

import entities.Turma;

public interface ITurmaRepository {
	
	void exportarDados(Turma turma) throws Exception;
	
}
