import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	JButton btn = new JButton("show");
	JTextField tf = new JTextField(20);
	public MyFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		this.add(btn);
		this.add(tf);
		
		btn.addActionListener(new ActionButton());
	}
	
	class ActionButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf.getText());
			
		}
		
	}
}
