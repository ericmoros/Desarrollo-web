import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Test {

	private JFrame frame;
	private JComboBox desplegableA;
	private JComboBox desplegableB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton enviarA = new JToggleButton("Enviar >>");
		enviarA.setBounds(71, 488, 121, 23);
		frame.getContentPane().add(enviarA);
		
		desplegableA = new JComboBox();
		desplegableA.setBounds(202, 489, 86, 20);
		frame.getContentPane().add(desplegableA);
		
		JProgressBar progressBarA = new JProgressBar();
		progressBarA.setBounds(71, 525, 217, 14);
		frame.getContentPane().add(progressBarA);
		
		JLabel Test = new JLabel("Mensaje");
		Test.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Test.setBounds(144, 237, 67, 31);
		frame.getContentPane().add(Test);
		
		JTextArea cuerpoA = new JTextArea();
		cuerpoA.setBounds(71, 269, 217, 169);
		frame.getContentPane().add(cuerpoA);
		
		JTextArea receptorA = new JTextArea();
		receptorA.setBounds(71, 46, 217, 169);
		frame.getContentPane().add(receptorA);
		
		JProgressBar progressBarB = new JProgressBar();
		progressBarB.setBounds(493, 525, 217, 14);
		frame.getContentPane().add(progressBarB);
		
		JToggleButton enviarB = new JToggleButton("<< Enviar");
		enviarB.setBounds(589, 488, 121, 23);
		frame.getContentPane().add(enviarB);
		
		desplegableB = new JComboBox();
		desplegableB.setBounds(493, 489, 86, 20);
		frame.getContentPane().add(desplegableB);
		
		JLabel label = new JLabel("Esto es un bot\u00F3n de prueba");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(493, 449, 217, 31);
		frame.getContentPane().add(label);
		
		JTextArea cuerpoB = new JTextArea();
		cuerpoB.setBounds(493, 269, 217, 169);
		frame.getContentPane().add(cuerpoB);
		
		JTextArea receptorB = new JTextArea();
		receptorB.setBounds(493, 46, 217, 169);
		frame.getContentPane().add(receptorB);
		
		JLabel label_1 = new JLabel("Esto es un bot\u00F3n de prueba");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(71, 460, 217, 31);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Mensaje");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(565, 237, 67, 31);
		frame.getContentPane().add(label_2);
		
		JLabel lblReceptora = new JLabel("Receptor 'A'");
		lblReceptora.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblReceptora.setBounds(129, 11, 99, 31);
		frame.getContentPane().add(lblReceptora);
		
		JLabel lblReceptorb = new JLabel("Receptor 'B'");
		lblReceptorb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblReceptorb.setBounds(555, 11, 99, 31);
		frame.getContentPane().add(lblReceptorb);
	}
}
