import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Kontakt extends JDialog {
	private JTextField txtKontakt;
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtPitanje;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Kontakt dialog = new Kontakt();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Kontakt() {
		getContentPane().setBackground(new Color(253, 245, 230));
		getContentPane().setLayout(null);
		
		txtKontakt = new JTextField();
		txtKontakt.setText("Kontakt");
		txtKontakt.setHorizontalAlignment(SwingConstants.CENTER);
		txtKontakt.setBackground(new Color(253, 245, 230));
		txtKontakt.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		txtKontakt.setEditable(false);
		txtKontakt.setBounds(158, 11, 136, 21);
		getContentPane().add(txtKontakt);
		txtKontakt.setColumns(10);
		
		JTextPane txtpnSlobodnoNamPostavite = new JTextPane();
		txtpnSlobodnoNamPostavite.setText("Slobodno nam postavite bilo koje pitanje ili zahtev, a mi \u0107emo Vam odgovoriti u \u0161to kra\u0107em periodu.");
		txtpnSlobodnoNamPostavite.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		txtpnSlobodnoNamPostavite.setBackground(new Color(253, 245, 230));
		txtpnSlobodnoNamPostavite.setEditable(false);
		txtpnSlobodnoNamPostavite.setBounds(10, 56, 475, 44);
		getContentPane().add(txtpnSlobodnoNamPostavite);
		
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		lblIme.setBounds(20, 114, 38, 14);
		getContentPane().add(lblIme);
		
		txtIme = new JTextField();
		txtIme.setBounds(74, 111, 116, 20);
		getContentPane().add(txtIme);
		txtIme.setColumns(10);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		lblPrezime.setBounds(235, 111, 65, 14);
		getContentPane().add(lblPrezime);
		
		txtPrezime = new JTextField();
		txtPrezime.setBounds(299, 111, 128, 21);
		getContentPane().add(txtPrezime);
		txtPrezime.setColumns(10);
		
		JLabel lblPitanje = new JLabel("Pitanje:");
		lblPitanje.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		lblPitanje.setBounds(20, 151, 55, 21);
		getContentPane().add(lblPitanje);
		
		txtPitanje = new JTextField();
		txtPitanje.setBounds(73, 145, 296, 62);
		getContentPane().add(txtPitanje);
		txtPitanje.setColumns(10);
		
		JButton btnNewButton = new JButton("Po\u0161alji");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(txtIme.getText().equals("")|| txtPrezime.getText().equals("") || txtPitanje.getText().equals("")) {
					JOptionPane.showMessageDialog(getContentPane(), "Morate popuniti sva polja!");
				}
				else
				JOptionPane.showMessageDialog(getContentPane(), "Poruka uspešno poslata!");
			}
		});
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD, 13));
		btnNewButton.setBounds(396, 161, 89, 33);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ili nas mo\u017Eete direktno kontaktirati...");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 247, 337, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSlika = new JLabel("New label");
		lblSlika.setIcon(new ImageIcon(Kontakt.class.getResource("/callcentar.png")));
		lblSlika.setBounds(32, 297, 89, 93);
		getContentPane().add(lblSlika);
		
		JTextPane txtpnMenader = new JTextPane();
		txtpnMenader.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtpnMenader.setBackground(new Color(253, 245, 230));
		txtpnMenader.setText("______________________________________________________\r\n|* Menad\u017Eer salona*               |           *Recepcija*                  | \r\n|*Mobilni: 0692441010*       |  *Telefon: 0112441010*    |\r\n|*mililcasalon@gmail.com*     |  *saloninfo@gmail.com*      |\r\n______________________________________________________\r\n");
		txtpnMenader.setEditable(false);
		txtpnMenader.setBounds(131, 297, 354, 100);
		getContentPane().add(txtpnMenader);
		setTitle("Kontakt");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Kontakt.class.getResource("/contact.png")));
		setBounds(100, 100, 511, 461);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
