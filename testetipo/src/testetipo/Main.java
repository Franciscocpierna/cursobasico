package testetipo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade =30;
		//String valor = idade; não é possível faça abaixo
		String valor = Integer.toString(idade); 
        System.out.println("o valor é "+valor);
        String valor1 = "40";
        int idade1 = Integer.parseInt(valor1);
        System.out.print("a idade é: " + idade1);
        String valor2 = "30.5";
        float idade2 = Float.parseFloat(valor2);
        System.out.printf("\n a idade é: %.2f" , idade2);
	}

}
