package br.com.alura.school.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno nao encontrado com CPF: " + cpf.getNumero());
	}

}
