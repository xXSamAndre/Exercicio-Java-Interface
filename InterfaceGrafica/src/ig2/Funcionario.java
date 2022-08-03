package ig2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCargo;
	private JTextField tfSalario;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(35, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cargo");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(35, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salario");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(35, 85, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfNome.setBounds(91, 32, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCargo = new JTextField();
		tfCargo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfCargo.setBounds(91, 57, 86, 20);
		contentPane.add(tfCargo);
		tfCargo.setColumns(10);
		
		tfSalario = new JTextField();
		tfSalario.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfSalario.setBounds(91, 82, 86, 20);
		contentPane.add(tfSalario);
		tfSalario.setColumns(10);
		
		JButton btnNewButton = new JButton("Aumentar Salario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				
				if (salario <= 1500) {
					sal = salario * 1.3;
				} else if (salario <= 2000) {
					sal = salario * 1.2;
				} else {
					sal = salario * 1.1;
				}
					
				tfResultado.setText(""+nome+"\nCargo:  "+cargo+"\nNovo Salario: R$  "+sal);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(35, 110, 130, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Diminuir Salario");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario * 0.9;
				} else if (salario <= 2000) {
					sal = salario * 0.8;
				} else {
					sal = salario * 0.7;
				}
				
				tfResultado.setText(""+nome+" Cargo:  "+cargo+" Novo Salario: R$"+sal);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setBounds(175, 110, 130, 23);
		contentPane.add(btnNewButton_1);
		
		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfResultado.setBounds(35, 144, 257, 90);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
	}

}
