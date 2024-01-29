package resolucaotelaswing;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class resoltela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resoltela frame = new resoltela();
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
	public resoltela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 94, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, 262, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 277, SpringLayout.WEST, contentPane);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\fundobrilho1.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Resolução de Tela");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 152, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 43, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -66, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResolucao = new JLabel("Clicar Botão");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblResolucao, 24, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblResolucao, 6, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblResolucao, 260, SpringLayout.EAST, lblNewLabel);
		lblResolucao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblResolucao);
		
		JButton btnNewButton = new JButton("Click Aqui");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 17, SpringLayout.SOUTH, lblResolucao);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 68, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -108, SpringLayout.EAST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
			     int lar = (int) tela.getWidth();
			     int alt = (int) tela.getHeight();
			     lblResolucao.setText("Sua tela tem resolução " + lar + " x " + alt);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton);
	}

}
