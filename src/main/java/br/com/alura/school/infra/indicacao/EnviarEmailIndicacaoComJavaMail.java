package br.com.alura.school.infra.indicacao;

import br.com.alura.school.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.school.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
