package code_breaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class Code_breaker_test {
	
	private static CodeBreaker cb;
	
	@Test
	public void test_7981() {
		cb = new CodeBreaker();
		String str = cb.compare("7981","7981");
		assertEquals("XXXX",str);
	}
	
	@Test
	public void test_7891() {
		cb = new CodeBreaker();
		String str = cb.compare("7891","7981");
		assertEquals("XX__",str);
	}
	
	@Test
	public void test_0234() {
		cb = new CodeBreaker();
		String str = cb.compare("0234","7981");
		assertEquals("",str);
	}
	
	@Test
	public void test_6321() {
		cb = new CodeBreaker();
		String str = cb.compare("6321","7981");
		assertEquals("X",str);
	}
	
	@Test
	public void test_7103() {
		cb = new CodeBreaker();
		String str = cb.compare("7103","7981");
		assertEquals("X_",str);
	}
	
	@Test
	public void test_longitud_mayor() {
		cb = new CodeBreaker();
		String str = cb.compare("71031","7981");
		assertEquals("ERROR",str);
	}
	
	@Test
	public void test_longitud_menor() {
		cb = new CodeBreaker();
		String str = cb.compare("731","7981");
		assertEquals("ERROR",str);
	}
	
	@Test
	public void test_no_numero() {
		cb = new CodeBreaker();
		String str = cb.compare("a731","7981");
		assertEquals("ERROR",str);
	}
	
	@Test
	public void test_numeros_no_repetidos() {
		cb = new CodeBreaker();
		String str = cb.compare("7781","7981");
		assertEquals("ERROR",str);
	}
}

