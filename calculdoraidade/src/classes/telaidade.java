package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class telaidade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaidade frame = new telaidade();
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
	public telaidade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(220, 20, 60));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 56, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JSpinner txtAN = new JSpinner();
		txtAN.setModel(new SpinnerNumberModel(1500, 1500, 2024, 1));
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtAN, -3, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtAN, 21, SpringLayout.EAST, lblNewLabel);
		contentPane.add(txtAN);
		
		JLabel lblNewLabel_1 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.EAST, txtAN, -40, SpringLayout.WEST, lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\fundobrilho1.jpg"));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, -183, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -63, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -59, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -35, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblidade = new JLabel("0");
		lblidade.setForeground(new Color(255, 0, 0));
		lblidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblidade, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblidade, 28, SpringLayout.EAST, lblNewLabel_2);
		contentPane.add(lblidade);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = 2024 - an;
				lblidade.setText(Integer.toString(id));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCalc, 25, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCalc, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(btnCalc);
	}
}
