import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ONama extends JFrame {

	private JPanel contentPane;
	private JTextField txtONama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ONama frame = new ONama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame About.
	 */
	public ONama() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ONama.class.getResource("/house.png")));
		setTitle("O nama");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 485, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnDoktora = new JTextPane();
		txtpnDoktora.setEditable(false);
		txtpnDoktora.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnDoktora.setBackground(new Color(253, 245, 230));
		txtpnDoktora.setText("                    ***  4  frizera  ***\r\n                   ***  3 doktora  ***\r\n                ***   3 fizioterapeuta  ***\r\n    ***   2 stru\u010Dnjaka za trajnu \u0161minku  ***\r\n  ***  4 stru\u010Dnjaka za makikir i pedikir  ****");
		txtpnDoktora.setBounds(232, 290, 237, 116);
		contentPane.add(txtpnDoktora);
		
		txtONama = new JTextField();
		txtONama.setEditable(false);
		txtONama.setHorizontalAlignment(SwingConstants.CENTER);
		txtONama.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtONama.setBackground(new Color(253, 245, 230));
		txtONama.setText("O nama");
		txtONama.setBounds(50, 11, 126, 25);
		contentPane.add(txtONama);
		txtONama.setColumns(10);
		
		JTextPane txtpnSalonLepoteMoe = new JTextPane();
		txtpnSalonLepoteMoe.setEditable(false);
		txtpnSalonLepoteMoe.setBackground(new Color(253, 245, 230));
		txtpnSalonLepoteMoe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		txtpnSalonLepoteMoe.setText("Salon lepote mo\u017Ee da se pohvali visokokvalitetnom uslugom po pristupa\u010Dnim cenama kao i stalnom pra\u0107enju novih trendova. Uigrani tim frizera, doktora, kozmeti\u010Dara, make up umetnika, fizioterapeuta, stru\u010Dnjaka za pedikir, manikir i iscrtavanje obrva, Vam je, uz najbolje preparate i ure\u0111aje poslednje generacije, na usluzi svakog dana.");
		txtpnSalonLepoteMoe.setBounds(10, 65, 208, 215);
		contentPane.add(txtpnSalonLepoteMoe);
		
		JLabel lblPozadina = new JLabel("");
		lblPozadina.setIcon(new ImageIcon(ONama.class.getResource("/woman-3285876_640.png")));
		lblPozadina.setBounds(-109, 0, 568, 476);
		contentPane.add(lblPozadina);
	}
}
