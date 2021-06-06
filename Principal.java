package calculadora04052021;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal extends JPanel{

	double numero1;
	double numero2;
	double resultado;
	double adicao;

	public Principal(double numero1, double numero2, double resultado) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultado = resultado;
	}

	public Principal() {
		this(0.0, 0.0, 0.0);
	}

	public double getNumero1() {
		return numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {

		this.resultado = resultado;
	}

	public double adicao() {
		this.resultado = (numero1 + numero2);
		return resultado;
	}

	public double subtracao() {
		this.resultado = (numero1 - numero2);
		return resultado;
		// nao precisa de parametros, pega direto da variavel
	}

	public double multiplicacao() {
		this.resultado = (numero1 * numero2);
		return resultado;
	}

	public double divisao() {
		this.resultado = (numero1 / numero2);
		return resultado;
	}

	



	

}
