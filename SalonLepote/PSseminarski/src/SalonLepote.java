import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class SalonLepote extends JFrame {

	private JPanel contentPane;
	private JTextField txtNa;
	private JTextField txtIzaberiteNekuOd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalonLepote frame = new SalonLepote();
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
	public SalonLepote() {
		setTitle("Salon lepote");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SalonLepote.class.getResource("/facial-treatment.png")));
		setTitle("Salon lepote");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 461, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		
		txtNa = new JTextField();
		txtNa.setHorizontalAlignment(SwingConstants.CENTER);
		txtNa.setBackground(new Color(253, 245, 230));
		txtNa.setEditable(false);
		txtNa.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		txtNa.setText("Estetske usluge koje nudimo:");
		panel.add(txtNa);
		txtNa.setColumns(35);
		
		JButton btnManikir = new JButton("Manikir i pedikir");
		btnManikir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ManikirPedikir mp = new ManikirPedikir();
				mp.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnManikir.setIcon(new ImageIcon(SalonLepote.class.getResource("/icons8-nails-16.png")));
		btnManikir.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		
		
		JButton btnKosa = new JButton("Nega kose");
		btnKosa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NegaKose nk = new NegaKose();
				nk.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnKosa.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		btnKosa.setIcon(new ImageIcon(SalonLepote.class.getResource("/woman.png")));
		
		JButton btnSminka = new JButton("Profesionalno \u0161minkanje");
		btnSminka.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProSminka ps = new ProSminka();
				ps.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnSminka.setIcon(new ImageIcon(SalonLepote.class.getResource("/makeup.png")));
		btnSminka.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		
		JButton btnTrajna = new JButton("Trajna \u0161minka");
		btnTrajna.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TrajnaSminka ts = new TrajnaSminka();
				ts.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnTrajna.setIcon(new ImageIcon(SalonLepote.class.getResource("/per-makeup.png")));
		btnTrajna.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		
		JButton btnMasaze = new JButton("Masa\u017Ee");
		btnMasaze.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Masaza m = new Masaza();
				m.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnMasaze.setIcon(new ImageIcon(SalonLepote.class.getResource("/massage.png")));
		btnMasaze.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		
		JButton btnLice = new JButton("Anti-aging program");
		btnLice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Antiaging a = new Antiaging();
				a.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnLice.setIcon(new ImageIcon(SalonLepote.class.getResource("/botox.png")));
		btnLice.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		
		JButton btnObrve = new JButton("Microblading obrva");
		btnObrve.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Microblading m = new Microblading();
				m.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnObrve.setIcon(new ImageIcon(SalonLepote.class.getResource("/eye-icon.png")));
		btnObrve.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		
		JButton btnTrepavice = new JButton("Nadogradnja trepavica");
		btnTrepavice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NadogradnjaTrepavica nt = new NadogradnjaTrepavica();
				nt.setVisible(true);
				contentPane.setVisible(true);
			}
		});
		btnTrepavice.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		btnTrepavice.setIcon(new ImageIcon(SalonLepote.class.getResource("/lash.png")));
		
		txtIzaberiteNekuOd = new JTextField();
		txtIzaberiteNekuOd.setHorizontalAlignment(SwingConstants.CENTER);
		txtIzaberiteNekuOd.setBackground(new Color(253, 245, 230));
		txtIzaberiteNekuOd.setForeground(new Color(0, 0, 0));
		txtIzaberiteNekuOd.setEditable(false);
		txtIzaberiteNekuOd.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		txtIzaberiteNekuOd.setText("Izaberite neke od na\u0161ih usluga");
		txtIzaberiteNekuOd.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(btnManikir, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnKosa, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(btnSminka, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnTrajna, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(btnMasaze, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnLice, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(btnObrve, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnTrepavice, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
				.addComponent(txtIzaberiteNekuOd, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnManikir, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnKosa, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSminka, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTrajna, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMasaze, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLice, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnObrve, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTrepavice, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addComponent(txtIzaberiteNekuOd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
