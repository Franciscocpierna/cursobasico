package tiposdedaos;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float nota = 8.5f; // ou 
        float nota1 = (float) 8.5;
        System.out.println("a nota é "+ nota);
        System.out.printf("a nota é %f \n", nota);
        System.out.printf("a nota é %.2f \n ", nota);
        System.out.printf("a nota é %.1f \n", nota);
        String nome ="Gustavo";
        System.out.printf("a nota é %s é %.1f \n ",nome, nota);// ou
        System.out.format("a nota é %s é %.1f \n",nome, nota);
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o nome: ");
        String nome1 = teclado.nextLine();
        System.out.print("digite a nota: ");
        float nota2 = teclado.nextFloat();
        System.out.format("a nota de %s é %.1f \n",nome1, nota2);
	}

}
