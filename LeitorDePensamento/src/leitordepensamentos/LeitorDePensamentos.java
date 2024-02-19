package leitordepensamentos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LeitorDePensamentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				try {
					LeitorDePensamentos frame = new LeitorDePensamentos();
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
	public LeitorDePensamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblFrase = new JLabel("Frase");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblFrase, 23, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblFrase, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblFrase);
		
		JLabel lblNewLabel_1 = new JLabel("Valor");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblFrase);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -93, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblNewLabel_1);
		
		JSpinner txtVal = new JSpinner();
		txtVal.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtVal, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtVal, 28, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(txtVal);
		lblFrase.setText("<html>Vou pensar em um valor entre <strong>1 e 5.</strong> tente advinhar</html>");
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = 1 + Math.random() * 4 ;
				int valor = (int) n;
		        int num = Integer.parseInt(txtVal.getValue().toString());
		        String f1 ="Acertou";
		        String f2 ="<html>ERROU eu pensei no valor "+ valor+"</html>";
		        String res = (valor==num)?f1:f2;
		        lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 18));
		        lblFrase.setText(res);
				
			}
		});
		btnPalpite.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPalpite, 21, SpringLayout.SOUTH, txtVal);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPalpite, 0, SpringLayout.WEST, lblFrase);
		contentPane.add(btnPalpite);
	}
}
