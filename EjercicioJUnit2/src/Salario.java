public class Salario {


	Salario(){
	
		}
	
	
	public static float calculaSalarioBruto(String tipo, float ventasMes,float horasExtra) {
		float salario=0;
		float salarioBase=0;
		float prima=0;
		float horas=0;
		if (tipo.equals("vendedor")) {
			salarioBase=1000;
		}else {
			if (tipo.equals("encargado")) {
				salarioBase=1500;
			} else {
				System.out.println("no reconozco el tipo");
			} 
		}
		if (ventasMes>=1000 && ventasMes<1500) {
			prima=100;
		}else {
			if (ventasMes>=1500) {
				prima=200;
			} else {
				prima=0;
			}
		}
		horas=horasExtra*20;
		salario=salarioBase+prima+horas;
		return salario;
		
	}
	public static float calcularSalarioNeto(float salarioBruto) {
		float salBru=salarioBruto;
		
			if (salarioBruto>=1000 && salarioBruto<1500) {
				salBru=(float) (salarioBruto-(salarioBruto*0.16));
			}
			if (salarioBruto>=1500) {
				salBru=(float) (salarioBruto-(salarioBruto*0.18));
				
			}
		
		return salBru;
		
	}
}public class Salario {


	Salario(){
	
		}
	
	
	public static float calculaSalarioBruto(String tipo, float ventasMes,float horasExtra) {
		float salario=0;
		float salarioBase=0;
		float prima=0;
		float horas=0;
		if (tipo.equals("vendedor")) {
			salarioBase=1000;
		}else {
			if (tipo.equals("encargado")) {
				salarioBase=1500;
			} else {
				System.out.println("no reconozco el tipo");
			} 
		}
		if (ventasMes>=1000 && ventasMes<1500) {
			prima=100;
		}else {
			if (ventasMes>=1500) {
				prima=200;
			} else {
				prima=0;
			}
		}
		horas=horasExtra*20;
		salario=salarioBase+prima+horas;
		return salario;
		
	}
	public static float calcularSalarioNeto(float salarioBruto) {
		float salBru=salarioBruto;
		
			if (salarioBruto>=1000 && salarioBruto<1500) {
				salBru=(float) (salarioBruto-(salarioBruto*0.16));
			}
			if (salarioBruto>=1500) {
				salBru=(float) (salarioBruto-(salarioBruto*0.18));
				
			}
		
		return salBru;
		
	}
}