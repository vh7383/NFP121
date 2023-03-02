import org.junit.*;
import static org.junit.Assert.*;

import java.awt.Color;

/** Programme de test de la classe Point.
 * @author	Vincent Hernandes
 * @version	1
 */

public class CercleTest {
	private Point p1;
	private Point p2;
	private Point p3;
	private Cercle c;
	
	@Before
	public void setUp() {
		p1 = new Point(1,2);
		p2 = new Point(4,-2);
		p3 = new Point((p1.getX()+p2.getX())/2,(p1.getY()+p2.getY())/2);
		c = new Cercle(p1, p2);
	}
	
	@Test
	public void testInitialisation() {
		assertTrue(c!=null);
		assertTrue(c.getCentre().getX()==p3.getX());
		assertTrue(c.getCentre().getY()==p3.getY());
	}
	
	@Test
	public void testTranslater() {
		c.translater(3, 3);
		p3.translater(3, 3);
		assertTrue(c.getCentre().getX() == p3.getX());
		assertTrue(c.getCentre().getY() == p3.getY());
	}
	
	@Test
	public void testSetRayon() {
		c.setRayon(5);
		assertTrue(c.getRayon()==5);
	}
	
	@Test
	public void testSetDiametre() {
		c.setDiametre(15);
		assertTrue(c.getDiametre()==15);
	}
	
	@Test
	public void testContient() {
		p3 = c.getCentre();
		assertTrue(c.getCentre().distance(p3) <= c.getRayon());
	}
	
	@Test
	public void testSetCouleur() {
		c.setCouleur(Color.red);
		assertTrue(c.getCouleur()==Color.red);
	}
}