package equacaosegundograu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EquacaoSegundoGrau extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquacaoSegundoGrau frame = new EquacaoSegundoGrau();
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
	public EquacaoSegundoGrau() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("<html>X<sup>2</sup> + <html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 39, SpringLayout.NORTH, contentPane);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("X +");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 8, SpringLayout.NORTH, lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2);
		
		JSpinner txtA = new JSpinner();
		
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.EAST, txtA, -361, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 6, SpringLayout.EAST, txtA);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtA, 0, SpringLayout.NORTH, lblNewLabel_1);
		contentPane.add(txtA);
		
		JSpinner txtB = new JSpinner();
		
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtB, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtB, 6, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(txtB);
		
		JSpinner txtC = new JSpinner();
		
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_2, -6, SpringLayout.WEST, txtC);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtC, 5, SpringLayout.NORTH, lblNewLabel_1);
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(txtC);
		
		JLabel lblNewLabel = new JLabel("= 0");
		sl_contentPane.putConstraint(SpringLayout.EAST, txtC, -6, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 292, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 8, SpringLayout.NORTH, lblNewLabel_1);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblB = new JLabel("B");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblB, 45, SpringLayout.SOUTH, txtA);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblB, 106, SpringLayout.WEST, contentPane);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblB);
		
		JLabel lblNewLabel_7 = new JLabel("<html>&Delta =</html>");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_7, 52, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_7, -399, SpringLayout.EAST, contentPane);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 112, SpringLayout.NORTH, contentPane);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("<html><sup>2</sup><html>");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblB, -1, SpringLayout.WEST, lblNewLabel_9);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_9, -8, SpringLayout.NORTH, lblB);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_9, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_9, -338, SpringLayout.EAST, contentPane);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_5 = new JLabel("- 4");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, lblB);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_5, 151, SpringLayout.WEST, contentPane);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblA = new JLabel("A");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblA, 13, SpringLayout.EAST, lblNewLabel_5);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblA, 45, SpringLayout.SOUTH, txtB);
		contentPane.add(lblA);
		
		JLabel lblNewLabel_6 = new JLabel(".");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblA, -9, SpringLayout.WEST, lblNewLabel_6);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 0, SpringLayout.NORTH, lblB);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_6, -12, SpringLayout.EAST, lblNewLabel_2);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblC = new JLabel("C");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblC, 0, SpringLayout.NORTH, lblB);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblC, 6, SpringLayout.EAST, lblNewLabel_6);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblC, -8, SpringLayout.EAST, txtC);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblC);
		
		JButton btnCalc = new JButton("<html>Calcular o &Delta</html>");
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCalc, 6, SpringLayout.SOUTH, lblB);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCalc, 0, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(btnCalc);
		
		JPanel panResultado = new JPanel();
		panResultado.setAlignmentX(Component.LEFT_ALIGNMENT);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panResultado, -106, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panResultado, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panResultado, 33, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panResultado, -99, SpringLayout.EAST, contentPane);
		contentPane.add(panResultado);
		SpringLayout sl_panResultado = new SpringLayout();
		panResultado.setLayout(sl_panResultado);
		
		JLabel lblNewLabel_3 = new JLabel("<html>Valor de &Delta</html>");
		sl_panResultado.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 10, SpringLayout.NORTH, panResultado);
		sl_panResultado.putConstraint(SpringLayout.WEST, lblNewLabel_3, 10, SpringLayout.WEST, panResultado);
		lblNewLabel_3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblNewLabel_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panResultado.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de Raizes");
		sl_panResultado.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 27, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panResultado.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_3);
		panResultado.add(lblNewLabel_4);
		
		JLabel lblDelta = new JLabel("0");
		sl_panResultado.putConstraint(SpringLayout.NORTH, lblDelta, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_panResultado.putConstraint(SpringLayout.WEST, lblDelta, 127, SpringLayout.EAST, lblNewLabel_3);
		panResultado.add(lblDelta);
		
		JLabel lblRaiz = new JLabel("0");
		sl_panResultado.putConstraint(SpringLayout.WEST, lblRaiz, 0, SpringLayout.WEST, lblDelta);
		sl_panResultado.putConstraint(SpringLayout.SOUTH, lblRaiz, 0, SpringLayout.SOUTH, lblNewLabel_4);
		panResultado.add(lblRaiz);
		
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}	
		});
		
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			  lblC.setText(txtC.getValue().toString());
			}
			
		});
		
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString()); 
			}
		});
	    panResultado.setVisible(false);
	    btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				double d = Math.pow(b, 2) - 4 * a * c;
				lblDelta.setText(String.format("%.1f", d));
				panResultado.setVisible(true);
				if (d < 0) {
					lblRaiz.setText("Não Existem Raizes Reais");
				}else {
					lblRaiz.setText("Existem Raizes Reais");
				}
					
			}
		});
	}
}
