import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.BevelBorder;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Final extends JFrame {

	private JPanel contentPane;
	private static JLabel lblCantidad;
	private static JLabel lblGracias;
	private JRadioButton rdbtnSi;
    private JRadioButton rdbtnNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final frame = new Final();
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
	public Final() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngesta = new JLabel("TU INGESTA DE PROTEÍNA DIARIA RECOMENDADA ES:");
		lblIngesta.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 23));
		lblIngesta.setForeground(new Color(255, 0, 0));
		lblIngesta.setBounds(22, 41, 447, 60);
		contentPane.add(lblIngesta);
		
		lblCantidad = new JLabel("0");
		lblCantidad.setForeground(new Color(0, 128, 255));
		lblCantidad.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		lblCantidad.setBounds(153, 83, 184, 78);
		contentPane.add(lblCantidad);
		
		JLabel lblGramos = new JLabel("GRAMOS");
		lblGramos.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
		lblGramos.setForeground(new Color(0, 128, 255));
		lblGramos.setBounds(235, 112, 126, 34);
		contentPane.add(lblGramos);
		
		JLabel lblUtil = new JLabel("¿TE HA SIDO ÚTIL?");
		lblUtil.setBorder(null);
		lblUtil.setForeground(new Color(255, 0, 0));
		lblUtil.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		lblUtil.setBounds(27, 236, 172, 23);
		contentPane.add(lblUtil);
		
		JLabel lblSatisf = new JLabel("¡DÉJANOS SABER TU NIVEL DE SATISFACCIÓN!");
		lblSatisf.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblSatisf.setForeground(new Color(0, 128, 255));
		lblSatisf.setBounds(27, 363, 415, 34);
		contentPane.add(lblSatisf);
		
		rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setBorderPainted(true);
		rdbtnSi.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(0, 128, 255), new Color(0, 128, 255)));
		rdbtnSi.setForeground(new Color(0, 128, 255));
		rdbtnSi.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		rdbtnSi.setBounds(27, 276, 109, 23);
		contentPane.add(rdbtnSi);
		
		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBorderPainted(true);
		rdbtnNo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 255), new Color(0, 128, 255), new Color(255, 0, 0), new Color(255, 0, 0)));
		rdbtnNo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		rdbtnNo.setForeground(new Color(255, 0, 0));
		rdbtnNo.setBounds(27, 310, 109, 23);
		contentPane.add(rdbtnNo);
		
		ButtonGroup siono = new ButtonGroup();
		siono.add(rdbtnSi);
		siono.add(rdbtnNo);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 10, 1);

        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				lblGracias.setText("¡GRACIAS!");
			}
        });
		slider.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 255), new Color(0, 128, 255), new Color(255, 0, 0), new Color(255, 0, 0)));
		slider.setBounds(27, 416, 310, 43);
		contentPane.add(slider);
		
		JLabel lblAzul = new JLabel("");
		lblAzul.setIcon(new ImageIcon("C:\\Users\\Gener\\Downloads\\a4751c224f785d8d708bf4f8f2405c7e.jpg"));
		lblAzul.setBounds(18, 53, 838, 34);
		contentPane.add(lblAzul);
		
		JLabel lblAzul2 = new JLabel("New label");
		lblAzul2.setIcon(new ImageIcon("C:\\Users\\Gener\\Downloads\\a4751c224f785d8d708bf4f8f2405c7e.jpg"));
		lblAzul2.setBounds(205, 53, 256, 34);
		contentPane.add(lblAzul2);
		
		JLabel lblRojo = new JLabel("");
		lblRojo.setIcon(new ImageIcon("C:\\Users\\Gener\\Downloads\\pngtree-red-simple-solid-color-background-image_556966.jpg"));
		lblRojo.setBounds(22, 365, 328, 27);
		contentPane.add(lblRojo);
		
		JLabel lblAzul3 = new JLabel("");
		lblAzul3.setIcon(new ImageIcon("C:\\Users\\Gener\\Downloads\\a4751c224f785d8d708bf4f8f2405c7e.jpg"));
		lblAzul3.setBounds(22, 232, 172, 29);
		contentPane.add(lblAzul3);
		
		lblGracias = new JLabel("");
		lblGracias.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 28));
		lblGracias.setBounds(172, 470, 147, 42);
		contentPane.add(lblGracias);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon("C:\\Users\\Gener\\Downloads\\Captura de pantalla (285).png"));
		lblFondo2.setBounds(-1300, -558, 2053, 1258);
		contentPane.add(lblFondo2);
	}
	 public static void actualizarLblCantidad(int proteinaredondeada) {
	        lblCantidad.setText(""+proteinaredondeada);
	    }
}
