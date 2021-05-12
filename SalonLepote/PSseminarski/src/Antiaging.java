import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Antiaging extends JFrame {

	private JPanel contentPane;
	private JTextField txtAntiaging;
	private JLabel lblSlika2;
	private JTextField txttaJeHijaluron;
	private JTextField txtdMezoniti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Antiaging frame = new Antiaging();
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
	public Antiaging() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Antiaging.class.getResource("/botox.png")));
		setTitle("Anti-aging");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 519, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAntiaging = new JTextField();
		txtAntiaging.setHorizontalAlignment(SwingConstants.CENTER);
		txtAntiaging.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtAntiaging.setBackground(new Color(253, 245, 230));
		txtAntiaging.setEditable(false);
		txtAntiaging.setText("Anti-aging");
		txtAntiaging.setBounds(210, 11, 138, 39);
		contentPane.add(txtAntiaging);
		txtAntiaging.setColumns(10);
		
		JLabel lblSlika1 = new JLabel("");
		lblSlika1.setIcon(new ImageIcon(Antiaging.class.getResource("/antiA.png")));
		lblSlika1.setBounds(10, 89, 87, 65);
		contentPane.add(lblSlika1);
		
		lblSlika2 = new JLabel("");
		lblSlika2.setIcon(new ImageIcon(Antiaging.class.getResource("/anti.png")));
		lblSlika2.setBounds(22, 24, 54, 54);
		contentPane.add(lblSlika2);
		
		JTextPane txtpnIakoProcesStarenje = new JTextPane();
		txtpnIakoProcesStarenje.setBackground(new Color(253, 245, 230));
		txtpnIakoProcesStarenje.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnIakoProcesStarenje.setText("Iako proces starenja ne mo\u017Eemo zaustaviti , uz pomo\u0107 antiaging programa mo\u017Eemo na  razli\u010Dite na\u010Dine uticati na vidljivost znakova starenja kao \u0161to su bore, kvalitet ko\u017Ee i celukupan izgled lica i tela. Na\u0161 salon vam u ovome mo\u017Eepomo\u0107i kroz razli\u010Dite metode podmla\u0111ivanja.Savremena kozmetologija nudi bogat spektar mogu\u0107nosti i tretmana za podmla\u0111ivanje lica i tela. A na\u0161 salon prati sve savremene svetske trendove iz oblasti anti aging-a.");
		txtpnIakoProcesStarenje.setEditable(false);
		txtpnIakoProcesStarenje.setBounds(96, 57, 397, 108);
		contentPane.add(txtpnIakoProcesStarenje);
		
		txttaJeHijaluron = new JTextField();
		txttaJeHijaluron.setHorizontalAlignment(SwingConstants.CENTER);
		txttaJeHijaluron.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txttaJeHijaluron.setBackground(new Color(253, 245, 230));
		txttaJeHijaluron.setEditable(false);
		txttaJeHijaluron.setText("\u0160ta je hijaluron, a \u0161ta botox?");
		txttaJeHijaluron.setBounds(10, 165, 483, 20);
		contentPane.add(txttaJeHijaluron);
		txttaJeHijaluron.setColumns(10);
		
		JTextPane txtpnTretmanHijaluronskimFilerima = new JTextPane();
		txtpnTretmanHijaluronskimFilerima.setText("Tretman hijaluronskim filerima nadokna\u0111uje nedostatak elasti\u010Dnosti ko\u017Ee i vra\u0107a ko\u017Ei mladala\u010Dki izgled, te spre\u010Dava vidljivost znakova starenja. Ono \u0161to tretmanu hijalauronskim filerima daje na popularnosti jeste brzina zahvata, bezbednost i odmah vidljivi rezultati. Botoks sa druge strane predstavlja supstancu koja se, sli\u010Dno hijalauronu, ubrizgava pod ko\u017Eu ali ima dugotrajnije rezultate. Botoks deluje tako \u0161to spre\u010Dava preterane kontrakcije mi\u0161i\u0107a, i tako spre\u010Dava pojavu bora. Ovaj tretman traje oko 15-20 minuta, te je vrlo brz, jednostavan, bezbedan, bezbolan i \u0161to je najbitnije \u2013 vrlo efektan.");
		txtpnTretmanHijaluronskimFilerima.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnTretmanHijaluronskimFilerima.setBackground(new Color(253, 245, 230));
		txtpnTretmanHijaluronskimFilerima.setEditable(false);
		txtpnTretmanHijaluronskimFilerima.setBounds(10, 188, 483, 120);
		contentPane.add(txtpnTretmanHijaluronskimFilerima);
		
		txtdMezoniti = new JTextField();
		txtdMezoniti.setText("Mezoterapija");
		txtdMezoniti.setHorizontalAlignment(SwingConstants.CENTER);
		txtdMezoniti.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtdMezoniti.setBackground(new Color(253, 245, 230));
		txtdMezoniti.setEditable(false);
		txtdMezoniti.setBounds(10, 315, 483, 20);
		contentPane.add(txtdMezoniti);
		txtdMezoniti.setColumns(10);
		
		JTextPane txtpnMezoterapijaJeTretman = new JTextPane();
		txtpnMezoterapijaJeTretman.setText("Mezoterapija je tretman kojim se uz pomo\u0107 tankih iglica u srednji sloj ko\u017Ee i potko\u017Eno tkivo ubrizgava mala doza aktivnih koktela od prirodnih ekstrakata, kompleksa vitamina, amino kiselina.. itd.Mezoterapija ima \u0161iroku primenu: prevenciji i ubla\u017Eavanju bora; stimulaciju rasta kose; re\u0161avanje problema tamnih kolutova ispod o\u010Diju, protiv celulita, u borbi sa aknama, ali ipak naj\u010De\u0161\u0107e se koristi kao mo\u0107no anti \u2013 aging sredstvo za ko\u017Eu.");
		txtpnMezoterapijaJeTretman.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnMezoterapijaJeTretman.setBackground(new Color(253, 245, 230));
		txtpnMezoterapijaJeTretman.setEditable(false);
		txtpnMezoterapijaJeTretman.setBounds(10, 340, 483, 73);
		contentPane.add(txtpnMezoterapijaJeTretman);
		
		JButton btnKontakt = new JButton("Kontakt");
		btnKontakt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnKontakt.setIcon(new ImageIcon(Antiaging.class.getResource("/contact.png")));
		btnKontakt.setBackground(new Color(253, 245, 230));
		btnKontakt.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnKontakt.setBounds(360, 415, 122, 34);
		contentPane.add(btnKontakt);
	}
}
