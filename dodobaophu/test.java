import org.junit;
import static org.junit.Assert.assertEquals;
public class test {

	public void testChiaHet6() {
		chiahet c = new chiahet();
		assertEquals(true, c.KiemTraChiaHet6(6));
		assertEquals(false, c.KiemTraChiaHet6(8));
		assertEquals(false, c.KiemTraChiaHet6(9));

	}

}
