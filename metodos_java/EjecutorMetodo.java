package metodos_java;

public class EjecutorMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 =10;
		int var2 =25;
		sumar(var1, var2);
		
		int resultadoMain = restar(8, 2);
		System.out.println("El resultado de restar desde el metodo: "+ resultadoMain);
		

	}
	static void sumar(int param1, int param2) {
		System.out.println("Esto es un ejemplo de un método");
		System.out.println("Esto es el valor de param1: "+ param1);
		System.out.println("Esto es el valor de param2: "+ param2);
		int resultado = param1 + param2;
		System.out.println("El resultado de la suma es: "+ resultado);
	}
	
	static int restar(int param1, int param2) {
		int resultado = param1 - param2;
		return resultado;
	}

}
