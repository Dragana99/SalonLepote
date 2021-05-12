import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NadogradnjaTrepavica extends JFrame {

	private JPanel contentPane;
	private JTextField txtNadogradnjaTrepavica;
	private JTextField txttaJeNadogradnja;
	private JTextField txtARuskiVolumen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NadogradnjaTrepavica frame = new NadogradnjaTrepavica();
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
	public NadogradnjaTrepavica() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NadogradnjaTrepavica.class.getResource("/lash.png")));
		setTitle("Nadogradnja trepavica");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 515, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNadogradnjaTrepavica = new JTextField();
		txtNadogradnjaTrepavica.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtNadogradnjaTrepavica.setBackground(new Color(253, 245, 230));
		txtNadogradnjaTrepavica.setEditable(false);
		txtNadogradnjaTrepavica.setText("Nadogradnja trepavica");
		txtNadogradnjaTrepavica.setBounds(184, 11, 193, 33);
		contentPane.add(txtNadogradnjaTrepavica);
		txtNadogradnjaTrepavica.setColumns(10);
		
		JLabel lblSlika = new JLabel("");
		lblSlika.setIcon(new ImageIcon(NadogradnjaTrepavica.class.getResource("/trepavicepreikasnije.png")));
		lblSlika.setBounds(38, 29, 82, 67);
		contentPane.add(lblSlika);
		
		JTextPane txtpnAkoSanjateO = new JTextPane();
		txtpnAkoSanjateO.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtpnAkoSanjateO.setBackground(new Color(253, 245, 230));
		txtpnAkoSanjateO.setEditable(false);
		txtpnAkoSanjateO.setText("Ako sanjate o dugim, izvijenim, gustim i tamnim trepavicama kojih vas je majka priroda li\u0161ila - mi imamo re\u0161enje za vas, zove se nadogradnja svilenih trepavica.\r\n");
		txtpnAkoSanjateO.setBounds(130, 55, 340, 61);
		contentPane.add(txtpnAkoSanjateO);
		
		txttaJeNadogradnja = new JTextField();
		txttaJeNadogradnja.setText("\u0160ta je nadogradnja trepavica tehnikom 1 na 1?");
		txttaJeNadogradnja.setHorizontalAlignment(SwingConstants.CENTER);
		txttaJeNadogradnja.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txttaJeNadogradnja.setBackground(new Color(253, 245, 230));
		txttaJeNadogradnja.setEditable(false);
		txttaJeNadogradnja.setBounds(10, 127, 273, 23);
		contentPane.add(txttaJeNadogradnja);
		txttaJeNadogradnja.setColumns(10);
		
		JTextPane txtpnKodOveTehnike = new JTextPane();
		txtpnKodOveTehnike.setText("Kod ove tehnike svaka dla\u010Dica ili snop svilenih trepavica precizno se i pojedina\u010Dno nadogra\u0111uje na po jednu prirodnu trepavicu uz pomo\u0107 specijalnog lepka koji mo\u017Ee biti u crnoj ili providnoj boji. Ovakva nadogradnja trepavica 1 na 1 metodom naziva se jo\u0161 i metoda \u201Edlaka na dlaku\u201C, a rezultati traju od dve do \u010Detiri nedelje, nakon \u010Dega je neophodno izvr\u0161iti korekciju otpalih trepavica.");
		txtpnKodOveTehnike.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnKodOveTehnike.setEditable(false);
		txtpnKodOveTehnike.setBackground(new Color(253, 245, 230));
		txtpnKodOveTehnike.setBounds(10, 152, 479, 91);
		contentPane.add(txtpnKodOveTehnike);
		
		txtARuskiVolumen = new JTextField();
		txtARuskiVolumen.setHorizontalAlignment(SwingConstants.CENTER);
		txtARuskiVolumen.setBackground(new Color(253, 245, 230));
		txtARuskiVolumen.setEditable(false);
		txtARuskiVolumen.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtARuskiVolumen.setText("A ruski volumen?");
		txtARuskiVolumen.setBounds(10, 254, 273, 23);
		contentPane.add(txtARuskiVolumen);
		txtARuskiVolumen.setColumns(10);
		
		JTextPane txtpnMetodaRuskiVolumen = new JTextPane();
		txtpnMetodaRuskiVolumen.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnMetodaRuskiVolumen.setBackground(new Color(253, 245, 230));
		txtpnMetodaRuskiVolumen.setEditable(false);
		txtpnMetodaRuskiVolumen.setText("Metoda ruski volumen predstavlja metodu produ\u017Eavanja i pove\u0107anja volumena trepavica, a gde klijentkinja sama bira gustinu, du\u017Einu i oblik nadogra\u0111enih trepavica. U zavisnosti koliko trepavica se lepi na jednu prirodnu trepavicu u upotrebi su pored naziva ruski volumen jo\u0161 i nazivi 2D, 3D, 4D trepavice ili \u010Dak i 6D trepavice. Svilene trepavice koje se upotrebljavaju u tehnici \u201Eruski volumen\u201C izra\u0111ene su od najkvalitetnijih prirodnih ili sinteti\u010Dkih materijala i lepe se za prirodne trepavice.");
		txtpnMetodaRuskiVolumen.setBounds(10, 283, 479, 108);
		contentPane.add(txtpnMetodaRuskiVolumen);
		
		JButton btnKontakt = new JButton("Kontakt");
		btnKontakt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnKontakt.setIcon(new ImageIcon(NadogradnjaTrepavica.class.getResource("/contact.png")));
		btnKontakt.setBackground(new Color(253, 245, 230));
		btnKontakt.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnKontakt.setBounds(341, 392, 148, 33);
		contentPane.add(btnKontakt);
	}
}
