import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class relogio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					relogio frame = new relogio();
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
	public relogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel Lblimagem = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, Lblimagem, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, Lblimagem, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, Lblimagem, 190, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, Lblimagem, 228, SpringLayout.WEST, contentPane);
		Lblimagem.setIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\fundobrilho1.jpg"));
		contentPane.add(Lblimagem);
		
		JLabel lblDatahora = new JLabel(" Data e Hora do Sistema");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDatahora, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDatahora, 238, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDatahora, 62, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblDatahora, 448, SpringLayout.WEST, contentPane);
		lblDatahora.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblDatahora);
		
		JLabel lbHora = new JLabel("Click nesse Botão");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lbHora, 68, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lbHora, 238, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lbHora, 469, SpringLayout.WEST, contentPane);
		contentPane.add(lbHora);
		
		JButton btnNewButton = new JButton("Clicar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 106, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 238, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 129, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 342, SpringLayout.WEST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				lbHora.setText(relogio.toString()); 
			}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLUE);
		contentPane.add(btnNewButton);
	}
}
