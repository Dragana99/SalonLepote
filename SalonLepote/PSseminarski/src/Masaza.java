import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Masaza extends JFrame {

	private JPanel contentPane;
	private JTextField txtVrsteMasaa;
	private JTextField txtRelaksMasaa;
	private JTextField txtSportskaMasaa;
	private JTextField txtLimfnaDrenaa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Masaza frame = new Masaza();
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
	public Masaza() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Masaza.class.getResource("/massage.png")));
		setTitle("Masa\u017Ea");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 512, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtVrsteMasaa = new JTextField();
		txtVrsteMasaa.setHorizontalAlignment(SwingConstants.CENTER);
		txtVrsteMasaa.setText("Vrste masa\u017Ea:");
		txtVrsteMasaa.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtVrsteMasaa.setBackground(new Color(253, 245, 230));
		txtVrsteMasaa.setEditable(false);
		txtVrsteMasaa.setBounds(161, 11, 172, 27);
		contentPane.add(txtVrsteMasaa);
		txtVrsteMasaa.setColumns(10);
		
		JLabel lblSlika = new JLabel("New label");
		lblSlika.setIcon(new ImageIcon(Masaza.class.getResource("/masaza123.png")));
		lblSlika.setBounds(387, -1, 84, 53);
		contentPane.add(lblSlika);
		
		JTextPane txtpnKaotoI = new JTextPane();
		txtpnKaotoI.setText("Kao \u0161to i samo ime ka\u017Ee, relax masaza je uglavnom masa\u017Ea celog tela u svrhu opu\u0161tanja.Postoji relax masaza celog tela koja traje oko dva sata, pri \u010Demu se tretira telo od no\u017Enih prstiju do temena glave. Relax masaza mo\u017Ee da bude i parcijalna, kada se tretiraju pojedini delovi tela poput stopala, nogu, ruku, le\u0111a, vrata i lica, itd. Relax masaza izazva pozitivno raspolo\u017Eenje, smirenost i opu\u0161tenost misli i tela.");
		txtpnKaotoI.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnKaotoI.setBackground(new Color(253, 245, 230));
		txtpnKaotoI.setEditable(false);
		txtpnKaotoI.setBounds(10, 49, 476, 91);
		contentPane.add(txtpnKaotoI);
		
		JTextPane txtpnSportskaMasaaJe = new JTextPane();
		txtpnSportskaMasaaJe.setText("Sportska masa\u017Ea je takav tip masa\u017Ee gde terapeut koristi specijalne zahvate radi postizanja br\u017Ee i potpune pripreme sportista za intenzivne treninge pove\u0107anje stepena aktivnosti tokom treninga, pa i radi pove\u0107anja izdr\u017Eljivosti i mo\u0107i sportista. Uz pomo\u0107 sportske masa\u017Ee mogu se eliminisati nepo\u017Eeljne i \u0161tetne posledice usled poja\u010Dane fizi\u010Dke aktivnosti, kao \u0161to su umor i upala mi\u0161i\u0107a. Za oporavak sportistima ali i onima koji nisu sportisti na raspolaganju su i fizikalna terapija (ultrazvuk, interferna struja, tens terapija, magnetna terapija) ali i tretiranje kinezio trakama.");
		txtpnSportskaMasaaJe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnSportskaMasaaJe.setBackground(new Color(253, 245, 230));
		txtpnSportskaMasaaJe.setEditable(false);
		txtpnSportskaMasaaJe.setBounds(10, 165, 476, 112);
		contentPane.add(txtpnSportskaMasaaJe);
		
		JTextPane txtpnMasaaSaLimfnom = new JTextPane();
		txtpnMasaaSaLimfnom.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnMasaaSaLimfnom.setBackground(new Color(253, 245, 230));
		txtpnMasaaSaLimfnom.setEditable(false);
		txtpnMasaaSaLimfnom.setText("Masa\u017Ea sa limfnom drena\u017Eom podrazumeva specifi\u010Dne pokrete ruku koji se ravnomerno i ritmi\u010Dno ponavljaju i kombinuju ja\u010Di i slabiji pritisak, \u010Dime se pove\u0107ava proto\u010Dnost limfnih sudova. Masaza celog tela sa limfnom drena\u017Eom, pozitivno uti\u010De na smanjenje umora i otoka, detoksikaciju organizma, regeneraciju tkiva i ko\u017Ee nakon poro\u0111aja, opekotina i o\u017Eiljaka, smanjenje celulita i bora, stimuli\u0161e imuni sistem, deluje relaksiraju\u0107e i time podsti\u010De i osloba\u0111anje od stresa, pozitivno uti\u010De na probleme kao \u0161to su sportske povrede, glavobolje, pro\u0161irene vene, akne, itd.");
		txtpnMasaaSaLimfnom.setBounds(10, 313, 476, 120);
		contentPane.add(txtpnMasaaSaLimfnom);
		
		JButton btnKontakt = new JButton("Kontakt");
		btnKontakt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnKontakt.setBackground(new Color(253, 245, 230));
		btnKontakt.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnKontakt.setIcon(new ImageIcon(Masaza.class.getResource("/contact.png")));
		btnKontakt.setBounds(329, 438, 142, 33);
		contentPane.add(btnKontakt);
		
		txtRelaksMasaa = new JTextField();
		txtRelaksMasaa.setHorizontalAlignment(SwingConstants.CENTER);
		txtRelaksMasaa.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtRelaksMasaa.setBackground(new Color(253, 245, 230));
		txtRelaksMasaa.setEditable(false);
		txtRelaksMasaa.setText("Relaks masa\u017Ea");
		txtRelaksMasaa.setBounds(10, 27, 117, 20);
		contentPane.add(txtRelaksMasaa);
		txtRelaksMasaa.setColumns(10);
		
		txtSportskaMasaa = new JTextField();
		txtSportskaMasaa.setText("Sportska masa\u017Ea");
		txtSportskaMasaa.setHorizontalAlignment(SwingConstants.CENTER);
		txtSportskaMasaa.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtSportskaMasaa.setBackground(new Color(253, 245, 230));
		txtSportskaMasaa.setEditable(false);
		txtSportskaMasaa.setBounds(20, 145, 451, 20);
		contentPane.add(txtSportskaMasaa);
		txtSportskaMasaa.setColumns(10);
		
		txtLimfnaDrenaa = new JTextField();
		txtLimfnaDrenaa.setHorizontalAlignment(SwingConstants.CENTER);
		txtLimfnaDrenaa.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtLimfnaDrenaa.setBackground(new Color(253, 245, 230));
		txtLimfnaDrenaa.setEditable(false);
		txtLimfnaDrenaa.setText("Limfna drena\u017Ea");
		txtLimfnaDrenaa.setBounds(20, 288, 451, 20);
		contentPane.add(txtLimfnaDrenaa);
		txtLimfnaDrenaa.setColumns(10);
	}
}
