package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Players.Negro;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Background extends JFrame {

	private JPanel contentPane;
    private Negro negro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Background frame = new Background();
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
	public Background() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\vecteezy_summer-nature-landscape-cartoon-game-background_12746789.jpg"));
		lblNewLabel.setBounds(0, 0, 984, 461);
		contentPane.add(lblNewLabel);
		
		negro = new Negro();
	}
	
    public Negro getJugador() {
        return negro;
    }
}


