package idiomaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
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
	public tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\fundobrilho1.jpg"));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, 169, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 158, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idioma");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 59, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 81, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, 162, SpringLayout.EAST, lblNewLabel);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIdioma = new JLabel("Idioma do Sistema");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblIdioma, 21, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblIdioma, 86, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblIdioma, 204, SpringLayout.EAST, lblNewLabel);
		contentPane.add(lblIdioma);
		JLabel lblIdioma1 = new JLabel("Adicional");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblIdioma1, 0, SpringLayout.NORTH, lblIdioma);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblIdioma1, 35, SpringLayout.EAST, lblIdioma);
		contentPane.add(lblIdioma1);
		
		JButton btnbotao = new JButton("clicar");
		btnbotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale loc = Locale.getDefault();
			    lblIdioma.setText(loc.getDisplayLanguage()); // imprime "Português
				lblIdioma1.setText (loc.getLanguage()); // imprime "pt"
			}
		});
		btnbotao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnbotao, 24, SpringLayout.SOUTH, lblIdioma);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnbotao, 73, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnbotao, -2, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnbotao, 0, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(btnbotao);
		
		
	}

}
