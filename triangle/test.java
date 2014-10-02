import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {

	@Test
	public void testTriangle() {
		triangle t = new triangle();
		assertEquals(0, t.CheckTriangle(1, 1, 10));
		assertEquals(1, t.CheckTriangle(2, 3, 4));
		assertEquals(2, t.CheckTriangle(1000, 1000, 1000));
		assertEquals(3, t.CheckTriangle(5, 5, 4));
		assertEquals(4, t.CheckTriangle(3, 4, 5));
	}

}
