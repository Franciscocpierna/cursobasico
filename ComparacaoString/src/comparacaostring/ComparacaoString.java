package comparacaostring;

public class ComparacaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String nome1 = "Gustavo";
    String nome2 = "Gustavo";
    String nome3 = new String("Gustavo");
	String res;
	res = (nome1 == nome3)?"Igual":"Diferente";
	System.out.println("nome é "+res);
	res = (nome1.equals(nome3))?"Igual":"Diferente";
	System.out.println("nome é "+res);
	}

}
