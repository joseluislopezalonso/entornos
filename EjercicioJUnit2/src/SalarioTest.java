import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalarioTest {

	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testSalario() {
		Salario s1=new Salario();
		assertNotNull(s1);
	}
	

	@Test
	public void testCalculaSalarioBruto() {
		float x=Salario.calculaSalarioBruto("vendedor",2000,8);
		assertEquals(1360, x,0.2);
	}
	
	@Test
	public void testCalculaSalarioBruto2() {
		float x=Salario.calculaSalarioBruto("vendedor",1500,3);
		assertEquals(1260, x,0.2);
	}
	@Test
	public void testCalculaSalarioBruto3() {
		float x=Salario.calculaSalarioBruto("vendedor",1499.9f,0);
		assertEquals(1100, x,0.2);
	}
	@Test
	public void testCalculaSalarioBruto4() {
		float x=Salario.calculaSalarioBruto("encargado",1250,8);
		assertEquals(1760, x,0.2);
	}
	@Test
	public void testCalculaSalarioBruto5() {
		float x=Salario.calculaSalarioBruto("encargado",1000,0);
		assertEquals(1600, x,0.2);
	}
	@Test
	public void testCalculaSalarioBruto6() {
		float x=Salario.calculaSalarioBruto("encargado",999.9f,3);
		assertEquals(1560.0f, x,0.2);
	}
	@Test
	public void testCalculaSalarioBruto7() {
		float x=Salario.calculaSalarioBruto("encargado",500,0);
		assertEquals(1500, x,0.2);
	}
	@Test
	public void testCalculaSalarioBruto8() {
		float x=Salario.calculaSalarioBruto("encargado",0,8);
		assertEquals(1660, x,0.2);
	}


	@Test
	public void testCalcularSalarioNeto() {
		float x=Salario.calcularSalarioNeto(2000);
		assertEquals(1640, x,0.2);
	}
	@Test
	public void testCalcularSalarioNeto2() {
		float x=Salario.calcularSalarioNeto(1500);
		assertEquals(1230, x ,0.2);
	}
	@Test
	public void testCalcularSalarioNeto3() {
	
		float x=Salario.calcularSalarioNeto(1499.99f);
		assertEquals(1259.9916, x,0.2);
	}
	@Test
	public void testCalcularSalarioNeto4() {
	
		float x=Salario.calcularSalarioNeto(1250);
		assertEquals(1050, x,0.2);
	}
	@Test
	public void testCalcularSalarioNeto5() {
	
		float x=Salario.calcularSalarioNeto(1000);
		assertEquals(840, x,0.2);
	}
	@Test
	public void testCalcularSalarioNeto6() {
	
		float x=Salario.calcularSalarioNeto(999.99f);
		assertEquals(999.99, x,0.2);
	}
	@Test
	public void testCalcularSalarioNeto7() {
	
		float x=Salario.calcularSalarioNeto(500);
		assertEquals(500, x,0.2);
	}
	
	@Test
	public void testCalcularSalarioNeto8() {
		float x = Salario.calcularSalarioNeto(0);
		assertEquals(0, x,0.2);
	}

}