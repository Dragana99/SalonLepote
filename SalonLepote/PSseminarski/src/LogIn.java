import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtDobroDoliU;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenu mnUsluge;
	private JMenuItem mntmPoetna;
	private JMenuItem mntmGalerija;
	private JMenuItem mntmNadogradnjaTrepavica;
	private JMenuItem mntmMicrobladingObrva;
	private JMenuItem mntmAntiagingProgram;
	private JMenuItem mntmMasae;
	private JMenuItem mntmTrajnaminka;
	private JMenuItem mntmProfesionalnominkanje;
	private JMenuItem mntmNegaKose;
	private JMenuItem mntmManikirIPedikir;
	private JMenuItem mntmKontakt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setFont(new Font("Monotype Corsiva", Font.PLAIN, 13));
		setTitle("Dobro do\u0161li u salon lepote!");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogIn.class.getResource("/beautyI.png")));
		setTitle("Dobro do\u0161li u salon lepote!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 430);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 128, 128));
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		mnMenu.setIcon(new ImageIcon(LogIn.class.getResource("/menu.png")));
		mnMenu.setBackground(new Color(253, 245, 230));
		menuBar.add(mnMenu);
		
		mntmPoetna = new JMenuItem("O nama");
		mntmPoetna.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				ONama on = new ONama();
				on.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mntmPoetna.setIcon(new ImageIcon(LogIn.class.getResource("/house.png")));
		mnMenu.add(mntmPoetna);
		
		mnUsluge = new JMenu("Usluge");
		mnUsluge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SalonLepote sl = new SalonLepote();
				sl.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnMenu.add(mnUsluge);
		
		mntmManikirIPedikir = new JMenuItem("Manikir i pedikir");
		mntmManikirIPedikir.setIcon(new ImageIcon(LogIn.class.getResource("/icons8-nails-16.png")));
		mntmManikirIPedikir.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ManikirPedikir m = new ManikirPedikir();
				m.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnUsluge.add(mntmManikirIPedikir);
		
		mntmNegaKose = new JMenuItem("Nega kose");
		mntmNegaKose.setIcon(new ImageIcon(LogIn.class.getResource("/woman.png")));
		mntmNegaKose.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				NegaKose nk = new NegaKose();
				nk.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnUsluge.add(mntmNegaKose);
		
		mntmProfesionalnominkanje = new JMenuItem("Profesionalno \u0161minkanje");
		mntmProfesionalnominkanje.setIcon(new ImageIcon(LogIn.class.getResource("/makeup.png")));
		mntmProfesionalnominkanje.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ProSminka ps = new ProSminka();
				ps.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnUsluge.add(mntmProfesionalnominkanje);
		
		mntmTrajnaminka = new JMenuItem("Trajna \u0161minka");
		mntmTrajnaminka.setIcon(new ImageIcon(LogIn.class.getResource("/per-makeup.png")));
		mntmTrajnaminka.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				TrajnaSminka ts = new TrajnaSminka();
				ts.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnUsluge.add(mntmTrajnaminka);
		
		mntmMasae = new JMenuItem("Masa\u017Ee");
		mntmMasae.setIcon(new ImageIcon(LogIn.class.getResource("/massage.png")));
		mntmMasae.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Masaza m = new Masaza();
				m.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnUsluge.add(mntmMasae);
		
		mntmAntiagingProgram = new JMenuItem("Anti-aging program");
		mntmAntiagingProgram.setIcon(new ImageIcon(LogIn.class.getResource("/botox.png")));
		mntmAntiagingProgram.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Antiaging a = new Antiaging();
				a.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnUsluge.add(mntmAntiagingProgram);
		
		mntmMicrobladingObrva = new JMenuItem("Microblading obrva");
		mntmMicrobladingObrva.setIcon(new ImageIcon(LogIn.class.getResource("/eye-icon.png")));
		mntmMicrobladingObrva.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Microblading m = new Microblading();
				m.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mnUsluge.add(mntmMicrobladingObrva);
		
		mntmNadogradnjaTrepavica = new JMenuItem("Nadogradnja trepavica");
		mntmNadogradnjaTrepavica.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				NadogradnjaTrepavica nt = new NadogradnjaTrepavica();
				nt.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mntmNadogradnjaTrepavica.setIcon(new ImageIcon(LogIn.class.getResource("/lash.png")));
		mnUsluge.add(mntmNadogradnjaTrepavica);
		
		mntmGalerija = new JMenuItem("Galerija");
		mntmGalerija.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Galerija g = new Galerija();
				g.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mntmGalerija.setIcon(new ImageIcon(LogIn.class.getResource("/gallery.png")));
		mnMenu.add(mntmGalerija);
		
		mntmKontakt = new JMenuItem("Kontakt");
		mntmKontakt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Kontakt k = new Kontakt();
				k.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		mntmKontakt.setIcon(new ImageIcon(LogIn.class.getResource("/contact.png")));
		mnMenu.add(mntmKontakt);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextPane txtpnBuditeUToku = new JTextPane();
		txtpnBuditeUToku.setEditable(false);
		txtpnBuditeUToku.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		txtpnBuditeUToku.setBackground(new Color(253, 245, 230));
		txtpnBuditeUToku.setText("Budite u toku sa najsavremenijim svetskim trendovima u o\u010Duvanju i isticanju lepote.");
		
		txtDobroDoliU = new JTextField();
		txtDobroDoliU.setEditable(false);
		txtDobroDoliU.setBackground(new Color(253, 245, 230));
		txtDobroDoliU.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
		txtDobroDoliU.setText("Dobro do\u0161li u salon lepote");
		txtDobroDoliU.setColumns(10);
		
		JTextPane txtpnUSvakiDetalj = new JTextPane();
		txtpnUSvakiDetalj.setEditable(false);
		txtpnUSvakiDetalj.setBackground(new Color(253, 245, 230));
		txtpnUSvakiDetalj.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		txtpnUSvakiDetalj.setText("U svaki detalj na\u0161eg prostora ulo\u017Eeno je mnogo truda posve\u0107enosti i ljubavi...Sigurni smo da \u0107ete i Vi sami osetiti.");
		
		JTextPane txtpnAkoNemateVremena = new JTextPane();
		txtpnAkoNemateVremena.setEditable(false);
		txtpnAkoNemateVremena.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		txtpnAkoNemateVremena.setBackground(new Color(253, 245, 230));
		txtpnAkoNemateVremena.setText("Ako nemate vremena da odete sa svojom drugaricom na razgovor uz pi\u0107e, mi vam dajemo mogu\u0107nost da se, dok se zajedno ulep\u0161avate i relaksirate, ose\u0107ate kao u najluksuznijem restoranu i opustite se uz smeh, dok mi brimeno o vama.");
		
		JLabel lblSlika1 = new JLabel("");
		lblSlika1.setIcon(new ImageIcon(LogIn.class.getResource("/saloonn.png")));
		
		JLabel lblSlika2 = new JLabel("");
		lblSlika2.setIcon(new ImageIcon(LogIn.class.getResource("/tretman.png")));
		
		JLabel lblSlika3 = new JLabel("");
		lblSlika3.setIcon(new ImageIcon(LogIn.class.getResource("/massagee.png")));
		
		JLabel lblSlika4 = new JLabel("");
		lblSlika4.setIcon(new ImageIcon(LogIn.class.getResource("/hair-salon.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnBuditeUToku, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
								.addComponent(txtpnAkoNemateVremena, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(47)
							.addComponent(lblSlika1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(txtDobroDoliU, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnUSvakiDetalj, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(81)
					.addComponent(lblSlika2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(lblSlika3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
					.addComponent(lblSlika4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(59))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSlika1)
						.addComponent(txtDobroDoliU, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(txtpnBuditeUToku, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtpnAkoNemateVremena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSlika2)
								.addComponent(lblSlika3)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSlika4)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnUSvakiDetalj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
