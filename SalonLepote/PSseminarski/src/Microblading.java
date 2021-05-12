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

public class Microblading extends JFrame {

	private JPanel contentPane;
	private JTextField txtBladingObrva;
	private JTextField txttaJeJapansko;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Microblading frame = new Microblading();
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
	public Microblading() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Microblading.class.getResource("/eye-icon.png")));
		setTitle("Microblading obrva");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 516, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBladingObrva = new JTextField();
		txtBladingObrva.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtBladingObrva.setHorizontalAlignment(SwingConstants.CENTER);
		txtBladingObrva.setBackground(new Color(253, 245, 230));
		txtBladingObrva.setEditable(false);
		txtBladingObrva.setText("Microblading obrva - japansko iscrtavanje obrva");
		txtBladingObrva.setBounds(10, 11, 471, 39);
		contentPane.add(txtBladingObrva);
		txtBladingObrva.setColumns(10);
		
		JTextPane txtpnUkolikoSuVae = new JTextPane();
		txtpnUkolikoSuVae.setText("Ukoliko su va\u0161e obrve retke, nemaju \u017Eeljenu gustinu ili du\u017Einu \u2013 na pravom ste mestu. Nema sumnje da je trajna sminka kao \u0161to je microblading obrva najbolje re\u0161enje za postizanje proirodnog izgleda obrva, u \u0161ta su se uverili svi oni koji su bili i ostali na\u0161i klijenti!");
		txtpnUkolikoSuVae.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtpnUkolikoSuVae.setBackground(new Color(253, 245, 230));
		txtpnUkolikoSuVae.setEditable(false);
		txtpnUkolikoSuVae.setBounds(10, 61, 356, 96);
		contentPane.add(txtpnUkolikoSuVae);
		
		JLabel lblSlika = new JLabel("");
		lblSlika.setIcon(new ImageIcon(Microblading.class.getResource("/obrve.png")));
		lblSlika.setBounds(386, 61, 72, 78);
		contentPane.add(lblSlika);
		
		txttaJeJapansko = new JTextField();
		txttaJeJapansko.setText("\u0160ta je japansko iscrtavanje - microbading obrva?");
		txttaJeJapansko.setHorizontalAlignment(SwingConstants.CENTER);
		txttaJeJapansko.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txttaJeJapansko.setBackground(new Color(253, 245, 230));
		txttaJeJapansko.setEditable(false);
		txttaJeJapansko.setBounds(10, 168, 333, 20);
		contentPane.add(txttaJeJapansko);
		txttaJeJapansko.setColumns(10);
		
		JTextPane txtpnMicrobladingObrvaJe = new JTextPane();
		txtpnMicrobladingObrvaJe.setText("Microblading obrva je iscrtavanje obrva uz pomo\u0107 specijalnih, malih o\u0161trica - no\u017Ei\u0107a (blades) kojim se pigment plitko unosi pod ko\u017Eu u vidu dla\u010Dica iscrtanih u pravcu prirodnog rasta obrva! Pigmenti koji se koriste ovom prilikom su bezbedni i hipoalergeni, a rezultati su potpuno prirodni i prilago\u0111avaju se obliku, veli\u010Dini i gustini obrva \u2013 \u010Dime se posti\u017Ee najprirodniji izgled. Ovo je relativno brz tretman, traje maksimalno sat i po, gotovo potpuno bezbolan, ali zahteva detaljnu pripremu i merenje kako bi se postigao prirodni oblik i gustina obrva klijenta.");
		txtpnMicrobladingObrvaJe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnMicrobladingObrvaJe.setBackground(new Color(253, 245, 230));
		txtpnMicrobladingObrvaJe.setEditable(false);
		txtpnMicrobladingObrvaJe.setBounds(20, 199, 461, 132);
		contentPane.add(txtpnMicrobladingObrvaJe);
		
		JTextPane txtpnUkolikoSteSe = new JTextPane();
		txtpnUkolikoSteSe.setText("Ukoliko ste se ranije podvrgli tetoviranju obrva ili niste zadovoljni iskustvima sa japanskim iscrtavanjem i treba vam korekcija obrva \u2013 na pravom ste mestu. Na\u0161 salon radi i uklanjanje tetovaze i lo\u0161e ura\u0111enih tretmana. Kod nas se skidanje tetovaze sa obrva radi uz pomo\u0107 lasera, tako da ne ostaju bilo kakvi vidljivi tragovi, a potom se radi iscrtavanje obrva japanskom metodom. Na ovaj na\u010Din microblading obrva posti\u017Ee u potpunosti prirodne rezultate.");
		txtpnUkolikoSteSe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnUkolikoSteSe.setBackground(new Color(253, 245, 230));
		txtpnUkolikoSteSe.setEditable(false);
		txtpnUkolikoSteSe.setBounds(30, 329, 451, 108);
		contentPane.add(txtpnUkolikoSteSe);
		
		JButton btnKont = new JButton("Kontakt");
		btnKont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnKont.setBackground(new Color(253, 245, 230));
		btnKont.setIcon(new ImageIcon(Microblading.class.getResource("/contact.png")));
		btnKont.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnKont.setBounds(341, 440, 140, 33);
		contentPane.add(btnKont);
	}
}
