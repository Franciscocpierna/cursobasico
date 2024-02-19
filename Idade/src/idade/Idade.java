package idade;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Em que ano você nasceu: ");
        int nasc =  teclado.nextInt();
        
        int i = 2024 - nasc;
        if (i>=18) {
        	System.out.print("Maior voce tem " + i + " anos");
        } else {
            System.out.print("Menor você tem " + i + " anos");
        }	
        
        
        
	}

}
