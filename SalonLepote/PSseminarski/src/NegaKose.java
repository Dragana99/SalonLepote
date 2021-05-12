import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NegaKose extends JFrame {

	private JPanel contentPane;
	private JTextField txtZbogegaJe;
	private JTextField txtRetkaKosaKoja;
	private JTextPane txtpnUkolikoImateTanku;
	private JLabel lblSlika2;
	private JTextField txtKose;
	private JTextPane txtpnUkolikoVamJe;
	private JLabel lblSlika3;
	private JTextField txtOlaplexTretman;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NegaKose frame = new NegaKose();
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
	public NegaKose() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NegaKose.class.getResource("/woman.png")));
		setTitle("Nega kose");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnakIJaka = new JTextPane();
		txtpnakIJaka.setEditable(false);
		txtpnakIJaka.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		txtpnakIJaka.setBackground(new Color(253, 245, 230));
		txtpnakIJaka.setText("\u010Cak jaka i zdrava kosa zahteva pa\u017Enju i negu, jer u suprotnom mo\u017Ee da izgubi sjaj i svoju lepotu. Za sve one koji nisu zadovoljni kosom tu je na\u0161 frizerski salon i njegove raznovrsne usluge koje \u0107e ispraviti ovu nepravdu. ");
		txtpnakIJaka.setBounds(10, 69, 552, 65);
		contentPane.add(txtpnakIJaka);
		
		txtZbogegaJe = new JTextField();
		txtZbogegaJe.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtZbogegaJe.setText("Zbog \u010Dega je va\u017Ena nega kose?");
		txtZbogegaJe.setBackground(new Color(253, 245, 230));
		txtZbogegaJe.setEditable(false);
		txtZbogegaJe.setBounds(125, 24, 232, 27);
		contentPane.add(txtZbogegaJe);
		txtZbogegaJe.setColumns(10);
		
		JLabel lblSlika1 = new JLabel("");
		lblSlika1.setIcon(new ImageIcon(NegaKose.class.getResource("/volumenKose.png")));
		lblSlika1.setBounds(381, 13, 75, 65);
		contentPane.add(lblSlika1);
		
		txtRetkaKosaKoja = new JTextField();
		txtRetkaKosaKoja.setHorizontalAlignment(SwingConstants.CENTER);
		txtRetkaKosaKoja.setBackground(new Color(253, 245, 230));
		txtRetkaKosaKoja.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtRetkaKosaKoja.setEditable(false);
		txtRetkaKosaKoja.setText("*** Retka kosa koja sporo raste? ***");
		txtRetkaKosaKoja.setBounds(10, 126, 552, 27);
		contentPane.add(txtRetkaKosaKoja);
		txtRetkaKosaKoja.setColumns(10);
		
		txtpnUkolikoImateTanku = new JTextPane();
		txtpnUkolikoImateTanku.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnUkolikoImateTanku.setBackground(new Color(253, 245, 230));
		txtpnUkolikoImateTanku.setEditable(false);
		txtpnUkolikoImateTanku.setText("Ukoliko imate tanku kosu ili kosu koja nikako da poraste do \u017Eeljene du\u017Eine re\u0161enje za vas je nadogradnja kose. Nadogradnja kose je jedna od na\u0161ih usluga po kojoj smo prepoznatljivi. Na\u0161e nadogradnje se rade sa prirodnom kosom, metodom \u010Dvorovanja kojom se \u010Duva va\u0161a prirodna kosa. Kada je u pitanju nadogradnja kose, cena zavisi od vi\u0161e faktora. Prvi od njih je tehnika koja se primenjuje, zatim na cenu uti\u010De gustina pramenova, a kada se pominje nadogradnja kose \u2013 cena zavisi i od kvaliteta kose za nadogradnju.");
		txtpnUkolikoImateTanku.setBounds(10, 152, 552, 91);
		contentPane.add(txtpnUkolikoImateTanku);
		
		lblSlika2 = new JLabel("");
		lblSlika2.setIcon(new ImageIcon(NegaKose.class.getResource("/nadogradnja.png")));
		lblSlika2.setBounds(15, 20, 75, 51);
		contentPane.add(lblSlika2);
		
		txtKose = new JTextField();
		txtKose.setHorizontalAlignment(SwingConstants.CENTER);
		txtKose.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtKose.setBackground(new Color(253, 245, 230));
		txtKose.setEditable(false);
		txtKose.setText("*** Botox kose ***");
		txtKose.setBounds(10, 242, 552, 27);
		contentPane.add(txtKose);
		txtKose.setColumns(10);
		
		txtpnUkolikoVamJe = new JTextPane();
		txtpnUkolikoVamJe.setEditable(false);
		txtpnUkolikoVamJe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnUkolikoVamJe.setBackground(new Color(253, 245, 230));
		txtpnUkolikoVamJe.setText("Ukoliko vam je kosa suva ili be\u017Eivotna i treba joj ja\u010Da nega i oporavak re\u0161enje je botox kose. Botoks kose je savr\u0161en i brz tretman za jako o\u0161te\u0107enu kosu, jer je postupak nalik upotrebi razli\u010Ditih maski ili balzama za kosu. Botoks duboko prodire u dlaku, \u010Dime je \u010Dini ravnijom, sjajnijom i punijom, spre\u010Davaju\u0107i njeno kidanje, a rezultati su vidljivi ve\u0107 nakon prvog tretmana. U kosi ostaje 2-3 pranja, a zatim je potrebno ponavljanje tretmana.");
		txtpnUkolikoVamJe.setBounds(10, 272, 552, 79);
		contentPane.add(txtpnUkolikoVamJe);
		
		lblSlika3 = new JLabel("");
		lblSlika3.setIcon(new ImageIcon(NegaKose.class.getResource("/botoxkose.png")));
		lblSlika3.setBounds(476, 13, 75, 51);
		contentPane.add(lblSlika3);
		
		txtOlaplexTretman = new JTextField();
		txtOlaplexTretman.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtOlaplexTretman.setBackground(new Color(253, 245, 230));
		txtOlaplexTretman.setText("*** Olaplex tretman \u2013 spre\u010Dite o\u0161te\u0107enja prilikom farbanja ***");
		txtOlaplexTretman.setHorizontalAlignment(SwingConstants.CENTER);
		txtOlaplexTretman.setEditable(false);
		txtOlaplexTretman.setBounds(10, 349, 552, 27);
		contentPane.add(txtOlaplexTretman);
		txtOlaplexTretman.setColumns(10);
		
		JTextPane txtpnOlaplexJeInovativni = new JTextPane();
		txtpnOlaplexJeInovativni.setEditable(false);
		txtpnOlaplexJeInovativni.setBackground(new Color(253, 245, 230));
		txtpnOlaplexJeInovativni.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnOlaplexJeInovativni.setText("Olaplex je inovativni hemijski preparat kojim posti\u017Eete obnavljanje i regeneraciju o\u0161te\u0107ene, ispucale kose prilikom kolorizacije, uz dugotrajni efekat. Uz to, olaplex tretman \u0107e va\u0161u kosu u\u010Diniti sna\u017Enijom, sjajnijom i sa volumenom ve\u0107im nego ikad pre! Blajhanje ili izvla\u010Denje pramenova vi\u0161e ne\u0107e biti pogubno za va\u0161u kosu, jer uz olaplex tretman mo\u017Eete imati i svr\u0161enu boju i zdravu i sjajnu kosu.");
		txtpnOlaplexJeInovativni.setBounds(10, 379, 552, 67);
		contentPane.add(txtpnOlaplexJeInovativni);
		
		JButton btnKontakt = new JButton("Kontakt");
		btnKontakt.setIcon(new ImageIcon(NegaKose.class.getResource("/contact.png")));
		btnKontakt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		
		});
		btnKontakt.setFont(new Font("Monotype Corsiva", Font.BOLD, 14));
		btnKontakt.setBackground(new Color(253, 245, 230));
		btnKontakt.setBounds(413, 448, 138, 33);
		contentPane.add(btnKontakt);
	}
}
