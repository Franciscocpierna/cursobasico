package exercicio13;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import java.awt.List; 
public class Exercicio13 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio13 frame = new Exercicio13();
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
	public Exercicio13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setBounds(23, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fim");
		lblNewLabel_1.setBounds(23, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblInicio = new JLabel("0");
		lblInicio.setBounds(330, 22, 46, 14);
		contentPane.add(lblInicio);
		
		JLabel lblFim = new JLabel("6");
		lblFim.setBounds(330, 61, 46, 14);
		contentPane.add(lblFim);
		
		JLabel lblPasso = new JLabel("1");
		lblPasso.setBounds(330, 104, 46, 14);
		contentPane.add(lblPasso);
		
		JSlider sliInicio = new JSlider();
		sliInicio.setValue(0);
		sliInicio.setMaximum(5);
		sliInicio.setBounds(92, 22, 200, 26);
		contentPane.add(sliInicio);
		
		JLabel lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setBounds(23, 104, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		
		sliInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int i = sliInicio.getValue();
				lblInicio.setText(Integer.toString(i));
			}
		});
		
		
		JSlider sliFim = new JSlider();
		sliFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			 int f = sliFim.getValue();
			 lblFim.setText(Integer.toString(f));
				
			}
		});
		sliFim.setMaximum(20);
		sliFim.setMinimum(6);
		sliFim.setValue(6);
		sliFim.setBounds(92, 61, 200, 26);
		contentPane.add(sliFim);
		
		JSlider sliPasso = new JSlider();
		sliPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int p = sliPasso.getValue();
				lblPasso.setText(Integer.toString(p));
		
			}
		});
		sliPasso.setMaximum(4);
		sliPasso.setMinimum(1);
		sliPasso.setValue(1);
		sliPasso.setBounds(92, 104, 200, 26);
		contentPane.add(sliPasso);
		
		JList list = new JList();
		list.setBounds(268, 250, 1, 1);
		contentPane.add(list);
		
		JButton btnCont = new JButton("Contar");
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = sliInicio.getValue();
				int f = sliFim.getValue(); 
				int p = sliPasso.getValue();
				DefaultListModel lista = new DefaultListModel();
				
				for (int c= i; c <= f; c += p) {
					lista.addElement(c);
				
				}
				lstCont.setModel(lista);
				//listCont.setModel(lista);
			
				
			}
		});
		btnCont.setBounds(33, 141, 89, 23);
		contentPane.add(btnCont);
		
		
		
		
	}
}
