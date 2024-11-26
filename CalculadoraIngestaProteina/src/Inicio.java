import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Inicio {

	private JFrame frame;
	private JComboBox comboObjetivo;
	private Final segundoFrame = new Final();
	private JCheckBox chckbxHombre;
    private JCheckBox chckbxMujer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
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
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	float peso;
	float proteina;
	String Objetivo;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("TU INGESTA DE PROTEÍNA");
		lblTitulo.setForeground(new Color(255, 0, 0));
		lblTitulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 38));
		lblTitulo.setBounds(42, -23, 455, 124);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblIntro = new JLabel("INTRODUCE TU PESO");
		lblIntro.setForeground(new Color(0, 128, 255));
		lblIntro.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblIntro.setBounds(146, 172, 312, 23);
		frame.getContentPane().add(lblIntro);
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(198, 206, 91, 37);
		frame.getContentPane().add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setEnabled(false);
		btnCalcular.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
				Objetivo=comboObjetivo.getSelectedItem().toString();
				peso=Float.parseFloat(textFieldPeso.getText());
				if (Objetivo.equals("Salud")) {
					proteina=(float) (peso*0.8);
				} else if (Objetivo.equals("Masa muscular")) {
					proteina=(float) (peso*1.6);
				} else if (Objetivo.equals("Fuerza")) {
					proteina=(float) (peso*2.2);
				}
				int proteinaRedondeada = Math.round(proteina);
				segundoFrame.actualizarLblCantidad(proteinaRedondeada);
			}
		});
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cambiarventana) {
				Final frame2 = new Final();
				frame2.setVisible(true);
				frame.dispose();
			}
		});
		btnCalcular.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 26));
		btnCalcular.setBounds(177, 476, 135, 49);
		frame.getContentPane().add(btnCalcular);
		
		chckbxHombre = new JCheckBox("Hombre");
		chckbxHombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular.setEnabled(chckbxHombre.isSelected());
			}
		});
		chckbxHombre.setForeground(new Color(255, 0, 0));
		chckbxHombre.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		chckbxHombre.setBounds(198, 264, 97, 23);
		frame.getContentPane().add(chckbxHombre);
		
		chckbxMujer = new JCheckBox("Mujer");
		chckbxMujer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular.setEnabled(chckbxMujer.isSelected());
			}
		});
		chckbxMujer.setForeground(new Color(0, 128, 255));
		chckbxMujer.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		chckbxMujer.setBounds(198, 301, 97, 23);
		frame.getContentPane().add(chckbxMujer);
		
		ButtonGroup hombremujer = new ButtonGroup();
		hombremujer.add(chckbxHombre);
		hombremujer.add(chckbxMujer);
        
		JLabel lblNewLabel = new JLabel("DIARIA");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		lblNewLabel.setBounds(160, 57, 181, 79);
		frame.getContentPane().add(lblNewLabel);
		
		comboObjetivo = new JComboBox();
		comboObjetivo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String Objetivo=comboObjetivo.getSelectedItem().toString();
			}
		});
		comboObjetivo.setModel(new DefaultComboBoxModel(new String[] {"Salud", "Masa muscular", "Fuerza"}));
		comboObjetivo.setToolTipText("");
		comboObjetivo.setBounds(198, 398, 97, 37);
		frame.getContentPane().add(comboObjetivo);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Gener\\Downloads\\Captura de pantalla (285).png"));
		lblFondo.setBounds(-758, -326, 1520, 1163);
		frame.getContentPane().add(lblFondo);
	}
}
