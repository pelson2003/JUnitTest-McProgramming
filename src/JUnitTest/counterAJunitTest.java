package JUnitTest;
import static org.junit.Assert.*;
import org.junit.Test;
import com.sun.org.apache.xpath.internal.operations.Equals;
public class counterAJunitTest {
	@Test
	public void test() {
		JUnitTestClass test = new JUnitTestClass();
		int output = test.countA("alphabet");
		assertEquals(2,output);	
	}
}
