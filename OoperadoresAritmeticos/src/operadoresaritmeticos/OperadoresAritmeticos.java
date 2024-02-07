package operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int n1=3;
		int n2=5;
		float m = (n1+n2)/2;
		System.out.println("Amédia é : "+ m);
       */
		int numero = 5;
		numero++;
		
		System.out.println(numero);
		numero--;
		System.out.println(numero);
		int valor = 5 + numero++;
		System.out.println(valor);
		System.out.println(numero);
		int numero1 = 5;
		int valor1 = 5 + --numero1;
		System.out.println(valor1);
		int numero2=5;
		int valor2 = 5 + numero2--;
		System.out.println(valor2);
	}

}
