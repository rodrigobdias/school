package br.com.alura.school.aplicacao.indicacao;

import br.com.alura.school.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);
}
