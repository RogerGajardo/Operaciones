package tata.operaciones;

public class Operaciones {

	public int sumar (int a, int b)
	{
		//if 
		return (a== 0 || b == 0)? 0:a+b;
	}
	
	public int resta(int a, int b) {
		
		return (b>a)? 0:a-b;
	}
	
	public int multiplicar(int a, int b) {
		return (b==0)? 1:a*b;
	}
	
	public double division(int a, int b) {
		return (b==0)? 0:(double)a/b;
	}
}
