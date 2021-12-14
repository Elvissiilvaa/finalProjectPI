package br.com.Elvissiilvaa.leilao.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.Elvissiilvaa.leilao.model.Lance;
import br.com.Elvissiilvaa.leilao.model.Usuario;

public class LanceTest {

	@Test
	public void deveRecusarLancesComValorDeZero() {
		assertThrows(IllegalArgumentException.class, () -> new Lance(new Usuario("John Doe"), BigDecimal.ZERO));
	}

	@Test
	public void deveRecusarLancesComValorNegativo() {
		assertThrows(IllegalArgumentException.class, () -> new Lance(new Usuario("John Doe"), new BigDecimal("-10")));
	}
}
