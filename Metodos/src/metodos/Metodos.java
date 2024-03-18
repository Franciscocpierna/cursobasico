package metodos;


public class Metodos {

	/*static  void soma(int a, int b) { procedimento sem retorno usando void  
		int s= a+b;
		System.out.println("A soma é "+s);
	} */
	static  int soma(int a, int b) {   //procedimento sem retorno usando tipo primitivo int  
		int s= a+b;
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("começou o programa ");
		int sm=soma(5,2);
        System.out.println("A soma é "+sm);
	}

}
