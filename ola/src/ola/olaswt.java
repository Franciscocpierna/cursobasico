package ola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class olaswt {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					olaswt window = new olaswt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public olaswt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLabel = new JLabel("New label");
		lblLabel.setBounds(156, 52, 165, 14);
		frame.getContentPane().add(lblLabel);
		
		JButton btnBotao = new JButton("click aqui");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 lblLabel.setText("Ola Mundo");	
			}
		});
		btnBotao.setBounds(156, 119, 89, 23);
		frame.getContentPane().add(btnBotao);
	}

}
