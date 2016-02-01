import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//This class is a simple adding and subtracting calculator on a single digit
public class AddSubtractCalculator extends JFrame implements ActionListener{
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	JButton B4 = new JButton();
	JButton B5 = new JButton();
	JButton B6 = new JButton();
	JButton B7 = new JButton();
	JButton B8 = new JButton();
	JButton B9 = new JButton();
	JButton B10 = new JButton();
	JButton B11 = new JButton();
	JButton B12 = new JButton();
	JButton B13 = new JButton();
	JButton B14 = new JButton();
	JButton B15 = new JButton();
	JButton B16 = new JButton();
	JButton B17 = new JButton();
	JButton B18 = new JButton();
	JButton B19 = new JButton();
	JButton B20 = new JButton();
	JButton B21 = new JButton();

	JTextField T1 = new JTextField("");


	public AddSubtractCalculator() {
		super("Incrementer / Decrementer");
		Container container = getContentPane(); 
		setSize(420,250);
		setLayout(new GridLayout(5,1));

		//start panel1 here and add the answer/text box, clear button, +.1 and -.1
		JPanel panel01 = new JPanel(new GridLayout(1,4));

		T1.setText("0.0");
		panel01.add(T1);    

		B21.setText("Clear"); 
		B21.setBackground(Color.red);
		B21.setFont(new Font("Arial",Font.PLAIN,12));
		B21.setFocusPainted(false); 
		B21.addActionListener(this);
		panel01.add(B21);

		B19.setText("+.1"); 
		B19.setBackground(Color.white);
		B19.setFont(new Font("Arial",Font.PLAIN,8));
		B19.setFocusPainted(false); 
		B19.addActionListener(this);
		panel01.add(B19);

		B20.setText("-.1"); 
		B20.setBackground(Color.white);
		B20.setFont(new Font("Arial",Font.PLAIN,8));
		B20.setFocusPainted(false); 
		B20.addActionListener(this);
		panel01.add(B20);

		container.add(panel01);

		//start panel 2 here and add the numbers 1,2,3,4,5 //
		JPanel panel02 = new JPanel(new GridLayout(1,5));

		B1.setText("1");
		B1.setBackground(Color.black);
		B1.setForeground(Color.white);
		B1.setFont(new Font("Arial",Font.BOLD,12));
		B1.setFocusPainted(false); 
		B1.addActionListener(this);
		panel02.add(B1);

		B2.setText("2"); 
		B2.setBackground(Color.black);
		B2.setForeground(Color.white);
		B2.setFont(new Font("Arial",Font.BOLD,12));
		B2.setFocusPainted(false); 
		B2.addActionListener(this);
		panel02.add(B2);

		B3.setText("3"); 
		B3.setBackground(Color.black);
		B3.setForeground(Color.white);
		B3.setFont(new Font("Arial",Font.BOLD,12));
		B3.setFocusPainted(false); 
		B3.addActionListener(this);
		panel02.add(B3);

		B8.setText("4"); 
		B8.setBackground(Color.black);
		B8.setForeground(Color.white);
		B8.setFont(new Font("Arial",Font.BOLD,12));
		B8.setFocusPainted(false); 
		B8.addActionListener(this);
		panel02.add(B8);

		B9.setText("5"); 
		B9.setBackground(Color.black);
		B9.setForeground(Color.white);
		B9.setFont(new Font("Arial",Font.BOLD,12));
		B9.setFocusPainted(false); 
		B9.addActionListener(this);
		panel02.add(B9);


		container.add(panel02);

		//start panel 3 here and add the numbers 6,7,8,9,0
		JPanel panel03 = new JPanel(new GridLayout(1,5));

		B10.setText("6"); 
		B10.setBackground(Color.black);
		B10.setForeground(Color.white);
		B10.setFont(new Font("Arial",Font.BOLD,12));
		B10.setFocusPainted(false); 
		B10.addActionListener(this);
		panel03.add(B10);

		B15.setText("7"); 
		B15.setBackground(Color.black);
		B15.setForeground(Color.white);
		B15.setFont(new Font("Arial",Font.BOLD,12));
		B15.setFocusPainted(false); 
		B15.addActionListener(this);
		panel03.add(B15);

		B16.setText("8"); 
		B16.setBackground(Color.black);
		B16.setForeground(Color.white);
		B16.setFont(new Font("Arial",Font.BOLD,12));
		B16.setFocusPainted(false); 
		B16.addActionListener(this);
		panel03.add(B16);

		B17.setText("9"); 
		B17.setBackground(Color.black);
		B17.setForeground(Color.white);
		B17.setFont(new Font("Arial",Font.BOLD,12));
		B17.setFocusPainted(false); 
		B17.addActionListener(this);
		panel03.add(B17);

		B18.setText("0"); 
		B18.setBackground(Color.black);
		B18.setForeground(Color.white);
		B18.setFont(new Font("Arial",Font.BOLD,12));
		B18.setFocusPainted(false); 
		B18.addActionListener(this);
		panel03.add(B18);

		container.add(panel03);

		//start panel 4 here and add the buttons -1,-10,-100,-1000
		JPanel panel04 = new JPanel(new GridLayout(1,4));

		B4.setText("+1"); 
		B4.setBackground(Color.white);
		B4.setFont(new Font("Arial",Font.PLAIN,8));
		B4.setFocusPainted(false); 
		B4.addActionListener(this);
		panel04.add(B4);

		B5.setText("+10"); 
		B5.setBackground(Color.white);
		B5.setFont(new Font("Arial",Font.PLAIN,8));
		B5.setFocusPainted(false); 
		B5.addActionListener(this);
		panel04.add(B5);

		B6.setText("+100"); 
		B6.setBackground(Color.white);
		B6.setFont(new Font("Arial",Font.PLAIN,8));
		B6.setFocusPainted(false); 
		B6.addActionListener(this);
		panel04.add(B6);

		B7.setText("+1000"); 
		B7.setBackground(Color.white);
		B7.setFont(new Font("Arial",Font.PLAIN,8));
		B7.setFocusPainted(false); 
		B7.addActionListener(this);
		panel04.add(B7);

		container.add(panel04);

		//start panel 5 here and add the buttons +1,+10,+100,+1000
		JPanel panel05 = new JPanel(new GridLayout(1,4));

		B11.setText("-1");
		B11.setBackground(Color.white);
		B11.setFont(new Font("Arial",Font.PLAIN,8));
		B11.setFocusPainted(false); 
		B11.addActionListener(this);
		panel05.add(B11);

		B12.setText("-10"); 
		B12.setBackground(Color.white);
		B12.setFont(new Font("Arial",Font.PLAIN,8));
		B12.setFocusPainted(false); 
		B12.addActionListener(this);
		panel05.add(B12);

		B13.setText("-100"); 
		B13.setBackground(Color.white);
		B13.setFont(new Font("Arial",Font.PLAIN,8));
		B13.setFocusPainted(false); 
		B13.addActionListener(this);
		panel05.add(B13);

		B14.setText("-1000"); 
		B14.setBackground(Color.white);
		B14.setFont(new Font("Arial",Font.PLAIN,8));
		B14.setFocusPainted(false); 
		B14.addActionListener(this);
		panel05.add(B14);

		container.add(panel05);

		setVisible(true);
	}

