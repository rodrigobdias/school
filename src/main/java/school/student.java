package school;

import java.util.ArrayList;
import java.util.List;

public class student {

	private CPF cpf;
	private String name;
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	
}
