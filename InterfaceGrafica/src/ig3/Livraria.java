package ig3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Livraria extends JFrame {

	private JPanel contentPane;
	private JTextField tfQuantidade;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Livraria frame = new Livraria();
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
	public Livraria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox cb1 = new JCheckBox("R$ 10");
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cb1.setBounds(181, 49, 97, 23);
		contentPane.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("R$ 20");
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cb2.setBounds(181, 75, 97, 23);
		contentPane.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("R$ 30");
		cb3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cb3.setBounds(181, 101, 97, 23);
		contentPane.add(cb3);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(10, 51, 133, 20);
		contentPane.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JCheckBox rb1 = new JCheckBox("Sim - R$ 5,00");
		rb1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rb1.setBounds(10, 121, 97, 23);
		contentPane.add(rb1);
		
		JCheckBox rb2 = new JCheckBox("N\u00E3o");
		rb2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rb2.setBounds(10, 147, 97, 23);
		contentPane.add(rb2);
		
		textField = new JTextField();
		textField.setBounds(10, 177, 369, 76);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quantidade de Livros");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 28, 133, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Pre\u00E7o dos Livros");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(181, 28, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Embrulhar para Presente?");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 105, 165, 14);
		contentPane.add(lblNewLabel_3);
	}
}
