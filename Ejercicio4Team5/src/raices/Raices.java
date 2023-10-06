package raices;

public class Raices 
{	
	private double a;
	private double b;
	private double c;

	public Raices(double a, double b, double c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;		
	}

	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}
	
	public double getDiscriminante() {
		return Math.pow(b, 2) - 4*a*c;
	}
	
	public boolean tieneRaices() {
		return (getDiscriminante() >= 0);
	}
	
	public boolean tieneRaiz() {
		return (getDiscriminante() == 0);	
	}
	
	public void calcular() {
		if (tieneRaices()) {
			double ecuacion1 = (-b + Math.sqrt(getDiscriminante())) / (2*a);
			double ecuacion2 = (-b - Math.sqrt(getDiscriminante())) / (2*a);
			System.out.println("Solución 1: " + ecuacion1);
			System.out.println("Solución 1: " + ecuacion2);
		} else {
			System.out.println("No tiene solución");
		}
			
	}
}
