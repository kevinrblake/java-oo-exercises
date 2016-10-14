import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {

	@Test
	public void testMove() {
		Robot r = new Robot("Wall=E", 2.0, 1.0, 1.0, "north");
		r.move();
		assertTrue (r.getyPos() == 3.0);
	}

}
