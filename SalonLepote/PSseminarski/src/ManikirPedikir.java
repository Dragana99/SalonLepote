import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManikirPedikir extends JFrame {

	private JPanel contentPane;
	private JTextField txtManikircenovnik;
	private JTextField txtPedikircenovnik;
	private JTextField txtZatoSmoMi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManikirPedikir frame = new ManikirPedikir();
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
	public ManikirPedikir() {
		setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(ManikirPedikir.class.getResource("/icons8-nails-16.png")));
		setTitle("Manikir i pedikir");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 485, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnMiSmoSavremeni = new JTextPane();
		txtpnMiSmoSavremeni.setEditable(false);
		txtpnMiSmoSavremeni.setBackground(new Color(253, 245, 230));
		txtpnMiSmoSavremeni.setText("Mi smo savremeni salon, koji prati sve svetske trendove lepote i nege. Na\u0161i kozmeti\u010Dari su obu\u010Deni za sve svremene metode negovanja va\u0161ih ruku u stopala. Na\u0161 salon koristi trenutno najkvalitetnije i najtra\u017Eenije preparate za manikir i pedikir, me\u0111u kojima su svakako najpoznatijii OPI lakovi i OPI gel lakovi. Usluge manikira i pedikira koje pru\u017Eamo su na vrhunskom nivou.");
		txtpnMiSmoSavremeni.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtpnMiSmoSavremeni.setBounds(21, 42, 433, 98);
		contentPane.add(txtpnMiSmoSavremeni);
		
		txtManikircenovnik = new JTextField();
		txtManikircenovnik.setBackground(new Color(253, 245, 230));
		txtManikircenovnik.setText("Manikir-cenovnik");
		txtManikircenovnik.setEditable(false);
		txtManikircenovnik.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		txtManikircenovnik.setBounds(89, 164, 147, 20);
		contentPane.add(txtManikircenovnik);
		txtManikircenovnik.setColumns(10);
		
		JTextPane txtpnCrtanje = new JTextPane();
		txtpnCrtanje.setEditable(false);
		txtpnCrtanje.setBackground(new Color(253, 245, 230));
		txtpnCrtanje.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnCrtanje.setText("crtanje - 100 rsd\r\nkorekcija nokta - 200 rsd\r\nlakiranje opi lakovima - 600 rsd\r\nlakiranje gel lakovima - 1000 rsd\r\nmanikir - 1200 rsd\r\nkorekcija gela - 2600 rsd\r\nnadogradnja noktiju - 2700 rsd\r\nizlivanje noktiju - 2900 rsd\r\nspa manikir - 3700 rsd");
		txtpnCrtanje.setBounds(101, 195, 164, 185);
		contentPane.add(txtpnCrtanje);
		
		txtPedikircenovnik = new JTextField();
		txtPedikircenovnik.setEditable(false);
		txtPedikircenovnik.setText("Pedikir-cenovnik");
		txtPedikircenovnik.setBackground(new Color(253, 245, 230));
		txtPedikircenovnik.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		txtPedikircenovnik.setBounds(300, 164, 126, 20);
		contentPane.add(txtPedikircenovnik);
		txtPedikircenovnik.setColumns(10);
		
		JTextPane txtpnBrziPedikir = new JTextPane();
		txtpnBrziPedikir.setText("Brzi pedikir - 1000 rsd\r\nKlasi\u010Dan pedikir - 2000 rsd\r\nPedikir + opi - 2200 rsd\r\nPedikir + gel lak - 2300 rsd\r\nSpa pedikir - 3700 rsd");
		txtpnBrziPedikir.setBackground(new Color(253, 245, 230));
		txtpnBrziPedikir.setEditable(false);
		txtpnBrziPedikir.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnBrziPedikir.setBounds(300, 205, 147, 98);
		contentPane.add(txtpnBrziPedikir);
		
		JButton btnY = new JButton("Kontakt");
		btnY.setIcon(new ImageIcon(ManikirPedikir.class.getResource("/contact.png")));
		btnY.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnY.setForeground(new Color(0, 0, 0));
		btnY.setBackground(new Color(253, 245, 230));
		btnY.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnY.setBounds(315, 334, 132, 33);
		contentPane.add(btnY);
		
		JLabel lblSlika1 = new JLabel("");
		lblSlika1.setIcon(new ImageIcon(ManikirPedikir.class.getResource("/maniPedi.png")));
		lblSlika1.setBounds(21, 182, 46, 69);
		contentPane.add(lblSlika1);
		
		JLabel lblSlika2 = new JLabel("");
		lblSlika2.setIcon(new ImageIcon(ManikirPedikir.class.getResource("/manipadi.png")));
		lblSlika2.setBounds(10, 293, 57, 60);
		contentPane.add(lblSlika2);
		
		txtZatoSmoMi = new JTextField();
		txtZatoSmoMi.setBackground(new Color(253, 245, 230));
		txtZatoSmoMi.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		txtZatoSmoMi.setEditable(false);
		txtZatoSmoMi.setText("ZA\u0160TO SMO MI SALON ZA VA\u0160 NOVI MANIKIR I PEDIKIR?");
		txtZatoSmoMi.setBounds(10, 11, 437, 20);
		contentPane.add(txtZatoSmoMi);
		txtZatoSmoMi.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(192, 192, 192));
		separator.setBackground(new Color(192, 192, 192));
		separator.setBounds(10, 155, 444, -19);
		contentPane.add(separator);
	}
}
