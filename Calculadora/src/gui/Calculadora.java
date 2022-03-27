package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumeroApertado;

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 368);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPorcentagem = new JButton("%");
		btnPorcentagem.setRequestFocusEnabled(false);
		btnPorcentagem.setBorderPainted(false);
		btnPorcentagem.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnPorcentagem.setBounds(10, 80, 60, 30);
		contentPane.add(btnPorcentagem);
		
		tfNumeroApertado = new JTextField();
		tfNumeroApertado.setEditable(false);
		tfNumeroApertado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfNumeroApertado.setText("test");
		tfNumeroApertado.setHorizontalAlignment(SwingConstants.RIGHT);
		tfNumeroApertado.setBounds(10, 11, 270, 30);
		contentPane.add(tfNumeroApertado);
		tfNumeroApertado.setColumns(10);
		
		JLabel lblContaAtual = new JLabel("New label");
		lblContaAtual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContaAtual.setForeground(Color.GREEN);
		lblContaAtual.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContaAtual.setBounds(10, 52, 270, 14);
		contentPane.add(lblContaAtual);
		
		JButton btnRaizQuadrada = new JButton("Sqrt");
		btnRaizQuadrada.setRequestFocusEnabled(false);
		btnRaizQuadrada.setBorderPainted(false);
		btnRaizQuadrada.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnRaizQuadrada.setBounds(80, 80, 60, 30);
		contentPane.add(btnRaizQuadrada);
		
		JButton btnInverso = new JButton("1/x");
		btnInverso.setRequestFocusEnabled(false);
		btnInverso.setBorderPainted(false);
		btnInverso.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnInverso.setBounds(220, 80, 60, 30);
		contentPane.add(btnInverso);
		
		JButton btnExpoente = new JButton("^");
		btnExpoente.setRequestFocusEnabled(false);
		btnExpoente.setBorderPainted(false);
		btnExpoente.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnExpoente.setBounds(150, 80, 60, 30);
		contentPane.add(btnExpoente);
		
		JButton btnCe = new JButton("CE");
		btnCe.setRequestFocusEnabled(false);
		btnCe.setBorderPainted(false);
		btnCe.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnCe.setBounds(10, 121, 60, 30);
		contentPane.add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setRequestFocusEnabled(false);
		btnC.setBorderPainted(false);
		btnC.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnC.setBounds(80, 121, 60, 30);
		contentPane.add(btnC);
		
		JButton btnMudaVirgula = new JButton("<--");
		btnMudaVirgula.setRequestFocusEnabled(false);
		btnMudaVirgula.setBorderPainted(false);
		btnMudaVirgula.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnMudaVirgula.setBounds(150, 121, 60, 30);
		contentPane.add(btnMudaVirgula);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setRequestFocusEnabled(false);
		btnDivisao.setBorderPainted(false);
		btnDivisao.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnDivisao.setBounds(220, 121, 60, 30);
		contentPane.add(btnDivisao);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setRequestFocusEnabled(false);
		btnNum7.setBorderPainted(false);
		btnNum7.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum7.setBounds(10, 162, 60, 30);
		contentPane.add(btnNum7);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setRequestFocusEnabled(false);
		btnNum4.setBorderPainted(false);
		btnNum4.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum4.setBounds(10, 203, 60, 30);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setRequestFocusEnabled(false);
		btnNum5.setBorderPainted(false);
		btnNum5.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum5.setBounds(80, 203, 60, 30);
		contentPane.add(btnNum5);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setRequestFocusEnabled(false);
		btnNum8.setBorderPainted(false);
		btnNum8.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum8.setBounds(80, 162, 60, 30);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setRequestFocusEnabled(false);
		btnNum9.setBorderPainted(false);
		btnNum9.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum9.setBounds(150, 162, 60, 30);
		contentPane.add(btnNum9);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setRequestFocusEnabled(false);
		btnNum6.setBorderPainted(false);
		btnNum6.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum6.setBounds(150, 203, 60, 30);
		contentPane.add(btnNum6);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setRequestFocusEnabled(false);
		btnSubtracao.setBorderPainted(false);
		btnSubtracao.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnSubtracao.setBounds(220, 203, 60, 30);
		contentPane.add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setRequestFocusEnabled(false);
		btnMultiplicacao.setBorderPainted(false);
		btnMultiplicacao.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnMultiplicacao.setBounds(220, 162, 60, 30);
		contentPane.add(btnMultiplicacao);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setRequestFocusEnabled(false);
		btnNum1.setBorderPainted(false);
		btnNum1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum1.setBounds(10, 244, 60, 30);
		contentPane.add(btnNum1);
		
		JButton btnOposto = new JButton("+-");
		btnOposto.setRequestFocusEnabled(false);
		btnOposto.setBorderPainted(false);
		btnOposto.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnOposto.setBounds(10, 285, 60, 30);
		contentPane.add(btnOposto);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setRequestFocusEnabled(false);
		btnNum0.setBorderPainted(false);
		btnNum0.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum0.setBounds(80, 285, 60, 30);
		contentPane.add(btnNum0);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setRequestFocusEnabled(false);
		btnNum2.setBorderPainted(false);
		btnNum2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum2.setBounds(80, 244, 60, 30);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setRequestFocusEnabled(false);
		btnNum3.setBorderPainted(false);
		btnNum3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNum3.setBounds(150, 244, 60, 30);
		contentPane.add(btnNum3);
		
		JButton btnPonto = new JButton(".");
		btnPonto.setRequestFocusEnabled(false);
		btnPonto.setBorderPainted(false);
		btnPonto.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnPonto.setBounds(150, 285, 60, 30);
		contentPane.add(btnPonto);
		
		JButton btnResultado = new JButton("=");
		btnResultado.setRequestFocusEnabled(false);
		btnResultado.setBorderPainted(false);
		btnResultado.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnResultado.setBounds(220, 285, 60, 30);
		contentPane.add(btnResultado);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setRequestFocusEnabled(false);
		btnSoma.setBorderPainted(false);
		btnSoma.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnSoma.setBounds(220, 244, 60, 30);
		contentPane.add(btnSoma);
	}
}
