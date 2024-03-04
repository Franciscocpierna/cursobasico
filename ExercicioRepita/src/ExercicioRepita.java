import javax.swing.JOptionPane;
public class ExercicioRepita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null,"Ola, Mundo","Boas Vindas",JOptionPane.INFORMATION_MESSAGE);
		int n, s=0;
		do {
		  n = Integer.parseInt(JOptionPane.showInputDialog(null, 
				  "<html>Informe um número <br><i>(valor 0 interrompe)</i></html> "));
		  //JOptionPane.showMessageDialog(null,"vc digitou valor " + n);
		  s +=n;
		} while(n != 0);
		JOptionPane.showMessageDialog(null,"Resultado final------ "+"somatorio Vale" + s);
	}

}
