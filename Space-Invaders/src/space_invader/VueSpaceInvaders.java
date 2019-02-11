package space_invader;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VueSpaceInvaders {
	private JFrame frame;
	private JTextField txtSpaceInvaders;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueSpaceInvaders window = new VueSpaceInvaders();
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
	public VueSpaceInvaders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setPreferredSize(new Dimension(800, 600));
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				Game.main(null);
			}
		});
		btnNewGame.setBounds(249, 163, 343, 60);
		panel.add(btnNewGame);
		
		txtSpaceInvaders = new JTextField();
		txtSpaceInvaders.setEditable(false);
		txtSpaceInvaders.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpaceInvaders.setFont(new Font("FreeMono", Font.PLAIN, 24));
		txtSpaceInvaders.setText("Space Invaders");
		txtSpaceInvaders.setBounds(285, 70, 272, 81);
		panel.add(txtSpaceInvaders);
		txtSpaceInvaders.setColumns(10);
		
		
		
		
	}
}
