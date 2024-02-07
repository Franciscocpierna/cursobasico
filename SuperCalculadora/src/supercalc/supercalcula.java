package supercalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class supercalcula extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supercalcula frame = new supercalcula();
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
	public supercalcula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Digite um valor");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 54, SpringLayout.NORTH, contentPane);
		contentPane.add(lblNewLabel);
		
		JSpinner txtNum = new JSpinner();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNum, 116, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, txtNum);
		txtNum.setModel(new SpinnerNumberModel(1, -50, 50, 1));
		contentPane.add(txtNum);
		
		JPanel panCalc = new JPanel();
		
		JButton btnCalc = new JButton("Calcular");
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCalc, 100, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtNum, -24, SpringLayout.NORTH, btnCalc);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCalc, 57, SpringLayout.WEST, contentPane);
		contentPane.add(btnCalc);
		
		//JPanel panCalc = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panCalc);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panCalc, 11, SpringLayout.SOUTH, btnCalc);
		sl_contentPane.putConstraint(SpringLayout.WEST, panCalc, 25, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panCalc, 6, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panCalc, -301, SpringLayout.EAST, contentPane);
		contentPane.add(panCalc);
		SpringLayout sl_panCalc = new SpringLayout();
		panCalc.setLayout(sl_panCalc);
	    	
		
		JLabel lblNewLabel_3 = new JLabel("Resto da divisão por 2");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 5, SpringLayout.NORTH, panCalc);
		sl_panCalc.putConstraint(SpringLayout.WEST, lblNewLabel_3, 5, SpringLayout.WEST, panCalc);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panCalc.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Elevado ao Cubo");
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 33, SpringLayout.NORTH, panCalc);
		sl_panCalc.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_3);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		panCalc.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Raiz Quadrada");
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 6, SpringLayout.SOUTH, lblNewLabel_2);
		sl_panCalc.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_3);
		panCalc.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Raiz Cúbica");
		sl_panCalc.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, lblNewLabel_3);
		panCalc.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Absoluto");
		sl_panCalc.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_3);
		sl_panCalc.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, -10, SpringLayout.SOUTH, panCalc);
		panCalc.add(lblNewLabel_6);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setForeground(SystemColor.textHighlight);
		lblResto.setFont(new Font("Sylfaen", Font.BOLD, 14));
		sl_panCalc.putConstraint(SpringLayout.SOUTH, lblResto, 0, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panCalc.putConstraint(SpringLayout.EAST, lblResto, -10, SpringLayout.EAST, panCalc);
		panCalc.add(lblResto);
		
		JLabel lblCubo = new JLabel("0");
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblCubo, 7, SpringLayout.SOUTH, lblResto);
		lblCubo.setForeground(SystemColor.textHighlight);
		lblCubo.setFont(new Font("Sylfaen", Font.BOLD, 14));
		sl_panCalc.putConstraint(SpringLayout.EAST, lblCubo, 0, SpringLayout.EAST, lblResto);
		panCalc.add(lblCubo);
		
		JLabel lblRaizQ = new JLabel("0");
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblRaizQ, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_panCalc.putConstraint(SpringLayout.EAST, lblRaizQ, 0, SpringLayout.EAST, lblResto);
		lblRaizQ.setForeground(SystemColor.textHighlight);
		lblRaizQ.setFont(new Font("Sylfaen", Font.BOLD, 14));
		panCalc.add(lblRaizQ);
		
		JLabel lblRaizC = new JLabel("0");
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, lblRaizC);
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblRaizC, 85, SpringLayout.NORTH, panCalc);
		lblRaizC.setForeground(SystemColor.textHighlight);
		lblRaizC.setFont(new Font("Sylfaen", Font.BOLD, 14));
		sl_panCalc.putConstraint(SpringLayout.EAST, lblRaizC, 0, SpringLayout.EAST, lblResto);
		panCalc.add(lblRaizC);
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setForeground(SystemColor.textHighlight);
		lblAbs.setFont(new Font("Sylfaen", Font.BOLD, 14));
		sl_panCalc.putConstraint(SpringLayout.NORTH, lblAbs, 0, SpringLayout.NORTH, lblNewLabel_6);
		sl_panCalc.putConstraint(SpringLayout.WEST, lblAbs, 0, SpringLayout.WEST, lblResto);
		panCalc.add(lblAbs);
		panCalc.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblResto, lblCubo, lblRaizQ, lblRaizC, lblAbs}));
		
		JLabel lblNewLabel_1 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNum, -159, SpringLayout.WEST, lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\fundobrilho1.jpg"));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 69, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, -219, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -52, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -35, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel_1);
		panCalc.setVisible(false);
		
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getValue().toString());
				//resto da divisão
				int r = num % 2;
				lblResto.setText(Integer.toString(r));
				// cubo
				double c = Math.pow(num, 3);
				lblCubo.setText(Double.toString(c));
				//Raiz Quadrada
				double rq = Math.sqrt(num);
				lblRaizQ.setText(String.format("%.2f",rq));
				// Raiz cubica
				double rc = Math.cbrt(num);
				lblRaizC.setText(String.format("%.2f",rc));
				// valor absoluto
				int abs = Math.abs(num);
				lblAbs.setText(Integer.toString(abs));
				panCalc.setVisible(true);
			}
		});
	}
}
