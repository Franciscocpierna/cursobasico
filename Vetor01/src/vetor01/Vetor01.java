package vetor01;

import java.util.Arrays;

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {3,2,8,7,5,4};
        //int []n = {3,2,8,7,5,4};assim ou acima mesma coisa definição				
		//int n[] = new int[4];
		// n[0]= 3; e assim socessivamente
		Arrays.sort(n);
		
		System.out.println("Total de casas de N " + n.length);
		for (int c=0;c<=n.length-1;c++) {
			System.out.println("Na posição "+c +" temos o valor " +n[c]+" ");
			
		   
		}
//
		String mes[]= {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		int tot[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0; i<mes.length; i++) {
			 System.out.println("o mes de "+mes[i]+" tem "+tot[i]+ " dias.");	
			
		}
	    
//
		double v[]= {3.5, 2.75, 9, -4.5};
		Arrays.sort(v);
		for (double valor: v) {
			System.out.print(valor + " ");
		}
//		
		int vet[]= { 3,7,6,1,9,4,2};
		int p = Arrays.binarySearch(vet, 1);
		System.out.println("Encontrei o valor na posição "+p);
				
				
		}
	}


