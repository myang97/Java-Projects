import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//This class acts like a calculator, converting units to other units
public class MetricConversions extends JFrame implements ActionListener{
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	JButton B4 = new JButton();
	JButton B5 = new JButton();
	JButton B6 = new JButton();
	JButton B7 = new JButton();

	JTextField T1 = new JTextField();
	JTextField T2 = new JTextField();

	public MetricConversions() {
		super("Imperial to Metric");
		Container container = getContentPane(); 
		setSize(250,350);
		setLayout(new GridLayout(5,1));
		
		//panel1
		JPanel panel01 = new JPanel(new GridLayout(1,0));
		T1.setText("0"); 
		panel01.add(T1);
		
		T2.setText("Answer");
		T2.setBackground(Color.yellow);
		panel01.add(T2);
		container.add(panel01);
		
		//panel2
		JPanel panel02 = new JPanel(new GridLayout(1,0));
		B1.setIcon(new ImageIcon("distance.gif"));
		B1.setText("Feet-M");
		B1.setHorizontalTextPosition(SwingConstants.CENTER);
		B1.setVerticalTextPosition(SwingConstants.BOTTOM);
		B1.setFont(new Font("Arial",Font.PLAIN,10));
		B1.setBackground(Color.lightGray);
		B1.setFocusPainted(false); 
		B1.addActionListener(this);
		panel02.add(B1);

		B2.setIcon(new ImageIcon("distance.gif")); 
		B2.setText("M-Feet");
		B2.setHorizontalTextPosition(SwingConstants.CENTER);
		B2.setVerticalTextPosition(SwingConstants.BOTTOM);
		B2.setFont(new Font("Arial",Font.PLAIN,10));
		B2.setBackground(Color.lightGray);
		B2.setFocusPainted(false); 
		B2.addActionListener(this);
		panel02.add(B2);
		container.add(panel02);

		//panel3
		JPanel panel03 = new JPanel(new GridLayout(1,0));
		B3.setIcon(new ImageIcon("volume.gif")); 
		B3.setText("Gallons-L");
		B3.setHorizontalTextPosition(SwingConstants.CENTER);
		B3.setVerticalTextPosition(SwingConstants.BOTTOM);
		B3.setFont(new Font("Arial",Font.PLAIN,10));
		B3.setBackground(Color.lightGray);
		B3.setFocusPainted(false); 
		B3.addActionListener(this);
		panel03.add(B3);

		B4.setIcon(new ImageIcon("volume.gif")); 
		B4.setText("L-Gallons");
		B4.setHorizontalTextPosition(SwingConstants.CENTER);
		B4.setVerticalTextPosition(SwingConstants.BOTTOM);
		B4.setFont(new Font("Arial",Font.PLAIN,10));
		B4.setBackground(Color.lightGray);
		B4.setFocusPainted(false); 
		B4.addActionListener(this);
		panel03.add(B4);
		container.add(panel03);

		//panel4
		JPanel panel04 = new JPanel(new GridLayout(1,0));
		B5.setIcon(new ImageIcon("weight.gif"));
		B5.setText("Pounds-Kg");
		B5.setHorizontalTextPosition(SwingConstants.CENTER);
		B5.setVerticalTextPosition(SwingConstants.BOTTOM);
		B5.setFont(new Font("Arial",Font.PLAIN,10));
		B5.setBackground(Color.lightGray);
		B5.setFocusPainted(false); 
		B5.addActionListener(this);
		panel04.add(B5);

		B6.setIcon(new ImageIcon("weight.gif")); 
		B6.setText("Kg-Pounds");
		B6.setHorizontalTextPosition(SwingConstants.CENTER);
		B6.setVerticalTextPosition(SwingConstants.BOTTOM);
		B6.setFont(new Font("Arial",Font.PLAIN,10));
		B6.setBackground(Color.lightGray);
		B6.setFocusPainted(false); 
		B6.addActionListener(this);
		panel04.add(B6);
		container.add(panel04);

		//panel5
		JPanel panel05 = new JPanel(new GridLayout(1,0));
		B7.setText("Reset");
		B7.setBackground(Color.lightGray);
		B7.setFocusPainted(false); 
		B7.addActionListener(this);
		panel05.add(B7);

		container.add(panel05);
		setVisible(true);
	}

	//this allows the actions to occur after the push of a button
	public void actionPerformed(ActionEvent e){
		//start converting from feet to meters
		if (e.getSource() == B1){
			double t1 = Double.parseDouble(T1.getText());
			T2.setText("" + (t1 * .3048));
		}
		
		//start converting from meters to feet
		if (e.getSource() == B2){
			double t1 = Double.parseDouble(T1.getText());
			T2.setText("" + (t1 / .3048));

		}
		 
		//start converting from gallons to liters
		if (e.getSource() == B3){
			double t1 = Double.parseDouble(T1.getText());  
			T2.setText("" + (t1 * 3.78));
		}

		//start converting from liters to gallons
		if (e.getSource() == B4){
			double t1 = Double.parseDouble(T1.getText()); 
			T2.setText("" + (t1 / 3.78));
		} 

		//start converting from pounds to kilograms
		if (e.getSource() == B5){
			double t1 = Double.parseDouble(T1.getText()); 
			T2.setText("" + (t1 * 0.454));
		}	 

		//start converting from kilograms to pounds
		if (e.getSource() == B6){
			double t1 = Double.parseDouble(T1.getText()); 
			T2.setText("" + (t1 / 0.454));
		}

		//start clearing number and answer
		if (e.getSource() == B7){
			T1.setText("");
			T2.setText("");
		} 
	}

	public static void main(String args[]) {
		MetricConversions prog = new MetricConversions();
		prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  
}


