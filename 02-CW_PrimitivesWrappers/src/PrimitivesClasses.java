import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimitivesClasses {

	@Test
	void test() {
		int a = 1000;
		int b = 1000;
		assertTrue(a == b);
		Integer c = 1000;
		Integer d = 1000;
		assertTrue(c == a);
		assertTrue(c.equals(d));
		Integer e = 100;
		Integer g = 100;
		assertTrue(e == g);
	}

}
