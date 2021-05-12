import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Galerija extends JFrame {

	private JPanel contentPane;
	private JTextField txtManikirIPedikir;
	private JTextField txtPedikir;
	private JTextField txtKosa;
	private JTextField txtminka;
	private JTextField txtKosa_1;
	private JTextField txtAntiaging;
	private JTextField txtMicroblindingObrva;
	private JTextField txtNadgradnjaTrepavica;
	private JTextField txtSalon;
	private JLabel lblSlika6;
	private JLabel lblSlika10;
	private JLabel lblSlika11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Galerija frame = new Galerija();
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
	public Galerija() {
		setTitle("Galerija");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Galerija.class.getResource("/gallery.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSlika2 = new JLabel("New label");
		lblSlika2.setIcon(new ImageIcon(Galerija.class.getResource("/frensh.png")));
		lblSlika2.setBounds(10, 46, 72, 70);
		contentPane.add(lblSlika2);
		
		txtManikirIPedikir = new JTextField();
		txtManikirIPedikir.setEditable(false);
		txtManikirIPedikir.setHorizontalAlignment(SwingConstants.CENTER);
		txtManikirIPedikir.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtManikirIPedikir.setBackground(new Color(253, 245, 230));
		txtManikirIPedikir.setText("Manikir");
		txtManikirIPedikir.setBounds(36, 15, 86, 20);
		contentPane.add(txtManikirIPedikir);
		txtManikirIPedikir.setColumns(10);
		
		JLabel lblSlika1 = new JLabel("New label");
		lblSlika1.setIcon(new ImageIcon(Galerija.class.getResource("/manikir.png")));
		lblSlika1.setBounds(81, 40, 77, 82);
		contentPane.add(lblSlika1);
		
		txtPedikir = new JTextField();
		txtPedikir.setEditable(false);
		txtPedikir.setBackground(new Color(253, 245, 230));
		txtPedikir.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtPedikir.setHorizontalAlignment(SwingConstants.CENTER);
		txtPedikir.setText("Pedikir");
		txtPedikir.setBounds(211, 15, 86, 20);
		contentPane.add(txtPedikir);
		txtPedikir.setColumns(10);
		
		JLabel lblSlika3 = new JLabel("New label");
		lblSlika3.setIcon(new ImageIcon(Galerija.class.getResource("/pedikir.png")));
		lblSlika3.setBounds(189, 43, 66, 76);
		contentPane.add(lblSlika3);
		
		JLabel lblSlika4 = new JLabel("New label");
		lblSlika4.setIcon(new ImageIcon(Galerija.class.getResource("/pedicuree.png")));
		lblSlika4.setBounds(258, 46, 57, 70);
		contentPane.add(lblSlika4);
		
		txtKosa = new JTextField();
		txtKosa.setEditable(false);
		txtKosa.setBackground(new Color(253, 245, 230));
		txtKosa.setHorizontalAlignment(SwingConstants.CENTER);
		txtKosa.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtKosa.setText("Masa\u017Ea");
		txtKosa.setBounds(377, 15, 86, 20);
		contentPane.add(txtKosa);
		txtKosa.setColumns(10);
		
		JLabel lblSlika7 = new JLabel("New label");
		lblSlika7.setIcon(new ImageIcon(Galerija.class.getResource("/prosminka.png")));
		lblSlika7.setBounds(10, 186, 66, 82);
		contentPane.add(lblSlika7);
		
		JLabel lblSlika8 = new JLabel("New label");
		lblSlika8.setIcon(new ImageIcon(Galerija.class.getResource("/sminka.png")));
		lblSlika8.setBounds(73, 190, 72, 75);
		contentPane.add(lblSlika8);
		
		txtminka = new JTextField();
		txtminka.setEditable(false);
		txtminka.setBackground(new Color(253, 245, 230));
		txtminka.setHorizontalAlignment(SwingConstants.CENTER);
		txtminka.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtminka.setText("\u0160minka");
		txtminka.setBounds(36, 155, 86, 20);
		contentPane.add(txtminka);
		txtminka.setColumns(10);
		
		JLabel lblSlika9 = new JLabel("New label");
		lblSlika9.setIcon(new ImageIcon(Galerija.class.getResource("/hairstyle.png")));
		lblSlika9.setBounds(197, 189, 100, 50);
		contentPane.add(lblSlika9);
		
		JLabel lblSlika = new JLabel("New label");
		lblSlika.setIcon(new ImageIcon(Galerija.class.getResource("/hairSt.png")));
		lblSlika.setBounds(207, 239, 92, 42);
		contentPane.add(lblSlika);
		
		txtKosa_1 = new JTextField();
		txtKosa_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtKosa_1.setBackground(new Color(253, 245, 230));
		txtKosa_1.setEditable(false);
		txtKosa_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtKosa_1.setText("Kosa");
		txtKosa_1.setBounds(211, 155, 86, 20);
		contentPane.add(txtKosa_1);
		txtKosa_1.setColumns(10);
		
		txtAntiaging = new JTextField();
		txtAntiaging.setHorizontalAlignment(SwingConstants.CENTER);
		txtAntiaging.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtAntiaging.setBackground(new Color(253, 245, 230));
		txtAntiaging.setEditable(false);
		txtAntiaging.setText("Anti-aging");
		txtAntiaging.setBounds(364, 155, 86, 20);
		contentPane.add(txtAntiaging);
		txtAntiaging.setColumns(10);
		
		txtMicroblindingObrva = new JTextField();
		txtMicroblindingObrva.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtMicroblindingObrva.setBackground(new Color(253, 245, 230));
		txtMicroblindingObrva.setEditable(false);
		txtMicroblindingObrva.setText("Microblading obrva");
		txtMicroblindingObrva.setBounds(23, 299, 109, 20);
		contentPane.add(txtMicroblindingObrva);
		txtMicroblindingObrva.setColumns(10);
		
		txtNadgradnjaTrepavica = new JTextField();
		txtNadgradnjaTrepavica.setBackground(new Color(253, 245, 230));
		txtNadgradnjaTrepavica.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtNadgradnjaTrepavica.setText("Nadgradnja trepavica");
		txtNadgradnjaTrepavica.setEditable(false);
		txtNadgradnjaTrepavica.setBounds(197, 299, 129, 20);
		contentPane.add(txtNadgradnjaTrepavica);
		txtNadgradnjaTrepavica.setColumns(10);
		
		txtSalon = new JTextField();
		txtSalon.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalon.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtSalon.setEditable(false);
		txtSalon.setText("Salon");
		txtSalon.setBackground(new Color(253, 245, 230));
		txtSalon.setBounds(377, 299, 86, 20);
		contentPane.add(txtSalon);
		txtSalon.setColumns(10);
		
		JLabel lblSlika5 = new JLabel("New label");
		lblSlika5.setIcon(new ImageIcon(Galerija.class.getResource("/masaza.png")));
		lblSlika5.setBounds(354, 46, 66, 70);
		contentPane.add(lblSlika5);
		
		lblSlika6 = new JLabel("New label");
		lblSlika6.setIcon(new ImageIcon(Galerija.class.getResource("/masaza123.png")));
		lblSlika6.setBounds(422, 53, 86, 56);
		contentPane.add(lblSlika6);
		
		lblSlika10 = new JLabel("New label");
		lblSlika10.setIcon(new ImageIcon(Galerija.class.getResource("/anti.png")));
		lblSlika10.setBounds(339, 190, 57, 64);
		contentPane.add(lblSlika10);
		
		lblSlika11 = new JLabel("New label");
		lblSlika11.setIcon(new ImageIcon(Galerija.class.getResource("/antiA.png")));
		lblSlika11.setBounds(396, 200, 92, 50);
		contentPane.add(lblSlika11);
		
		JLabel lblSlika14 = new JLabel("New label");
		lblSlika14.setIcon(new ImageIcon(Galerija.class.getResource("/trepavice.png")));
		lblSlika14.setBounds(221, 342, 94, 51);
		contentPane.add(lblSlika14);
		
		JLabel lblSlika15 = new JLabel("New label");
		lblSlika15.setIcon(new ImageIcon(Galerija.class.getResource("/trepavicepreikasnije.png")));
		lblSlika15.setBounds(231, 404, 86, 54);
		contentPane.add(lblSlika15);
		
		JLabel lblSlika12 = new JLabel("New label");
		lblSlika12.setIcon(new ImageIcon(Galerija.class.getResource("/obrve.png")));
		lblSlika12.setBounds(23, 342, 66, 77);
		contentPane.add(lblSlika12);
		
		JLabel lblSlika13 = new JLabel("New label");
		lblSlika13.setIcon(new ImageIcon(Galerija.class.getResource("/microblading.png")));
		lblSlika13.setBounds(99, 342, 77, 64);
		contentPane.add(lblSlika13);
		
		JLabel lblSlika16 = new JLabel("New label");
		lblSlika16.setIcon(new ImageIcon(Galerija.class.getResource("/bsalon.png")));
		lblSlika16.setBounds(339, 342, 66, 77);
		contentPane.add(lblSlika16);
		
		JLabel lblSlika17 = new JLabel("New label");
		lblSlika17.setIcon(new ImageIcon(Galerija.class.getResource("/saloonn.png")));
		lblSlika17.setBounds(422, 348, 66, 64);
		contentPane.add(lblSlika17);
	}
}
