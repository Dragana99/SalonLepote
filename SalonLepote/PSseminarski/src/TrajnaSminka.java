import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TrajnaSminka extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrajnaminka;
	private JTextField txttaJeTrajna;
	private JTextField txtTrajnaminkaJe;
	private JTextField txtTrajnaminkaUsana;
	private JTextField txtTrajnaminka_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrajnaSminka frame = new TrajnaSminka();
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
	public TrajnaSminka() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TrajnaSminka.class.getResource("/per-makeup.png")));
		setTitle("Trajna \u0161minka");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 512, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTrajnaminka = new JTextField();
		txtTrajnaminka.setText("Trajna \u0161minka");
		txtTrajnaminka.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrajnaminka.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtTrajnaminka.setBackground(new Color(253, 245, 230));
		txtTrajnaminka.setEditable(false);
		txtTrajnaminka.setBounds(10, 11, 313, 27);
		contentPane.add(txtTrajnaminka);
		txtTrajnaminka.setColumns(10);
		
		txttaJeTrajna = new JTextField();
		txttaJeTrajna.setText("\u0160ta je trajna \u0161minka i kome je namenjena?");
		txttaJeTrajna.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txttaJeTrajna.setHorizontalAlignment(SwingConstants.CENTER);
		txttaJeTrajna.setBackground(new Color(253, 245, 230));
		txttaJeTrajna.setEditable(false);
		txttaJeTrajna.setBounds(10, 49, 313, 20);
		contentPane.add(txttaJeTrajna);
		txttaJeTrajna.setColumns(10);
		
		txtTrajnaminkaJe = new JTextField();
		txtTrajnaminkaJe.setText("Trajna \u0161minka obrva");
		txtTrajnaminkaJe.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrajnaminkaJe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtTrajnaminkaJe.setBackground(new Color(253, 245, 230));
		txtTrajnaminkaJe.setEditable(false);
		txtTrajnaminkaJe.setBounds(10, 175, 476, 20);
		contentPane.add(txtTrajnaminkaJe);
		txtTrajnaminkaJe.setColumns(10);
		
		JTextPane txtpnTrajnaminkaJe = new JTextPane();
		txtpnTrajnaminkaJe.setText("Trajna \u0161minka je savremena tehnika ulep\u0161avanja lica koja omogu\u0107ava ubacivanje posebnih trajnih pigmenata u dublje slojeve ko\u017Ee, a sa ciljem isticanja prirodne lepote ili promene oblika obrva, usana ili kontura oka.Ova tehnika je namenjena svim damama koje \u017Eele da se na du\u017Ei vremenski rok re\u0161e zamornog svakodnevnog \u0161minkanja. Damama koje \u017Eele da istaknu svoju prirodnu lepotu, ili pak koriguju neke nedostatke (tanke obrve, blede usne itd.), postignu zdraviji i mla\u0111i izgled.");
		txtpnTrajnaminkaJe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnTrajnaminkaJe.setBackground(new Color(253, 245, 230));
		txtpnTrajnaminkaJe.setEditable(false);
		txtpnTrajnaminkaJe.setBounds(10, 68, 457, 108);
		contentPane.add(txtpnTrajnaminkaJe);
		
		JTextPane txtpnToJeZapravo = new JTextPane();
		txtpnToJeZapravo.setText("To je zapravo tehnika japanskog iscrtavanja obrva, a ovaj na\u010Din korigovanja obrva daje najprirodnije rezultate na svakom licu. Iscrtavanje dla\u010Dicu po dla\u010Dicu se vr\u0161i na taj na\u010Din da se simulira prirodan oblik obrva, odnosno boja se aplikuje uz pomo\u0107 jako tankih no\u017Ei\u0107a u pravcu rasta va\u0161ih prirodnih obrva uz pove\u0107anje gustine i njihove veli\u010Dine (korekcija simetrije, oblika itd.)");
		txtpnToJeZapravo.setBackground(new Color(253, 245, 230));
		txtpnToJeZapravo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnToJeZapravo.setEditable(false);
		txtpnToJeZapravo.setBounds(10, 190, 476, 74);
		contentPane.add(txtpnToJeZapravo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TrajnaSminka.class.getResource("/trajna.png")));
		lblNewLabel.setBounds(377, 11, 90, 46);
		contentPane.add(lblNewLabel);
		
		txtTrajnaminkaUsana = new JTextField();
		txtTrajnaminkaUsana.setText("Trajna \u0161minka usana");
		txtTrajnaminkaUsana.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtTrajnaminkaUsana.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrajnaminkaUsana.setBackground(new Color(253, 245, 230));
		txtTrajnaminkaUsana.setEditable(false);
		txtTrajnaminkaUsana.setBounds(10, 275, 476, 20);
		contentPane.add(txtTrajnaminkaUsana);
		txtTrajnaminkaUsana.setColumns(10);
		
		JTextPane txtpnTrajnaSminkaUsana = new JTextPane();
		txtpnTrajnaSminkaUsana.setText("Trajna sminka usana omogu\u0107ava da se na jednostavan na\u010Din koriguje njihov oblik i veli\u010Dina, postigne ve\u0107i volumen, izra\u017Eajnost ili efekat kakav se dobija upotrebom ru\u017Ea za usne. Trajna \u0161minka usana podrazumeva konturisanje ili rekonstrukciju usana, kao i sen\u010Denje odnosno popunjavanje povr\u0161ine celih usana. Trajna sminka usana traje nekoliko godina u zavisnosti od boje ko\u017Ee, metabolizma, starosti osobe.");
		txtpnTrajnaSminkaUsana.setBackground(new Color(253, 245, 230));
		txtpnTrajnaSminkaUsana.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnTrajnaSminkaUsana.setEditable(false);
		txtpnTrajnaSminkaUsana.setBounds(10, 299, 476, 91);
		contentPane.add(txtpnTrajnaSminkaUsana);
		
		txtTrajnaminka_1 = new JTextField();
		txtTrajnaminka_1.setText("Trajna \u0161minka - ajlejner");
		txtTrajnaminka_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrajnaminka_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtTrajnaminka_1.setBackground(new Color(253, 245, 230));
		txtTrajnaminka_1.setEditable(false);
		txtTrajnaminka_1.setBounds(10, 393, 343, 20);
		contentPane.add(txtTrajnaminka_1);
		txtTrajnaminka_1.setColumns(10);
		
		JTextPane txtpnUbacivanjemBojeU = new JTextPane();
		txtpnUbacivanjemBojeU.setText("Ubacivanjem boje u regiju gornjeg i/ili donjeg kapka, posti\u017Ee se efekat ajlajnera koji ima za rezultat i produbljeniji pogled, pove\u0107anje gustine i boje trepavica, nagla\u0161avanje o\u010Diju i njihovih kontura.");
		txtpnUbacivanjemBojeU.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnUbacivanjemBojeU.setBackground(new Color(253, 245, 230));
		txtpnUbacivanjemBojeU.setEditable(false);
		txtpnUbacivanjemBojeU.setBounds(10, 415, 343, 55);
		contentPane.add(txtpnUbacivanjemBojeU);
		
		JButton btnNewButton = new JButton("Kontakt");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setIcon(new ImageIcon(TrajnaSminka.class.getResource("/contact.png")));
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton.setBounds(363, 415, 123, 46);
		contentPane.add(btnNewButton);
	}
}
