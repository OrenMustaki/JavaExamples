/**
 * 
 * @author oren
 * @version Feb 9, 2019
 * 
 */
import java.awt.*;
import javax.swing.*;

public class FramesPanelsLabels {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frames");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.yellow);
		primary.setPreferredSize(new Dimension(250, 75));
		
		JLabel label1 = new JLabel("Label 1");
		JLabel label2 = new JLabel("Label 2");
		
		primary.add(label1);
		primary.add(label2);
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}

}