	/* activate each button here */
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == B1){
			T1.setText("1.0"); 
		} 
		if (e.getSource() == B2){
			T1.setText("2.0"); 
		}
		if (e.getSource() == B3){
			T1.setText("3.0"); 
		}
		if (e.getSource() == B8){
			T1.setText("4.0"); 
		}
		if (e.getSource() == B9){
			T1.setText("5.0"); 
		}
		if (e.getSource() == B10){
			T1.setText("6.0"); 
		}
		if (e.getSource() == B15){
			T1.setText("7.0"); 
		}
		if (e.getSource() == B16){
			T1.setText("8.0"); 
		}
		if (e.getSource() == B17){
			T1.setText("9.0"); 
		}
		if (e.getSource() == B18){
			T1.setText("0.0"); 
		}

		//add 1 to the answer box
		if (e.getSource() == B4){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 + 1 ));
		}

		//add 10 to the answer box
		if (e.getSource() == B5){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 + 10 ));
		}

		//add 100 to the answer box
		if (e.getSource() == B6){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 + 100 ));
		}

		//add 1000 to the answer box
		if (e.getSource() == B7){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 + 1000 ));
		}

		//subtract 1 from the answer box
		if (e.getSource() == B11){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 - 1 ));
		}

		//subtract 10 from the answer box
		if (e.getSource() == B12){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 - 10 ));
		}

		//subtract 100 from the answer box
		if (e.getSource() == B13){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 - 100 ));
		}

		//subtract 1000 from the answer box
		if (e.getSource() == B14){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 - 1000 ));
		} 

		//add .1 to the answer box
		if (e.getSource() == B19){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 + .1 ));
		}

		//subtract .1 from the answer box
		if (e.getSource() == B20){
			double t1 = Double.parseDouble(T1.getText()); 
			T1.setText("" + (t1 - .1 ));
		}

		//clear the answer box and reset it to 0.0
		if (e.getSource() == B21){
			T1.setText("0.0");
		}	  
	}

	public static void main(String args[]) {
		AddSubtractCalculator prog = new AddSubtractCalculator();
		prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  
}


