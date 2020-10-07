package br.com.alura.school.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private CPF cpf;
	private String name;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	
	public Aluno(CPF cpf, String name, Email email) {
		this.cpf = cpf;
		this.name = name;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public CPF getCpf() {
		return cpf;
	}
	
	public Email getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
}
