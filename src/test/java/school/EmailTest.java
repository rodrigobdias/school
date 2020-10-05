package school;

import static org.junit.jupiter.api.Assertions.*;

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
