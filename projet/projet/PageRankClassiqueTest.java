package projet;

import org.junit.*;
import static org.junit.Assert.*;

/** Programme de test de la classe PageRankClassique.
*
* @author	Vincent Hernandes
*/
public class PageRankClassiqueTest {
	protected Configuration configuration;
	
	@Before
	public void setUp() {
		this.configuration = new Configuration();
		
		/* Question 2.1 : donnees pour le test
		public double alpha = 0.90;
		public double epsilon = -1.0;
		public int indice = 30;
		public Mode mode = Mode.CREUSE;
		*/
	}
	
	@Test
	public void testerConfiguration() {
		assertEquals(30, this.configuration.indice);
		assertEquals(0.90, this.configuration.alpha, 1e-6);
		assertEquals(-1, this.configuration.epsilon, 1e-6);
		assertEquals(Mode.CREUSE, this.configuration.mode);
	}
}
