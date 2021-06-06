package calculadora04052021;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrameI extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JTextField tfResultado;
	Principal principal = new Principal();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameI frame = new FrameI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrameI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Calculadora Gr\u00E1fica");
		lblNewLabel.setFont(new Font("Piximisa", Font.BOLD, 32));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 434, 41);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		JLabel lblDigiteOsNumeros = new JLabel("Digite os n\u00FAmeros: ");
		lblDigiteOsNumeros.setFont(new Font("Piximisa", Font.PLAIN, 13));
		lblDigiteOsNumeros.setBounds(21, 38, 144, 36);
		contentPane.add(lblDigiteOsNumeros);

		tfNumero1 = new JTextField();
		tfNumero1.setBackground(new Color(240, 248, 255));
		tfNumero1.setFont(new Font("Piximisa", Font.BOLD, 21));
		tfNumero1.setBounds(117, 63, 86, 36);
		contentPane.add(tfNumero1);
		tfNumero1.setColumns(10);

		tfNumero2 = new JTextField();
		tfNumero2.setBackground(new Color(240, 248, 255));
		tfNumero2.setFont(new Font("Piximisa", Font.BOLD, 21));
		tfNumero2.setBounds(254, 63, 86, 36);
		contentPane.add(tfNumero2);
		tfNumero2.setColumns(10);

		JLabel lblEscolha = new JLabel("Escolha uma opera\u00E7\u00E3o:");
		lblEscolha.setFont(new Font("Piximisa", Font.PLAIN, 13));
		lblEscolha.setBounds(21, 113, 154, 14);
		contentPane.add(lblEscolha);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setForeground(new Color(0, 0, 0));
		btnSubtracao.setBackground(Color.WHITE);
		btnSubtracao.setFont(new Font("GetCoffee regular", Font.BOLD, 17));
		btnSubtracao.setBounds(253, 138, 89, 35);
		contentPane.add(btnSubtracao);
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pegarDados();
					if (pegarDados()) {
						principal.subtracao();
						exibir();
					}
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Erro de digitação\n" + erro.getMessage());
				}
			}
		});
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setBackground(Color.WHITE);
		btnDivisao.setFont(new Font("GodOfWar", Font.BOLD, 17));
		btnDivisao.setBounds(117, 197, 89, 35);
		contentPane.add(btnDivisao);
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pegarDados();
					if (pegarDados()) {
						principal.divisao();
						exibir();
					}
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Erro de digitação\n" + erro.getMessage());	
				}
			}
		});

		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setBackground(Color.WHITE);
		btnMultiplicacao.setFont(new Font("Existence Stencil Light", Font.BOLD, 17));
		btnMultiplicacao.setBounds(253, 197, 89, 35);
		contentPane.add(btnMultiplicacao);
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pegarDados();
					if (pegarDados()) {
						principal.multiplicacao();
						exibir();
					}
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Erro de digitação\n" + erro.getMessage());
				}
			}
		});

		JButton btnAdicao = new JButton("+");
		btnAdicao.setBackground(Color.WHITE);
		btnAdicao.setFont(new Font("GodOfWar", Font.BOLD, 17));
		btnAdicao.setBounds(117, 138, 89, 35);
		contentPane.add(btnAdicao);
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pegarDados();
					if (pegarDados()) {
						principal.adicao();
						exibir();
					}
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Erro de digitação\n" + erro.getMessage());
				}
			}
		});
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Piximisa", Font.PLAIN, 13));
		lblResultado.setBounds(21, 251, 68, 14);
		contentPane.add(lblResultado);

		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Piximisa", Font.BOLD, 21));
		tfResultado.setBackground(Color.WHITE);
		tfResultado.setHorizontalAlignment(SwingConstants.CENTER);
		tfResultado.setEditable(false);
		tfResultado.setColumns(10);
		tfResultado.setBounds(91, 275, 279, 41);
		contentPane.add(tfResultado);

	}

	private boolean divisao() {
		
		return false;
	}

	private boolean subtracao() {
		
		return false;
	}

	private boolean adicao() {
		
		return false;
	}

	public void exibir() {
		tfResultado.setText(String.valueOf(principal.getResultado()));
	}

	public boolean pegarDados() {
		if ((Double.parseDouble(tfNumero1.getText()) == 0) || (Double.parseDouble(tfNumero2.getText()) == 0)) {
			return false;
		} else {
			principal.setNumero1(Double.parseDouble(tfNumero1.getText()));
			principal.setNumero2(Double.parseDouble(tfNumero2.getText()));
			return true;
		}
	}
}
