package school;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoDeveriaCriarCpfComNumeroInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
		assertThrows(IllegalArgumentException.class, () -> new CPF(""));
		assertThrows(IllegalArgumentException.class, () -> new CPF("123456789"));
	}
	
	@Test
	void verificarSeFoiCriadoCpfCorretamente() {
		
		String numero = "123.123.123-12";

		CPF cpf = new CPF(numero);
		
		assertEquals(cpf.getNumero(), numero);
	
	}

}
