import java.awt.event.*;
import java.awt.*;

//This class simulates a game of TicTacToe through the java Applet
public class TicTacToe extends java.applet.Applet implements ActionListener{
	int counter = 1;

	boolean xwinner = false;
	boolean owinner = false;

	TextField tf1 = new TextField (20);
	TextField tf2 = new TextField (20);
	TextField tf3 = new TextField (20);

	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	Button button4 = new Button();
	Button button5 = new Button();
	Button button6 = new Button();
	Button button7 = new Button();
	Button button8 = new Button();
	Button button9 = new Button();

	public void init(){
		GridLayout grid = new GridLayout(4,3);
		setLayout(grid);

		add(tf1);
		add(tf2);
		add(tf3);

		add (button1);
		add (button2);
		add (button3);
		add (button4);
		add (button5);
		add (button6);
		add (button7);
		add (button8);
		add (button9);

		button1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button1.setLabel("-");
		button2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button2.setLabel("-");
		button3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button3.setLabel("-");
		button4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button4.setLabel("-");
		button5.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button5.setLabel("-");
		button6.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button6.setLabel("-");
		button7.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button7.setLabel("-");
		button8.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button8.setLabel("-");
		button9.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		button9.setLabel("-");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);

		tf1.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		tf1.setForeground(Color.blue);
		tf1.setText("X's Turn");
		tf2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		tf2.setText("TIC-TAC-TOE");
		tf3.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		tf3.setText("");
	}
	
	public void actionPerformed (ActionEvent ae){
		if(ae.getSource() == button1){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button1.setForeground(Color.blue);
				button1.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button1.removeActionListener(this);
			}
			else{
				button1.setForeground(Color.red);
				button1.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button1.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button2){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button2.setForeground(Color.blue);
				button2.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button2.removeActionListener(this);
			}
			else{
				button2.setForeground(Color.red);
				button2.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button2.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button3){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button3.setForeground(Color.blue);
				button3.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button3.removeActionListener(this);
			}
			else{
				button3.setForeground(Color.red);
				button3.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button3.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button4){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button4.setForeground(Color.blue);
				button4.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button4.removeActionListener(this);
			}
			else{
				button4.setForeground(Color.red);
				button4.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button4.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button5){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button5.setForeground(Color.blue);
				button5.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button5.removeActionListener(this);
			}
			else{
				button5.setForeground(Color.red);
				button5.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button5.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button6){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button6.setForeground(Color.blue);
				button6.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button6.removeActionListener(this);
			}
			else{
				button6.setForeground(Color.red);
				button6.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button6.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button7){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button7.setForeground(Color.blue);
				button7.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button7.removeActionListener(this);
			}
			else{
				button7.setForeground(Color.red);
				button7.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button7.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button8){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button8.setForeground(Color.blue);
				button8.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button8.removeActionListener(this);
			}
			else{
				button8.setForeground(Color.red);
				button8.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button8.removeActionListener(this);
			}
			counter++;
		}

		if(ae.getSource() == button9){
			if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9){
				button9.setForeground(Color.blue);
				button9.setLabel("X");
				tf1.setForeground(Color.red);
				tf1.setText("O's Turn");
				button9.removeActionListener(this);
			}
			else{
				button9.setForeground(Color.red);
				button9.setLabel("O");
				tf1.setForeground(Color.blue);
				tf1.setText("X's Turn");
				button9.removeActionListener(this);
			}
			counter++;
		}
		if (button1.getLabel().equals("X") && button2.getLabel().equals("X") && button3.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button4.getLabel().equals("X") && button5.getLabel().equals("X") && button6.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button7.getLabel().equals("X") && button8.getLabel().equals("X") && button9.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button1.getLabel().equals("X") && button4.getLabel().equals("X") && button7.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button2.getLabel().equals("X") && button5.getLabel().equals("X") && button8.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button3.getLabel().equals("X") && button6.getLabel().equals("X") && button9.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button1.getLabel().equals("X") && button5.getLabel().equals("X") && button9.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button3.getLabel().equals("X") && button5.getLabel().equals("X") && button7.getLabel().equals("X")){
			boolean xwinner = true;
			tf3.setForeground(Color.blue);
			tf3.setText("X WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}

		if (button1.getLabel().equals("O") && button2.getLabel().equals("O") && button3.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button4.getLabel().equals("O") && button5.getLabel().equals("O") && button6.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button7.getLabel().equals("O") && button8.getLabel().equals("O") && button9.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button1.getLabel().equals("O") && button4.getLabel().equals("O") && button7.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button2.getLabel().equals("O") && button5.getLabel().equals("O") && button8.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button3.getLabel().equals("O") && button6.getLabel().equals("O") && button9.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button1.getLabel().equals("O") && button5.getLabel().equals("O") && button9.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}
		if (button3.getLabel().equals("O") && button5.getLabel().equals("O") && button7.getLabel().equals("O")){
			boolean owinner = true;
			tf3.setForeground(Color.red);
			tf3.setText("O WINS!");
			button1.removeActionListener(this);
			button2.removeActionListener(this);
			button3.removeActionListener(this);
			button4.removeActionListener(this);
			button5.removeActionListener(this);
			button6.removeActionListener(this);
			button7.removeActionListener(this);
			button8.removeActionListener(this);
			button9.removeActionListener(this);
			tf1.setText(" ");
		}

		if (counter == 10 && !(tf3.getText().equals("X WINS!")) && !(tf3.getText().equals("O WINS!"))){
			tf3.setForeground(Color.green);
			tf3.setText("CAT WINS.");
			tf1.setText(" ");
		}
	}
}


