import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalarioTest {
Salario s1=new Salario();
private Salario s2;
	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testSalario() {
		Salario s1=new Salario();
		String tip=s1.getTipo();
		assertNull(tip);
	}

	@Test
	public void testSalarioStringFloatFloat() {
		Salario s2=new Salario("vendedor",2000,8);
		String tip=s2.getTipo();
		assertEquals("vendedor", tip);
	}

	@Test
	public void testToString() {
		Salario s2=new Salario("vendedor",2000,8);
		String texto="El salario bruto es 1360 y el salario neto es 1142,4";
		String texto2=s2.toString();
		assertEquals(texto, texto2);
	}

	@Test
	public void testGetTipo() {
		Salario s2=new Salario("vendedor",2000,8);
		String x=s2.getTipo();
		assertEquals("vendedor", x);
	}

	@Test
	public void testSetTipo() {
		Salario s2=new Salario("vendedor",2000,8);
		 s2.setTipo("empleado");
		String x=s2.getTipo();
		assertEquals("empleado", x);
		
	}

	@Test
	public void testGetVentasMes() {
		Salario s2=new Salario("vendedor",2000,8);
		float x=s2.getVentasMes();
		assertEquals(2000, x);
	}

	@Test
	public void testSetVentasMes() {
		Salario s2=new Salario("vendedor",2000,8);
		s2.setVentasMes(2500);
		float x=s2.getVentasMes();
		assertEquals(2500, x);
	}

	@Test
	public void testGetHorasExtra() {
		Salario s2=new Salario("vendedor",2000,8);
		float x=s2.getHorasExtra();
		assertEquals(8, x);
	}

	@Test
	public void testSetHorasExtra() {
		Salario s2=new Salario("vendedor",2000,8);
		s2.setHorasExtra(20);
		float x=s2.getHorasExtra();
		assertEquals(20, x);
	}

	@Test
	public void testCalculaSalarioBruto() {
		s2=new Salario("vendedor",2000,8);
		float x=s2.calculaSalarioBruto(s2.tipo, s2.ventasMes, s2.horasExtra);
		assertEquals(1360, x);
	}

	@Test
	public void testCalcularSalarioNeto() {
		
		float salarioBruto=2000;
		float x=s2.calcularSalarioNeto(salarioBruto);
		assertEquals(1640, x);
	}

}
