package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner tec = new Scanner(System.in);
      System.out.print("Quantas Pernas? ");
      int perna = tec.nextInt();
      String tipo;
      System.out.print("Isso é um(a) ");
      switch (perna) {
      case 1:
    	  tipo = "Saci";
    	  break;
      case 2:
    	  tipo = "Bipede";
    	  break;
      case 3:
    	  tipo = "Tripe";
    	  break;
      case 4:
    	  tipo = "Quadrupede";
    	  break;
      case 6:
    	  tipo = "Aranha";
    	  break;
      default:
    	  tipo = "ET";
    	  break; // esse break é opcional
      }
      System.out.println(tipo);
	}

}
