import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @(#)
 *
 * 
 * @author oren
 * @version Feb 9, 2019
 */
public class NestedPanels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(150, 100));
		subPanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("One");
		subPanel1.add(label1);
		
		JPanel subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(150, 100));
		subPanel2.setBackground(Color.red);
		JLabel label2 = new JLabel("Two");
		subPanel2.add(label2);
		
		JPanel subPanel3 = new JPanel();
		subPanel3.setPreferredSize(new Dimension(150, 100));
		subPanel3.setBackground(Color.magenta);
		JLabel label3 = new JLabel("Three");
		subPanel3.add(label3);
		
		JPanel subPanel4 = new JPanel();
		subPanel4.setPreferredSize(new Dimension(150, 100));
		subPanel4.setBackground(Color.yellow);
		JLabel label4 = new JLabel("Four");
		subPanel4.add(label4);
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.blue);
		primary.add(subPanel1);
		primary.add(subPanel2);		
		primary.add(subPanel3);
		primary.add(subPanel4);

		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}

}
