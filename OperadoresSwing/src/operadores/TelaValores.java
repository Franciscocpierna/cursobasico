package operadores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaValores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaValores frame = new TelaValores();
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
	public TelaValores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 248, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Numerador");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 36, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominador");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 33, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Divisão");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resto");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblDiv = new JLabel("0");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, lblDiv);
		contentPane.add(lblDiv);
		
		JLabel lblResto = new JLabel("0");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDiv, -6, SpringLayout.NORTH, lblResto);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblResto, 55, SpringLayout.EAST, lblNewLabel_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblDiv, 0, SpringLayout.EAST, lblResto);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblResto, 178, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 0, SpringLayout.NORTH, lblResto);
		contentPane.add(lblResto);
		
		txtNum = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNum, -3, SpringLayout.NORTH, lblNewLabel);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtDen = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNum, 0, SpringLayout.EAST, txtDen);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDen, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDen, 6, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(txtDen);
		txtDen.setColumns(10);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int n1 = Integer.parseInt(txtNum.getText().toString());
			int n2 = Integer.parseInt(txtDen.getText().toString());
			float div = n1/n2;
		    float res = n1 % n2;
		    lblDiv.setText(Float.toString(div));
		    lblResto.setText(Float.toString(res));
		    
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnDividir, -114, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnDividir, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(btnDividir);
	}
}
