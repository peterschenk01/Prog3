import org.junit.*;
import static org.junit.Assert.*;

public class RealFunctionTest {
	
	@Test
	public void constant() {
		RealFunction f = RealFunction.constant(5);
		
		assertEquals(5, f.apply(7), 1e-10);
	}
}
