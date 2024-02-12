package operadortenario;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1, n2, r, res;
        n1=4;
        n2=8;
        r= (n1>n2) ? 0:1;
        System.out.println("o valor de R = "+r); 
        res = (n1>n2) ? n1+n2:n2-n1;
        System.out.println("o valor de Res = "+res);
	}

}
