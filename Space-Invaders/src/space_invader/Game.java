package space_invader;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;
import java.awt.Dimension;

public class Game {
	Set<Character> touche = new HashSet<Character>();
	Vaisseaux vaisseaux;
	Missiles missile;
	JLabel lblVaisseau;
	private JFrame frame;
	public ImageIcon sprite(String image) {
		ImageIcon sprite = new ImageIcon(getClass().getResource("/ressources/"+image+".gif"));
		return sprite;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(arg0);
				missile = vaisseaux.tirer();
				frame.getContentPane().add(missile.getLblMissile());
				missile.seDeplacer();
			}
		});
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		lblVaisseau = new JLabel("");	
		lblVaisseau.setBackground(Color.BLUE);
		lblVaisseau.setIcon(sprite("vaisseau"));
		lblVaisseau.setBounds(368, 500, 64, 64);
		frame.getContentPane().add(lblVaisseau);
		this.vaisseaux = new Vaisseaux(lblVaisseau);
		frame.addKeyListener(new KeyAdapter() {  
			@Override
			public synchronized void keyPressed(KeyEvent e) {
				if(e.getKeyChar()=='d'&& vaisseaux.getX()<738) {					
					touche.add(e.getKeyChar());					
					vaisseaux.seDeplacerGauche();
				}
				if(e.getKeyChar()=='q'&&vaisseaux.getX()>-2) {
					vaisseaux.seDeplacerDroite();
				}
				
			}
		});
		frame.addKeyListener(new KeyAdapter() {  
			@Override
			public synchronized void keyReleased(KeyEvent e) {
				if(e.getKeyChar()=='d'&& vaisseaux.getX()<738) {
					touche.remove(e.getKeyChar());
				}
				else if(e.getKeyChar()=='q'&&vaisseaux.getX()>-2) {
					vaisseaux.seDeplacerDroite();
				}
				else if(e.getKeyChar()==' ') {
					touche.remove(e.getKeyChar());
				}
			}
		});

	}

}
