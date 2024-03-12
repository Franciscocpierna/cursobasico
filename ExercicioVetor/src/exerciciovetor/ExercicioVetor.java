package exerciciovetor;
import javax.swing.DefaultListModel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.List;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;


public class ExercicioVetor extends JFrame {
    int  vetor[] = new int[5];
	
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioVetor frame = new ExercicioVetor();
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
	public ExercicioVetor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(10, 11, 30, 20);
		contentPane.add(txtNum);
		
		JButton btnAdd = new JButton("Adicionar");
		
		btnAdd.setBounds(60, 10, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remover");
		
		btnRemove.setBounds(60, 54, 89, 23);
		contentPane.add(btnRemove);
		
		JButton btnOrd = new JButton("Ordenar");
		
		btnOrd.setBounds(60, 103, 89, 23);
		contentPane.add(btnOrd);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setText("vetor");
		lblNewLabel.setBounds(217, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSelecionado = new JLabel("0");
		lblSelecionado.setBounds(257, 14, 46, 14);
		contentPane.add(lblSelecionado);
		
		JList lstVetor = new JList();
		lstVetor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecionado= lstVetor.getSelectedIndex();
				lblSelecionado.setText("["+selecionado+"]");
				
			}
		});
		lstVetor.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstVetor.setBounds(188, 68, 95, 133);
		contentPane.add(lstVetor);
		for (int c = 0; c < vetor.length; c++) {
			lista.addElement(vetor[c]);
			lstVetor.setModel(lista);
			
		}
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado]= Integer.parseInt(txtNum.getValue().toString());
				lista.removeAllElements();
				for (int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
					lstVetor.setModel(lista);
					
				}
				 
			}
		});
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  vetor[selecionado]=0;	
			  lista.removeAllElements();
			  for (int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
					lstVetor.setModel(lista);
					
				}
			}
		});
		btnOrd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(vetor);
				lista.removeAllElements();
				 for (int c = 0; c < vetor.length; c++) {
						lista.addElement(vetor[c]);
						lstVetor.setModel(lista);
						
					}
			}
		});
	}
}
