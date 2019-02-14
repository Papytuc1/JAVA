package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemple {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemple window = new Exemple();
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
	public Exemple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		//FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		panel_1.setBackground(new Color(255, 165, 0));
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel, 54, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel, -56, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel, -72, SpringLayout.EAST, panel_1);
		panel_1.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnNewButton = new JButton("New button");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 30, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -61, SpringLayout.EAST, panel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(panel, "Hello World", "Salut",JOptionPane.ERROR_MESSAGE);
			}
		});
		panel.add(btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton, 104, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, 259, SpringLayout.WEST, panel_1);
		btnNewButton.setMinimumSize(new Dimension(50, 50));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 5, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton, 89, SpringLayout.NORTH, panel_1);
		
		JButton btnNewButton_1 = new JButton("salut");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("salut");
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 33, SpringLayout.SOUTH, btnNewButton);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_1, 69, SpringLayout.WEST, panel);
		panel.add(btnNewButton_1);
	}
}
