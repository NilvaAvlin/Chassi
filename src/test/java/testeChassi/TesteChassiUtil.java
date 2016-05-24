package testeChassi;


//import org.junit.Before;
import org.junit.Test;

import ChassiUtil.ChassiUtil;
import junit.framework.TestCase;

public class TesteChassiUtil extends TestCase {
	
private ChassiUtil util = new ChassiUtil();
	
	/*@Before
	public void inicializar(){
	util = new ChassiUtil();
	}*/

	@Test
	public void testarAnoAChassi() {
		assertEquals(util.obterAno("9BP17164GA0000001", 10), 2010);
	}
	
	@Test
	public void testarAnoAMinusculoChassi(){
		assertEquals(util.obterAno("9bp17164ga0000001", 10), 2010);
	}
	
	@Test
	public void testarAnoBChassi() {
		assertEquals(util.obterAno("9BP17164GB0000001", 10), 2011);
	}
	
	@Test
	public void testarAnoCChassi() {
		assertEquals(util.obterAno("9BP17164GC0000001", 10), 2012);
	}
	
	@Test
	public void testarAnoDChassi() {
		assertEquals(util.obterAno("9BP17164GD0000001", 10), 2013);
	}
	
	@Test
	public void testarAnoEChassi() {
		assertEquals(util.obterAno("9BP17164GE0000001", 10), 2014);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testarChassiInvalido(){
		assertEquals(util.obterAno("9BP17164GE0000001", 10), 2014);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testarPosicaoInvalido(){
		assertEquals(util.obterAno("9BP17164GE0000001", -5), 2014);
	}


}
