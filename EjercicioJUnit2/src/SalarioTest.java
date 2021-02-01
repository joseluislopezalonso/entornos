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
	public void testCalculaSalarioBruto2() {
		Salario s3=new Salario("vendedor",1500,3);
		float x=s3.calculaSalarioBruto(s3.tipo, s3.ventasMes, s3.horasExtra);
		assertEquals(1260, x);
	}
	
	public void testCalculaSalarioBruto3() {
		Salario s4=new Salario("vendedor",1499.9f,0);
		float x=s4.calculaSalarioBruto(s4.tipo, s4.ventasMes, s4.horasExtra);
		assertEquals(1100, x);
	}
	public void testCalculaSalarioBruto4() {
		Salario s5=new Salario("encargado",1250,8);
		float x=s5.calculaSalarioBruto(s5.tipo, s5.ventasMes, s5.horasExtra);
		assertEquals(1760, x);
	}
	public void testCalculaSalarioBruto5() {
		Salario s6=new Salario("encargado",1000,0);
		float x=s6.calculaSalarioBruto(s6.tipo, s6.ventasMes, s6.horasExtra);
		assertEquals(1600, x);
	}
	public void testCalculaSalarioBruto6() {
		Salario s7=new Salario("encargado",999.9f,3);
		float x=s7.calculaSalarioBruto(s7.tipo, s7.ventasMes, s7.horasExtra);
		assertEquals(1100, x);
	}
	public void testCalculaSalarioBruto7() {
		Salario s8=new Salario("encargado",500,0);
		float x=s8.calculaSalarioBruto(s8.tipo, s8.ventasMes, s8.horasExtra);
		assertEquals(1500, x);
	}
	public void testCalculaSalarioBruto8() {
		Salario s9=new Salario("encargado",0,8);
		float x=s9.calculaSalarioBruto(s9.tipo, s9.ventasMes, s9.horasExtra);
		assertEquals(1660, x);
	}


	@Test
	public void testCalcularSalarioNeto() {
		float x=s2.calcularSalarioNeto(2000);
		assertEquals(1640, x);
	}
	public void testCalcularSalarioNeto2() {
		float x=s2.calcularSalarioNeto(1500);
		assertEquals(1230, x);
	}
	public void testCalcularSalarioNeto3() {
	
		float x=s2.calcularSalarioNeto(1499.99f);
		assertEquals(1259.9916, x);
	}
	public void testCalcularSalarioNeto4() {
	
		float x=s2.calcularSalarioNeto(1250);
		assertEquals(1050, x);
	}
	public void testCalcularSalarioNeto5() {
	
		float x=s2.calcularSalarioNeto(1000);
		assertEquals(840, x);
	}
	public void testCalcularSalarioNeto6() {
	
		float x=s2.calcularSalarioNeto(999.99f);
		assertEquals(999.99, x);
	}
	public void testCalcularSalarioNeto7() {
	
		float x=s2.calcularSalarioNeto(500);
		assertEquals(500, x);
	}

	public void testCalcularSalarioNeto8() {

		float x = s2.calcularSalarioNeto(0);
		assertEquals(0, x);
	}

}
