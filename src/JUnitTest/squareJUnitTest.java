package JUnitTest;
import static org.junit.Assert.*;
import org.junit.Test;
public class squareJUnitTest {
	@Test
	public void test() {
		JUnitTestClass test = new JUnitTestClass();	
		int output = test.square(5);
		// Sintaxe comando(resultado esperado, variável)
		assertEquals(25, output);

	}
}
