import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//This class obtains three integers and finds the average of them
public class AverageCalculator extends JFrame implements ActionListener{
	JLabel L1 = new JLabel("",JLabel.CENTER);

	JButton B1 = new JButton();
	JButton B2 = new JButton();

	JTextField T1 = new JTextField();
	JTextField T2 = new JTextField();
	JTextField T3 = new JTextField();
	JTextField T4 = new JTextField();


	public AverageCalculator() {
		super("Average Calculator");
		Container container = getContentPane(); 
		setSize(300,150);
		setLayout(new GridLayout(3,1));

		//panel1
		JPanel panel01 = new JPanel(new GridLayout(1,5));

		T1.setText("0"); 
		panel01.add(T1);
		
		T2.setText("0"); 
		panel01.add(T2);
		T3.setText("0"); 
		
		panel01.add(T3);
		T4.setText("answer"); 
		T4.setBackground(Color.gray);
		panel01.add(T4);

		L1.setIcon(new ImageIcon("calculator.gif")); 
		panel01.add(L1);

		container.add(panel01);

		//panel2
		JPanel panel02 = new JPanel(new GridLayout(1,1));
		B1.setIcon(new ImageIcon("calculatorButton.gif"));
		B1.setText("Average");
		B1.setHorizontalTextPosition(SwingConstants.RIGHT);
		B1.setVerticalTextPosition(SwingConstants.CENTER);
		B1.setFocusPainted(false); 
		B1.addActionListener(this);
		panel02.add(B1);
		container.add(panel02);

		//panel3
		JPanel panel03 = new JPanel(new GridLayout(1,1));

		B2.setText("Clear");
		B2.setFocusPainted(false); 
		B2.addActionListener(this);
		panel03.add(B2);
		container.add(panel03);
		
		setVisible(true);
	}

	//allows buttons to perform actions when pressed
	public void actionPerformed(ActionEvent e){
		//start calculating the average
		if (e.getSource() == B1){
			int t1 = Integer.parseInt(T1.getText()); 
			int t2 = Integer.parseInt(T2.getText()); 
			int t3 = Integer.parseInt(T3.getText()); 
			T4.setText("" + ((t1 + t2 + t3 * 1.0)/3)); 
		} 

		//start clearing everything on the textfields
		if (e.getSource() == B2){
			T1.setText("");
			T2.setText("");
			T3.setText("");
			T4.setText("");
		}
	}

	public static void main(String args[]) {
		AverageCalculator prog = new AverageCalculator();
		prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  
}



