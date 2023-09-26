import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }

	    private static void createAndShowGUI() {
	        JFrame frame = new JFrame("Image and Text Display");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800, 300);

	        
	        JPanel panel = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);

	               
	                try {
	                    BufferedImage image = ImageIO.read(new File("hachiwarae.jpg"));
	                    g.drawImage(image, 50, 50, null);
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }


	                g.setColor(Color.BLACK);
	                g.setFont(new Font("Arial", Font.PLAIN, 16));
	                g.drawString("20220773 LDY", 50, 200);
	            }
	        };

	        frame.add(panel);
	        frame.setVisible(true);

	}

}
