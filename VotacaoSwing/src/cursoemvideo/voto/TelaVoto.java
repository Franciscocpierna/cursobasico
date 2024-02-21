package cursoemvideo.voto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVoto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVoto frame = new TelaVoto();
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
	public TelaVoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimeto");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 20, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtAno, 19, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtAno, 0, SpringLayout.SOUTH, lblNewLabel);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblR = new JLabel("Resultado");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblR, 84, SpringLayout.SOUTH, txtAno);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblR, 57, SpringLayout.WEST, contentPane);
		contentPane.add(lblR);
		
		JButton btnVoto = new JButton("Posso votar");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtAno.getText());
				int i = 2024 - a;
				if(i< 16) {
					lblR.setText("Não Vota");
				/*}else {
					if ((i>=16 && i<18) || (i>70)) {
						lblR.setText("Voto Opcional");
					}else {
						lblR.setText("Voto Obrigatório");
					}*/
					// ou faça isso
					
				}else if ((i>=16 && i<18) || (i>70)) {
					lblR.setText("Voto Opcional");
				}else {
					lblR.setText("Voto Obrigatório");
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnVoto, 31, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVoto, 35, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVoto, -30, SpringLayout.NORTH, lblR);
		contentPane.add(btnVoto);
	}
}
