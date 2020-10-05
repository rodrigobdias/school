package school;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("123", "12345678"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "12345678"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "12345678"));
	}
	
	@Test
	void naoDeveriaCriarTelefoneComNumeroInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("12", "12345678910"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("12", ""));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("12", null));
	}
	
	@Test
	void verificarSeFoiCriadoTelefoneComOitoDigitosCorretamente() {
		
		String ddd = "12";
		String numero = "12345678";
	
		Telefone telefone = new Telefone(ddd, numero);
	
		assertEquals(telefone.getDdd(), ddd);
		assertEquals(telefone.getNumero(), numero);
	
	}
	
	@Test
	void verificarSeFoiCriadoTelefoneComNoveDigitosCorretamente() {
		
		String ddd = "12";
		String numero = "123456789";
		
		Telefone telefone = new Telefone(ddd, numero);
		
		assertEquals(telefone.getDdd(), ddd);
		assertEquals(telefone.getNumero(), numero);
	
	}

}
