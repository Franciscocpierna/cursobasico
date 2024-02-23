package projetotriangulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ProjetoTriangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoTriangulo frame = new ProjetoTriangulo();
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
	public ProjetoTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Segmento a");
		lblNewLabel_2.setBounds(20, 54, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Segmento b");
		lblNewLabel_1.setBounds(20, 98, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Segmento c");
		lblNewLabel.setBounds(20, 135, 57, 14);
		contentPane.add(lblNewLabel);
		
		JSlider sliA = new JSlider();
		
		sliA.setValue(0);
		sliA.setMaximum(20);
		sliA.setBounds(87, 54, 131, 26);
		contentPane.add(sliA);
		
		JSlider sliB = new JSlider();
		
		sliB.setValue(0);
		sliB.setMaximum(20);
		sliB.setBounds(87, 90, 131, 26);
		contentPane.add(sliB);
		
		JSlider sliC = new JSlider();
		
		sliC.setValue(0);
		sliC.setMaximum(20);
		sliC.setBounds(87, 123, 131, 26);
		contentPane.add(sliC);
		
		JLabel lblA = new JLabel("0");
		lblA.setBounds(227, 54, 46, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("0");
		lblB.setBounds(227, 90, 46, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("0");
		lblC.setBounds(228, 123, 48, 14);
		contentPane.add(lblC);
		
		JPanel panResposta = new JPanel();
		panResposta.setBounds(10, 177, 417, 128);
		contentPane.add(panResposta);
		panResposta.setLayout(null);
		
		JLabel lblStatus = new JLabel("Forma ou Não");
		lblStatus.setForeground(new Color(135, 206, 235));
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblStatus.setBounds(10, 11, 407, 55);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		panResposta.add(lblStatus);
		
		JLabel lblTipo = new JLabel("Tipo de Triângulo");
		lblTipo.setForeground(new Color(250, 128, 114));
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setBounds(10, 57, 407, 60);
		panResposta.add(lblTipo);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panResposta.setVisible(true);
				int a = sliA.getValue(); 
				int b = sliB.getValue();
				int c = sliC.getValue();
				if (a < b+c && b < a+c && c < a+b) {
					lblStatus.setText("Forma um triângulo");
					if (a==b && b ==c) {
						lblTipo.setText("Triangulo Equilatero");
					}else if (a!=b && a!=c && b!=c){
						lblTipo.setText("Triangulo Escaleno");
					}else {
						lblTipo.setText("Triangulo Isoceles");
					}
				}else {
					lblStatus.setText("Não forma um triângulo");
					lblTipo.setText("------------");
				
				}
			}
		});
		btnVerificar.setBounds(293, 136, 89, 23);
		contentPane.add(btnVerificar);
		panResposta.setVisible(false);
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}	
		});
		
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliB.getValue()));
			}
		});
		
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
	}
}
