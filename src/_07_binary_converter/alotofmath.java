package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class alotofmath implements ActionListener {
	JPanel jp = new JPanel();
	JFrame jf = new JFrame();
	JButton jb = new JButton();
	JLabel jl = new JLabel();

	JTextField answer = new JTextField(20);
	public void start() {
		

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1000, 100);
		jf.add(jp);
		jp.add(answer);
		jf.setTitle("Convert a lot of math to a lot of words");
		jp.add(jb);
		jb.setText("Magic number converter thingy");
		jb.addActionListener(this);
		jp.add(jl);

	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
String hi = answer.getText();
String hoi =convert(hi);
jl.setText(hoi);

	}

}
