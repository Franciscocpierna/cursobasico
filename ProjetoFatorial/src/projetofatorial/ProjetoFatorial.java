package projetofatorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ProjetoFatorial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoFatorial frame = new ProjetoFatorial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProjetoFatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFat = new JLabel("1");
		lblFat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFat.setBounds(154, 32, 110, 14);
		contentPane.add(lblFat);
		
		JSpinner txtN = new JSpinner();
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int n = Integer.parseInt(txtN.getValue().toString()) ;
				int f=1;
				int c=n;
				while (c>=1) {
					f*= c;
					c--;
					lblFat.setText(Integer.toString(f));
				}
			}
		});
		txtN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtN.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		txtN.setBounds(62, 29, 46, 20);
		contentPane.add(txtN);
		
		JLabel lblNewLabel_1 = new JLabel("!=");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(118, 32, 16, 14);
		contentPane.add(lblNewLabel_1);
	}
}
