package br.com.alura.school.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
	}
	
	@Test
	void verificarSeFoiCriadoEmailCorretamente() {
		
		String endereco = "emailvalido@gmail.com";
		Email email = new Email(endereco);
		
		assertEquals(email.getEndereco(), endereco);
	
	}

}
