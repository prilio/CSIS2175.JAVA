import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CakeTest {

	@Test
	void testRoundCake() {
		Cake roundCake = new RoundCake(10, "Chocolate");
		assertEquals(roundCake.getArea(), 25*Math.PI);
	}

	@Test
	void testSquareCake() {
		Cake squareCake = new SquareCake(10, "Chocolate");
		assertEquals(squareCake.getArea(), 100);
	}
	
}
