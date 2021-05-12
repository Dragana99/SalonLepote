import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProSminka extends JFrame {

	private JPanel contentPane;
	private JTextField txtProfesionalnominkanje;
	private JTextField txtNeutralnaminka;
	private JTextField txtminkaZaSvadbu;
	private JTextField txtminkaZaMaturu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProSminka frame = new ProSminka();
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
	public ProSminka() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProSminka.class.getResource("/makeup.png")));
		setTitle("Profesionalno \u0161minkanje");
		setBackground(new Color(253, 245, 230));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 498, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtProfesionalnominkanje = new JTextField();
		txtProfesionalnominkanje.setText("Profesionalno \u0161minkanje");
		txtProfesionalnominkanje.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtProfesionalnominkanje.setHorizontalAlignment(SwingConstants.CENTER);
		txtProfesionalnominkanje.setBackground(new Color(253, 245, 230));
		txtProfesionalnominkanje.setEditable(false);
		txtProfesionalnominkanje.setBounds(10, 0, 184, 39);
		contentPane.add(txtProfesionalnominkanje);
		txtProfesionalnominkanje.setColumns(10);
		
		JTextPane txtpnKadaSeOdluite = new JTextPane();
		txtpnKadaSeOdluite.setText("Kada se odlu\u010Dite za profesionalno sminkanje vi zapravo \u017Eelite besprekornu \u0161minku koja \u0107e stajati na licu ceo dan, isticati va\u0161u prirodnu lepotu, a u potpunosti prekriti nedostatke na licu ukoliko ih imate.");
		txtpnKadaSeOdluite.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnKadaSeOdluite.setBackground(new Color(253, 245, 230));
		txtpnKadaSeOdluite.setEditable(false);
		txtpnKadaSeOdluite.setBounds(201, 0, 210, 102);
		contentPane.add(txtpnKadaSeOdluite);
		
		JLabel lblSlika1 = new JLabel("");
		lblSlika1.setIcon(new ImageIcon(ProSminka.class.getResource("/prosminka.png")));
		lblSlika1.setBounds(411, 15, 61, 72);
		contentPane.add(lblSlika1);
		
		txtNeutralnaminka = new JTextField();
		txtNeutralnaminka.setText("Neutralna \u0161minka - \"no makeup-makeup\"");
		txtNeutralnaminka.setHorizontalAlignment(SwingConstants.CENTER);
		txtNeutralnaminka.setBackground(new Color(253, 245, 230));
		txtNeutralnaminka.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtNeutralnaminka.setEditable(false);
		txtNeutralnaminka.setBounds(0, 113, 482, 20);
		contentPane.add(txtNeutralnaminka);
		txtNeutralnaminka.setColumns(10);
		
		JTextPane txtpnUkolikoeliteDa = new JTextPane();
		txtpnUkolikoeliteDa.setText("Ukoliko \u017Eelite da tonirate lice, ispravite i prekrijete nedostatke a da va\u0161e lice izgleda veoma prirodno onda je to tzv. \u201Enude izgled\u201C ili kako se jo\u0161 u svetu zove \u201Eno makeup makeup\u201C. Ovakav izgled se posti\u017Ee upotrebom profesionalnih preparata za \u0161minku, ali i ve\u0161tinom iskusnih i obu\u010Denih \u0161minkera. Ovakva profesionalna \u0161minka pogodna je za dnevne varijante, naro\u010Dito za posao ili razli\u010Dite formalne sastanke i sl.");
		txtpnUkolikoeliteDa.setBackground(new Color(253, 245, 230));
		txtpnUkolikoeliteDa.setEditable(false);
		txtpnUkolikoeliteDa.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnUkolikoeliteDa.setBounds(10, 131, 472, 91);
		contentPane.add(txtpnUkolikoeliteDa);
		
		txtminkaZaSvadbu = new JTextField();
		txtminkaZaSvadbu.setText("\u0160minka za svadbu");
		txtminkaZaSvadbu.setHorizontalAlignment(SwingConstants.CENTER);
		txtminkaZaSvadbu.setBackground(new Color(253, 245, 230));
		txtminkaZaSvadbu.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtminkaZaSvadbu.setEditable(false);
		txtminkaZaSvadbu.setBounds(0, 224, 482, 20);
		contentPane.add(txtminkaZaSvadbu);
		txtminkaZaSvadbu.setColumns(10);
		
		JTextPane txtpnUkolikoSeUdajete = new JTextPane();
		txtpnUkolikoSeUdajete.setText("Ukoliko se udajete, jasno je da taj dan \u017Eelite da sve izgleda najlep\u0161e i najbolje \u0161to mo\u017Ee! Kada je sminka za svadbu u pitanju.Zato je od velike va\u017Enosti i probno \u0161minkanje, kada se simuliraju sli\u010Dne mogu\u0107nosti i uo\u010Davaju potencijalne gre\u0161ke i problemi sa \u0161minkom, a to sigurno ne \u017Eelite na sam dan ven\u010Danja, do kojih mo\u017Ee do\u0107i usled \u010Destog ljubljenja, fotografisanja , igranja i svih drugih neminovnih de\u0161avanja.");
		txtpnUkolikoSeUdajete.setBackground(new Color(253, 245, 230));
		txtpnUkolikoSeUdajete.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnUkolikoSeUdajete.setEditable(false);
		txtpnUkolikoSeUdajete.setBounds(10, 247, 472, 85);
		contentPane.add(txtpnUkolikoSeUdajete);
		
		txtminkaZaMaturu = new JTextField();
		txtminkaZaMaturu.setText("\u0160minka za maturu");
		txtminkaZaMaturu.setHorizontalAlignment(SwingConstants.CENTER);
		txtminkaZaMaturu.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtminkaZaMaturu.setBackground(new Color(253, 245, 230));
		txtminkaZaMaturu.setEditable(false);
		txtminkaZaMaturu.setBounds(0, 336, 482, 20);
		contentPane.add(txtminkaZaMaturu);
		txtminkaZaMaturu.setColumns(10);
		
		JTextPane txtpnProfesionalnaSminkaTreba = new JTextPane();
		txtpnProfesionalnaSminkaTreba.setText("Profesionalna sminka treba da se prilagodi i mladoj ko\u017Ei, a da tako\u0111e pru\u017Ei dugotrajne efekte, da ima visoku mo\u0107 prekrivanja i sposobnost kamufla\u017Ee nedostataka. Iako smo uvereni da i svaka mlada dama ume sama da se na\u0161minka, ukoliko \u017Eelite da izgledate najlep\u0161e na bilo kojoj posebnoj prilici, bolja opija je da anga\u017Eujete stru\u010Dnjake za profesionlno sminkanje.");
		txtpnProfesionalnaSminkaTreba.setBackground(new Color(253, 245, 230));
		txtpnProfesionalnaSminkaTreba.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnProfesionalnaSminkaTreba.setEditable(false);
		txtpnProfesionalnaSminkaTreba.setBounds(0, 354, 482, 75);
		contentPane.add(txtpnProfesionalnaSminkaTreba);
		
		JButton btnKontakt = new JButton("Kontakt");
		btnKontakt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnKontakt.setIcon(new ImageIcon(ProSminka.class.getResource("/contact.png")));
		btnKontakt.setBackground(new Color(253, 245, 230));
		btnKontakt.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnKontakt.setBounds(341, 429, 131, 34);
		contentPane.add(btnKontakt);
		
		JLabel lblSlika2 = new JLabel("");
		lblSlika2.setIcon(new ImageIcon(ProSminka.class.getResource("/pngguru.com.png")));
		lblSlika2.setBounds(10, 33, 184, 87);
		contentPane.add(lblSlika2);
	}
}
