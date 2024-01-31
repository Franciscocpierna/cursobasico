package somaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formul extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formul frame = new formul();
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
	public formul() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		txtN1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtN1, 46, SpringLayout.WEST, contentPane);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtN2, 83, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtN2, -263, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtN1, 0, SpringLayout.NORTH, txtN2);
		txtN2.setColumns(10);
		contentPane.add(txtN2);
		
		JLabel lblSinalsoma = new JLabel("+");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSinalsoma, 86, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSinalsoma, 98, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblSinalsoma, -315, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtN2, 6, SpringLayout.EAST, lblSinalsoma);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtN1, -6, SpringLayout.WEST, lblSinalsoma);
		contentPane.add(lblSinalsoma);
		JLabel lblResultado = new JLabel("0");
		JButton btnSoma = new JButton("=");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblResultado, 49, SpringLayout.EAST, btnSoma);
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int s =n1+n2;
				lblResultado.setText(Integer.toString(s));
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSoma, 0, SpringLayout.NORTH, txtN1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSoma, 9, SpringLayout.EAST, txtN2);
		contentPane.add(btnSoma);
		
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblResultado, 3, SpringLayout.NORTH, txtN1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblResultado, 19, SpringLayout.EAST, btnSoma);
		contentPane.add(lblResultado);
	}
}
