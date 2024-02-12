
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x, y, z;
        x=4;
        y=7;
        z=12;
        boolean r;
        boolean res;
        r = (x<y && y<z) ? true:false;
        System.out.println(r);
        res = (x<y ^ y<z) ? true:false;
        System.out.println(res);
	}

}
