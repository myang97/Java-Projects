import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

//Uses JFrame to simulate a ConnectFour Game
public class ConnectFour extends JFrame implements ActionListener, ItemListener{
	private String[] list = {"Click to drop Button", "CONNECT FOUR", "Who goes first?", "Click this to decide", "Click to see results!"};
	private JPanel mainPanel;
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;
	private JLabel Label4;
	private JLabel Label5;
	private JLabel Label6;
	private JLabel Label7;
	private JLabel Label8;
	private JLabel Label9;
	private JLabel Label10;
	private JLabel Label11;
	private JLabel Label12;
	private JLabel Label13;
	private JLabel Label14;
	private JLabel Label15;
	private JLabel Label16;
	private JLabel Label17;
	private JLabel Label18;
	private JLabel Label19;
	private JLabel Label20;
	private JLabel Label21;
	private JLabel Label22;
	private JLabel Label23;
	private JLabel Label24;
	private JLabel Label25;
	private JLabel Label26;
	private JLabel Label27;
	private JLabel Label28;
	private JLabel Label29;
	private JLabel Label30;
	private JLabel Label31;
	private JLabel Label32;
	private JLabel Label33;
	private JLabel Label34;
	private JLabel Label35;
	private JLabel Label36;
	private JLabel Label37;
	private JLabel Label38;
	private JLabel Label39;
	private JLabel Label40;
	private JLabel Label41;
	private JLabel Label42;

	private JButton button1, button2, button3, button4, button5, button6, button7;

	private ImageIcon bluepiece = new ImageIcon("blueConnectFour.jpg");
	private ImageIcon redpiece = new ImageIcon("redConnectFour.jpg");
	private ImageIcon emptypiece = new ImageIcon("emptyConnectFour.jpg");

	private int counter = 0;
	private int counter1 = 0;
	private int counter2 = 0;
	private int counter3 = 0;
	private int counter4 = 0;
	private int counter5 = 0;
	private int counter6 = 0;
	private int counter7 = 0;

	private JLabel labelA, labelB;
	private JTextField fieldA, fieldB, fieldC;
	private JButton buttonA, buttonB;
	private boolean fill1 = false, fill2 = false, fill3 = false, fill4 = false, fill5 = false, fill6 = false, fill7 = false, fill8 = false, fill9 = false, fill10 = false;
	private boolean fill11 = false, fill12 = false, fill13 = false, fill14 = false, fill15 = false, fill16 = false, fill17 = false, fill18 = false, fill19 = false, fill20 = false;
	private boolean fill21 = false, fill22 = false, fill23 = false, fill24 = false, fill25 = false, fill26 = false, fill27 = false, fill28 = false, fill29 = false, fill30 = false;
	private boolean fill31= false, fill32 = false, fill33 = false, fill34 = false, fill35 = false, fill36 = false, fill37 = false, fill38 = false, fill39 = false, fill40 = false, fill41 = false, fill42 = false;
	private boolean color = false;

	private boolean red1 = false, red2 = false, red3 = false, red4 = false, red5 = false, red6 = false, red7 = false, red8 = false, red9 = false, red10 = false;
	private boolean red11 = false, red12 = false, red13 = false, red14 = false, red15 = false, red16 = false, red17 = false, red18 = false, red19 = false, red20 = false;
	private boolean red21 = false, red22 = false, red23 = false, red24 = false, red25 = false, red26 = false, red27 = false, red28 = false, red29 = false, red30 = false;
	private boolean red31= false, red32 = false, red33 = false, red34 = false, red35 = false, red36 = false, red37 = false, red38 = false, red39 = false, red40 = false, red41 = false, red42 = false;

	private boolean blue1 = false, blue2 = false, blue3 = false, blue4 = false, blue5 = false, blue6 = false, blue7 = false, blue8 = false, blue9 = false, blue10 = false;
	private boolean blue11 = false, blue12 = false, blue13 = false, blue14 = false, blue15 = false, blue16 = false, blue17 = false, blue18 = false, blue19 = false, blue20 = false;
	private boolean blue21 = false, blue22 = false, blue23 = false, blue24 = false, blue25 = false, blue26 = false, blue27 = false, blue28 = false, blue29 = false, blue30 = false;
	private boolean blue31= false, blue32 = false, blue33 = false, blue34 = false, blue35 = false, blue36 = false, blue37 = false, blue38 = false, blue39 = false, blue40 = false, blue41 = false, blue42 = false;

	public static void main(String[] args)  throws IOException{
		JFrame frame = new ConnectFour();

		frame.pack();
		frame.setVisible(true);

		WindowListener w = new WindowAdapter(){
			public void windowClosing(WindowEvent e)	{
				System.exit(0);
			}
		};

		frame.addWindowListener(w);
	}

	ConnectFour() {   //constructor{
		super("CONNECT FOUR");

		//JPanel(s)
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(8,7));
		mainPanel.setPreferredSize(new Dimension(1200,950));

		button1 = new JButton();
		button1.setLayout(new GridLayout(1,1));
		button1.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		button2 = new JButton();
		button2.setLayout(new GridLayout(1,1));
		button2.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		button3 = new JButton();
		button3.setLayout(new GridLayout(1,1));
		button3.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		button4 = new JButton();
		button4.setLayout(new GridLayout(1,1));
		button4.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		button5 = new JButton();
		button5.setLayout(new GridLayout(1,1));
		button5.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		button6 = new JButton();
		button6.setLayout(new GridLayout(1,1));
		button6.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		button7 = new JButton();
		button7.setLayout(new GridLayout(1,1));
		button7.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		button1 = new JButton();
		button1.setLayout(new GridLayout(1,1));
		button1.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));


		button1 = new JButton(list[0]);
		button2 = new JButton(list[0]);
		button3 = new JButton(list[0]);
		button4 = new JButton(list[0]);
		button5 = new JButton(list[0]);
		button6 = new JButton(list[0]);
		button7 = new JButton(list[0]);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);


		Label1 = new JLabel();
		Label1.setLayout(new GridLayout(1,1));
		Label1.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label2 = new JLabel();
		Label2.setLayout(new GridLayout(1,1));
		Label2.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label3 = new JLabel();
		Label3.setLayout(new GridLayout(1,1));
		Label3.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label4 = new JLabel();
		Label4.setLayout(new GridLayout(1,1));
		Label4.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label5 = new JLabel();
		Label5.setLayout(new GridLayout(1,1));
		Label5.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label6 = new JLabel();
		Label6.setLayout(new GridLayout(1,1));
		Label6.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label7 = new JLabel();
		Label7.setLayout(new GridLayout(1,1));
		Label7.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label8 = new JLabel();
		Label8.setLayout(new GridLayout(1,1));
		Label8.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label9 = new JLabel();
		Label9.setLayout(new GridLayout(1,1));
		Label9.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label10 = new JLabel();
		Label10.setLayout(new GridLayout(1,1));
		Label10.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label11 = new JLabel();
		Label11.setLayout(new GridLayout(1,1));
		Label11.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label12 = new JLabel();
		Label12.setLayout(new GridLayout(1,1));
		Label12.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label13 = new JLabel();
		Label13.setLayout(new GridLayout(1,1));
		Label13.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label14 = new JLabel();
		Label14.setLayout(new GridLayout(1,1));
		Label14.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label15 = new JLabel();
		Label15.setLayout(new GridLayout(1,1));
		Label15.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label16 = new JLabel();
		Label16.setLayout(new GridLayout(1,1));
		Label16.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label17 = new JLabel();
		Label17.setLayout(new GridLayout(1,1));
		Label17.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label18 = new JLabel();
		Label18.setLayout(new GridLayout(1,1));
		Label18.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label19 = new JLabel();
		Label19.setLayout(new GridLayout(1,1));
		Label19.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label20 = new JLabel();
		Label20.setLayout(new GridLayout(1,1));
		Label20.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label21 = new JLabel();
		Label21.setLayout(new GridLayout(1,1));
		Label21.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label22 = new JLabel();
		Label22.setLayout(new GridLayout(1,1));
		Label22.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label23 = new JLabel();
		Label23.setLayout(new GridLayout(1,1));
		Label23.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label24 = new JLabel();
		Label24.setLayout(new GridLayout(1,1));
		Label24.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label25 = new JLabel();
		Label25.setLayout(new GridLayout(1,1));
		Label25.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label26 = new JLabel();
		Label26.setLayout(new GridLayout(1,1));
		Label26.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label27 = new JLabel();
		Label27.setLayout(new GridLayout(1,1));
		Label27.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label28 = new JLabel();
		Label28.setLayout(new GridLayout(1,1));
		Label28.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label29 = new JLabel();
		Label29.setLayout(new GridLayout(1,1));
		Label29.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label30 = new JLabel();
		Label30.setLayout(new GridLayout(1,1));
		Label30.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label31 = new JLabel();
		Label31.setLayout(new GridLayout(1,1));
		Label31.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label32 = new JLabel();
		Label32.setLayout(new GridLayout(1,1));
		Label32.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label33 = new JLabel();
		Label33.setLayout(new GridLayout(1,1));
		Label33.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label34 = new JLabel();
		Label34.setLayout(new GridLayout(1,1));
		Label34.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label35 = new JLabel();
		Label35.setLayout(new GridLayout(1,1));
		Label35.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label36 = new JLabel();
		Label36.setLayout(new GridLayout(1,1));
		Label36.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label37 = new JLabel();
		Label37.setLayout(new GridLayout(1,1));
		Label37.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label38 = new JLabel();
		Label38.setLayout(new GridLayout(1,1));
		Label38.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label39 = new JLabel();
		Label39.setLayout(new GridLayout(1,1));
		Label39.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label40 = new JLabel();
		Label40.setLayout(new GridLayout(1,1));
		Label40.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label41 = new JLabel();
		Label41.setLayout(new GridLayout(1,1));
		Label41.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));
		Label42 = new JLabel();
		Label42.setLayout(new GridLayout(1,1));
		Label42.setBorder(BorderFactory.createMatteBorder
		                    (5, 5, 5, 5, Color.red));

		Label1 = new JLabel(emptypiece);
		Label2 = new JLabel(emptypiece);
		Label3 = new JLabel(emptypiece);
		Label4 = new JLabel(emptypiece);
		Label5 = new JLabel(emptypiece);
		Label6 = new JLabel(emptypiece);
		Label7 = new JLabel(emptypiece);
		Label8 = new JLabel(emptypiece);
		Label9 = new JLabel(emptypiece);
		Label10 = new JLabel(emptypiece);
		Label11 = new JLabel(emptypiece);
		Label12 = new JLabel(emptypiece);
		Label13 = new JLabel(emptypiece);
		Label14 = new JLabel(emptypiece);
		Label15 = new JLabel(emptypiece);
		Label16 = new JLabel(emptypiece);
		Label17 = new JLabel(emptypiece);
		Label18 = new JLabel(emptypiece);
		Label19 = new JLabel(emptypiece);
		Label20 = new JLabel(emptypiece);
		Label21 = new JLabel(emptypiece);
		Label22 = new JLabel(emptypiece);
		Label23 = new JLabel(emptypiece);
		Label24 = new JLabel(emptypiece);
		Label25 = new JLabel(emptypiece);
		Label26 = new JLabel(emptypiece);
		Label27 = new JLabel(emptypiece);
		Label28 = new JLabel(emptypiece);
		Label29 = new JLabel(emptypiece);
		Label30 = new JLabel(emptypiece);
		Label31 = new JLabel(emptypiece);
		Label32 = new JLabel(emptypiece);
		Label33 = new JLabel(emptypiece);
		Label34 = new JLabel(emptypiece);
		Label35 = new JLabel(emptypiece);
		Label36 = new JLabel(emptypiece);
		Label37 = new JLabel(emptypiece);
		Label38 = new JLabel(emptypiece);
		Label39 = new JLabel(emptypiece);
		Label40 = new JLabel(emptypiece);
		Label41 = new JLabel(emptypiece);
		Label42 = new JLabel(emptypiece);


		labelA = new JLabel(list[1],  JLabel.CENTER);
		labelB = new JLabel(list[2],  JLabel.CENTER);
		buttonA = new JButton(list[3]);
		buttonA.addActionListener(this);
		fieldA = new JTextField();
		fieldB = new JTextField();
		fieldC = new JTextField();
		buttonB = new JButton(list[4]);
		buttonB.addActionListener(this);


		button1.removeActionListener(this);
		button2.removeActionListener(this);
		button3.removeActionListener(this);
		button4.removeActionListener(this);
		button5.removeActionListener(this);
		button6.removeActionListener(this);
		button7.removeActionListener(this);

		//
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		mainPanel.add(button4);
		mainPanel.add(button5);
		mainPanel.add(button6);
		mainPanel.add(button7);
		mainPanel.add(Label1);
		mainPanel.add(Label2);
		mainPanel.add(Label3);
		mainPanel.add(Label4);
		mainPanel.add(Label5);
		mainPanel.add(Label6);
		mainPanel.add(Label7);
		mainPanel.add(Label8);
		mainPanel.add(Label9);
		mainPanel.add(Label10);
		mainPanel.add(Label11);
		mainPanel.add(Label12);
		mainPanel.add(Label13);
		mainPanel.add(Label14);
		mainPanel.add(Label15);
		mainPanel.add(Label16);
		mainPanel.add(Label17);
		mainPanel.add(Label18);
		mainPanel.add(Label19);
		mainPanel.add(Label20);
		mainPanel.add(Label21);
		mainPanel.add(Label22);
		mainPanel.add(Label23);
		mainPanel.add(Label24);
		mainPanel.add(Label25);
		mainPanel.add(Label26);
		mainPanel.add(Label27);
		mainPanel.add(Label28);
		mainPanel.add(Label29);
		mainPanel.add(Label30);
		mainPanel.add(Label31);
		mainPanel.add(Label32);
		mainPanel.add(Label33);
		mainPanel.add(Label34);
		mainPanel.add(Label35);
		mainPanel.add(Label36);
		mainPanel.add(Label37);
		mainPanel.add(Label38);
		mainPanel.add(Label39);
		mainPanel.add(Label40);
		mainPanel.add(Label41);
		mainPanel.add(Label42);

		mainPanel.add(labelA);
		mainPanel.add(labelB);
		mainPanel.add(buttonA);
		mainPanel.add(fieldA);
		mainPanel.add(fieldB);
		mainPanel.add(fieldC);
		mainPanel.add(buttonB);
		setContentPane(mainPanel);

	}

	public void itemStateChanged(ItemEvent e){

	}
	
	//all of these buttons will create actions
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == buttonB){
			try{
				BufferedWriter out = new BufferedWriter(new FileWriter("Connect4Game.txt"));
				out.write("CONNECT FOUR");
				out.newLine();
				out.write("     " + fieldA.getText());
				out.newLine();
				out.newLine();
				out.write("Total number pieces played before winner was declared: ");
				out.newLine();
				out.newLine();
				out.write(fieldB.getText());
				out.close();
			}
			catch(IOException ae) {}
		}

		if(e.getSource() == buttonA){
			Random rand = new Random();
			int randNum = rand.nextInt(2)+1;

			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			button5.addActionListener(this);
			button6.addActionListener(this);
			button7.addActionListener(this);


			if(randNum == 1){
				fieldA.setText("          BLUE GOES FIRST");
				color = true;
				buttonA.removeActionListener(this);	
			}
			if(randNum == 2){
				fieldA.setText("           RED GOES FIRST");
				color = false;
				buttonA.removeActionListener(this);
			}
		}

		if(e.getSource() == button1){
			fieldA.setText("          ");
			if(counter1 < 6){
				counter1++;
			}
			else{
				button1.removeActionListener(this);
			}
			if(color == true){
				if(fill36 == false){
					Label36.setIcon(bluepiece);
					fill36 = true;
					color = false;
					red36 = false;
					blue36 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill29 == false){
					Label29.setIcon(bluepiece);
					fill29 = true;
					color = false;
					red29 = false;
					blue29 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill22 == false){
					Label22.setIcon(bluepiece);
					fill22 = true;
					color = false;
					red22 = false;
					blue22 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill15 == false){
					Label15.setIcon(bluepiece);
					fill15 = true;
					color = false;
					red15 = false;
					blue15 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill8 == false){
					Label8.setIcon(bluepiece);
					fill8 = true;
					color = false;
					red8 = false;
					blue8 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill1 == false){
					Label1.setIcon(bluepiece);
					fill1 = true;
					color = false;
					red11 = false;
					blue11 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				if((blue36==true && blue37==true && blue38==true && blue39==true) ||
					    (blue37==true && blue38==true && blue39==true && blue40==true) ||
						    (blue38==true && blue39==true && blue40==true && blue41==true) ||
							    (blue39==true && blue40==true && blue41==true && blue42==true) ||
					(blue29==true && blue30==true && blue31==true && blue32==true) ||
						(blue30==true && blue31==true && blue32==true && blue33==true) ||
							(blue31==true && blue32==true && blue33==true && blue34==true) ||
								(blue32==true && blue33==true && blue34==true && blue35==true) ||
					(blue22==true && blue23==true && blue24==true && blue25==true) ||
						(blue23==true && blue24==true && blue25==true && blue26==true) ||
							(blue24==true && blue25==true && blue26==true && blue27==true) ||
								(blue25==true && blue26==true && blue27==true && blue28==true) ||
					(blue15==true && blue16==true && blue17==true && blue18==true) ||
						(blue16==true && blue17==true && blue18==true && blue19==true) ||
							(blue17==true && blue18==true && blue19==true && blue20==true) ||
								(blue18==true && blue19==true && blue20==true && blue21==true) ||
					(blue8==true && blue9==true && blue10==true && blue11==true) ||
						(blue9==true && blue10==true && blue11==true && blue12==true) ||
							(blue10==true && blue11==true && blue12==true && blue13==true) ||
								(blue11==true && blue12==true && blue13==true && blue14==true) ||
					(blue1==true && blue2==true && blue3==true && blue4==true) ||
						(blue2==true && blue3==true && blue4==true && blue5==true) ||
							(blue3==true && blue4==true && blue5==true && blue6==true) ||
								(blue4==true && blue5==true && blue6==true && blue7==true) ||
					//
					(blue1==true && blue8==true && blue15==true && blue22==true) ||
						(blue8==true && blue15==true && blue22==true && blue29==true) ||
							(blue15==true && blue22==true && blue29==true && blue36==true) ||
					(blue2==true && blue9==true && blue16==true && blue23==true) ||
						(blue9==true && blue16==true && blue23==true && blue30==true) ||
							(blue16==true && blue23==true && blue30==true && blue37==true) ||
					(blue3==true && blue10==true && blue17==true && blue24==true) ||
						(blue10==true && blue17==true && blue24==true && blue31==true) ||
							(blue17==true && blue24==true && blue31==true && blue38==true) ||
					(blue4==true && blue11==true && blue18==true && blue25==true) ||
						(blue11==true && blue18==true && blue25==true && blue32==true) ||
							(blue18==true && blue25==true && blue32==true && blue39==true) ||
					(blue5==true && blue12==true && blue19==true && blue26==true) ||
						(blue12==true && blue19==true && blue26==true && blue33==true) ||
							(blue19==true && blue26==true && blue33==true && blue40==true) ||
					(blue6==true && blue13==true && blue20==true && blue27==true) ||
						(blue13==true && blue20==true && blue27==true && blue34==true) ||
							(blue20==true && blue27==true && blue34==true && blue41==true) ||
					(blue7==true && blue14==true && blue21==true && blue28==true) ||
						(blue14==true && blue21==true && blue28==true && blue35==true) ||
							(blue21==true && blue28==true && blue35==true && blue42==true) ||
					//
					(blue22==true && blue16==true && blue10==true && blue4==true) ||
						(blue23==true && blue17==true && blue11==true && blue5==true) ||
							(blue24==true && blue18==true && blue12==true && blue6==true) ||
								(blue25==true && blue19==true && blue13==true && blue7==true) ||
					(blue29==true && blue23==true && blue17==true && blue11==true) ||
						(blue30==true && blue24==true && blue18==true && blue12==true) ||
							(blue31==true && blue25==true && blue19==true && blue13==true) ||
								(blue32==true && blue26==true && blue20==true && blue14==true) ||
					(blue36==true && blue30==true && blue24==true && blue18==true) ||
						(blue37==true && blue31==true && blue25==true && blue19==true) ||
							(blue38==true && blue32==true && blue26==true && blue20==true) ||
								(blue39==true && blue33==true && blue27==true && blue21==true) ||
					//
					(blue42==true && blue34==true && blue26==true && blue18==true) ||
						(blue41==true && blue33==true && blue25==true && blue17==true) ||
							(blue40==true && blue32==true && blue24==true && blue16==true) ||
								(blue39==true && blue31==true && blue23==true && blue15==true) ||
					(blue35==true && blue27==true && blue19==true && blue11==true) ||
						(blue34==true && blue26==true && blue18==true && blue10==true) ||
							(blue33==true && blue25==true && blue17==true && blue9==true) ||
								(blue32==true && blue24==true && blue16==true && blue8==true) ||
					(blue28==true && blue20==true && blue12==true && blue4==true) ||
						(blue27==true && blue19==true && blue11==true && blue3==true) ||
							(blue26==true && blue18==true && blue10==true && blue2==true) ||
								(blue25==true && blue17==true && blue9==true && blue1==true)){
					counter = counter + 1;
					fieldA.setText("                 BLUE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter1 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
			else{
				if(fill36 == false){
					Label36.setIcon(redpiece);
					fill36 = true;
					color = true;
					red36 = true;
					blue36 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill29 == false){
					Label29.setIcon(redpiece);
					fill29 = true;
					color = true;
					red29 = true;
					blue29 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill22 == false){
					Label22.setIcon(redpiece);
					fill22 = true;
					color = true;
					red22 = true;
					blue22 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill15== false){
					Label15.setIcon(redpiece);
					fill15 = true;
					color = true;
					red15 = true;
					blue15 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill8 == false){
					Label8.setIcon(redpiece);
					fill8 = true;
					color = true;
					red8 = true;
					blue8 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill1 == false){
					Label1.setIcon(redpiece);
					fill1 = true;
					color = true;
					red1 = true;
					blue1 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				if((red36==true && red37==true && red38==true && red39==true) ||
					    (red37==true && red38==true && red39==true && red40==true) ||
						    (red38==true && red39==true && red40==true && red41==true) ||
							    (red39==true && red40==true && red41==true && red42==true) ||
					(red29==true && red30==true && red31==true && red32==true) ||
						(red30==true && red31==true && red32==true && red33==true) ||
							(red31==true && red32==true && red33==true && red34==true) ||
								(red32==true && red33==true && red34==true && red35==true) ||
					(red22==true && red23==true && red24==true && red25==true) ||
						(red23==true && red24==true && red25==true && red26==true) ||
							(red24==true && red25==true && red26==true && red27==true) ||
								(red25==true && red26==true && red27==true && red28==true) ||
					(red15==true && red16==true && red17==true && red18==true) ||
						(red16==true && red17==true && red18==true && red19==true) ||
							(red17==true && red18==true && red19==true && red20==true) ||
								(red18==true && red19==true && red20==true && red21==true) ||
					(red8==true && red9==true && red10==true && red11==true) ||
						(red9==true && red10==true && red11==true && red12==true) ||
							(red10==true && red11==true && red12==true && red13==true) ||
								(red11==true && red12==true && red13==true && red14==true) ||
					(red1==true && red2==true && red3==true && red4==true) ||
						(red2==true && red3==true && red4==true && red5==true) ||
							(red3==true && red4==true && red5==true && red6==true) ||
								(red4==true && red5==true && red6==true && red7==true) ||
					//
					(red1==true && red8==true && red15==true && red22==true) ||
						(red8==true && red15==true && red22==true && red29==true) ||
							(red15==true && red22==true && red29==true && red36==true) ||
					(red2==true && red9==true && red16==true && red23==true) ||
						(red9==true && red16==true && red23==true && red30==true) ||
							(red16==true && red23==true && red30==true && red37==true) ||
					(red3==true && red10==true && red17==true && red24==true) ||
						(red10==true && red17==true && red24==true && red31==true) ||
							(red17==true && red24==true && red31==true && red38==true) ||
					(red4==true && red11==true && red18==true && red25==true) ||
						(red11==true && red18==true && red25==true && red32==true) ||
							(red18==true && red25==true && red32==true && red39==true) ||
					(red5==true && red12==true && red19==true && red26==true) ||
						(red12==true && red19==true && red26==true && red33==true) ||
							(red19==true && red26==true && red33==true && red40==true) ||
					(red6==true && red13==true && red20==true && red27==true) ||
						(red13==true && red20==true && red27==true && red34==true) ||
							(red20==true && red27==true && red34==true && red41==true) ||
					(red7==true && red14==true && red21==true && red28==true) ||
						(red14==true && red21==true && red28==true && red35==true) ||
							(red21==true && red28==true && red35==true && red42==true) ||
					//
					(red22==true && red16==true && red10==true && red4==true) ||
						(red23==true && red17==true && red11==true && red5==true) ||
							(red24==true && red18==true && red12==true && red6==true) ||
								(red25==true && red19==true && red13==true && red7==true) ||
					(red29==true && red23==true && red17==true && red11==true) ||
						(red30==true && red24==true && red18==true && red12==true) ||
							(red31==true && red25==true && red19==true && red13==true) ||
								(red32==true && red26==true && red20==true && red14==true) ||
					(red36==true && red30==true && red24==true && red18==true) ||
						(red37==true && red31==true && red25==true && red19==true) ||
							(red38==true && red32==true && red26==true && red20==true) ||
								(red39==true && red33==true && red27==true && red21==true) ||
					//
					(red42==true && red34==true && red26==true && red18==true) ||
						(red41==true && red33==true && red25==true && red17==true) ||
							(red40==true && red32==true && red24==true && red16==true) ||
								(red39==true && red31==true && red23==true && red15==true) ||
					(red35==true && red27==true && red19==true && red11==true) ||
						(red34==true && red26==true && red18==true && red10==true) ||
							(red33==true && red25==true && red17==true && red9==true) ||
								(red32==true && red24==true && red16==true && red8==true) ||
					(red28==true && red20==true && red12==true && red4==true) ||
						(red27==true && red19==true && red11==true && red3==true) ||
							(red26==true && red18==true && red10==true && red2==true) ||
								(red25==true && red17==true && red9==true && red1==true)){
					counter = counter + 1;
					fieldA.setText("                 RED WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter1 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
		}

		if(e.getSource() == button2){
			fieldA.setText("          ");
			if(counter2 < 6){
				counter2++;
			}
			else{
				button2.removeActionListener(this);
			}
			if(color == true){
				if(fill37 == false){
					Label37.setIcon(bluepiece);
					fill37 = true;
					color = false;
					red37 = false;
					blue37 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill30 == false){
					Label30.setIcon(bluepiece);
					fill30 = true;
					color = false;
					red30 = false;
					blue30 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill23 == false){
					Label23.setIcon(bluepiece);
					fill23 = true;
					color = false;
					red23 = false;
					blue23 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill16 == false){
					Label16.setIcon(bluepiece);
					fill16 = true;
					color = false;
					red16 = false;
					blue16 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill9 == false){
					Label9.setIcon(bluepiece);
					fill9 = true;
					color = false;
					red9 = false;
					blue9 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill2 == false){
					Label2.setIcon(bluepiece);
					fill2 = true;
					color = false;
					red2 = false;
					blue2 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				if((blue36==true && blue37==true && blue38==true && blue39==true) ||
					    (blue37==true && blue38==true && blue39==true && blue40==true) ||
						    (blue38==true && blue39==true && blue40==true && blue41==true) ||
							    (blue39==true && blue40==true && blue41==true && blue42==true) ||
					(blue29==true && blue30==true && blue31==true && blue32==true) ||
						(blue30==true && blue31==true && blue32==true && blue33==true) ||
							(blue31==true && blue32==true && blue33==true && blue34==true) ||
								(blue32==true && blue33==true && blue34==true && blue35==true) ||
					(blue22==true && blue23==true && blue24==true && blue25==true) ||
						(blue23==true && blue24==true && blue25==true && blue26==true) ||
							(blue24==true && blue25==true && blue26==true && blue27==true) ||
								(blue25==true && blue26==true && blue27==true && blue28==true) ||
					(blue15==true && blue16==true && blue17==true && blue18==true) ||
						(blue16==true && blue17==true && blue18==true && blue19==true) ||
							(blue17==true && blue18==true && blue19==true && blue20==true) ||
								(blue18==true && blue19==true && blue20==true && blue21==true) ||
					(blue8==true && blue9==true && blue10==true && blue11==true) ||
						(blue9==true && blue10==true && blue11==true && blue12==true) ||
							(blue10==true && blue11==true && blue12==true && blue13==true) ||
								(blue11==true && blue12==true && blue13==true && blue14==true) ||
					(blue1==true && blue2==true && blue3==true && blue4==true) ||
						(blue2==true && blue3==true && blue4==true && blue5==true) ||
							(blue3==true && blue4==true && blue5==true && blue6==true) ||
								(blue4==true && blue5==true && blue6==true && blue7==true) ||
					//
					(blue1==true && blue8==true && blue15==true && blue22==true) ||
						(blue8==true && blue15==true && blue22==true && blue29==true) ||
							(blue15==true && blue22==true && blue29==true && blue36==true) ||
					(blue2==true && blue9==true && blue16==true && blue23==true) ||
						(blue9==true && blue16==true && blue23==true && blue30==true) ||
							(blue16==true && blue23==true && blue30==true && blue37==true) ||
					(blue3==true && blue10==true && blue17==true && blue24==true) ||
						(blue10==true && blue17==true && blue24==true && blue31==true) ||
							(blue17==true && blue24==true && blue31==true && blue38==true) ||
					(blue4==true && blue11==true && blue18==true && blue25==true) ||
						(blue11==true && blue18==true && blue25==true && blue32==true) ||
							(blue18==true && blue25==true && blue32==true && blue39==true) ||
					(blue5==true && blue12==true && blue19==true && blue26==true) ||
						(blue12==true && blue19==true && blue26==true && blue33==true) ||
							(blue19==true && blue26==true && blue33==true && blue40==true) ||
					(blue6==true && blue13==true && blue20==true && blue27==true) ||
						(blue13==true && blue20==true && blue27==true && blue34==true) ||
							(blue20==true && blue27==true && blue34==true && blue41==true) ||
					(blue7==true && blue14==true && blue21==true && blue28==true) ||
						(blue14==true && blue21==true && blue28==true && blue35==true) ||
							(blue21==true && blue28==true && blue35==true && blue42==true) ||
					//
					(blue22==true && blue16==true && blue10==true && blue4==true) ||
						(blue23==true && blue17==true && blue11==true && blue5==true) ||
							(blue24==true && blue18==true && blue12==true && blue6==true) ||
								(blue25==true && blue19==true && blue13==true && blue7==true) ||
					(blue29==true && blue23==true && blue17==true && blue11==true) ||
						(blue30==true && blue24==true && blue18==true && blue12==true) ||
							(blue31==true && blue25==true && blue19==true && blue13==true) ||
								(blue32==true && blue26==true && blue20==true && blue14==true) ||
					(blue36==true && blue30==true && blue24==true && blue18==true) ||
						(blue37==true && blue31==true && blue25==true && blue19==true) ||
							(blue38==true && blue32==true && blue26==true && blue20==true) ||
								(blue39==true && blue33==true && blue27==true && blue21==true) ||
					//
					(blue42==true && blue34==true && blue26==true && blue18==true) ||
						(blue41==true && blue33==true && blue25==true && blue17==true) ||
							(blue40==true && blue32==true && blue24==true && blue16==true) ||
								(blue39==true && blue31==true && blue23==true && blue15==true) ||
					(blue35==true && blue27==true && blue19==true && blue11==true) ||
						(blue34==true && blue26==true && blue18==true && blue10==true) ||
							(blue33==true && blue25==true && blue17==true && blue9==true) ||
								(blue32==true && blue24==true && blue16==true && blue8==true) ||
					(blue28==true && blue20==true && blue12==true && blue4==true) ||
						(blue27==true && blue19==true && blue11==true && blue3==true) ||
							(blue26==true && blue18==true && blue10==true && blue2==true) ||
								(blue25==true && blue17==true && blue9==true && blue1==true)){
					counter = counter + 1;
					fieldA.setText("                 BLUE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter2 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
			else{
				if(fill37 == false){
					Label37.setIcon(redpiece);
					fill37 = true;
					color = true;
					red37 = true;
					blue37 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill30 == false){
					Label30.setIcon(redpiece);
					fill30 = true;
					color = true;
					red30 = true;
					blue30 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill23 == false){
					Label23.setIcon(redpiece);
					fill23 = true;
					color = true;
					red23 = true;
					blue23 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill16== false){
					Label16.setIcon(redpiece);
					fill16 = true;
					color = true;
					red16 = true;
					blue16 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill9 == false){
					Label9.setIcon(redpiece);
					fill9 = true;
					color = true;
					red9 = true;
					blue9 = false;
					fieldC.setText("BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill2 == false){
					Label2.setIcon(redpiece);
					fill2 = true;
					color = true;
					red2 = true;
					blue2 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				if((red36==true && red37==true && red38==true && red39==true) ||
					    (red37==true && red38==true && red39==true && red40==true) ||
						    (red38==true && red39==true && red40==true && red41==true) ||
							    (red39==true && red40==true && red41==true && red42==true) ||
					(red29==true && red30==true && red31==true && red32==true) ||
						(red30==true && red31==true && red32==true && red33==true) ||
							(red31==true && red32==true && red33==true && red34==true) ||
								(red32==true && red33==true && red34==true && red35==true) ||
					(red22==true && red23==true && red24==true && red25==true) ||
						(red23==true && red24==true && red25==true && red26==true) ||
							(red24==true && red25==true && red26==true && red27==true) ||
								(red25==true && red26==true && red27==true && red28==true) ||
					(red15==true && red16==true && red17==true && red18==true) ||
						(red16==true && red17==true && red18==true && red19==true) ||
							(red17==true && red18==true && red19==true && red20==true) ||
								(red18==true && red19==true && red20==true && red21==true) ||
					(red8==true && red9==true && red10==true && red11==true) ||
						(red9==true && red10==true && red11==true && red12==true) ||
							(red10==true && red11==true && red12==true && red13==true) ||
								(red11==true && red12==true && red13==true && red14==true) ||
					(red1==true && red2==true && red3==true && red4==true) ||
						(red2==true && red3==true && red4==true && red5==true) ||
							(red3==true && red4==true && red5==true && red6==true) ||
								(red4==true && red5==true && red6==true && red7==true) ||
					//
					(red1==true && red8==true && red15==true && red22==true) ||
						(red8==true && red15==true && red22==true && red29==true) ||
							(red15==true && red22==true && red29==true && red36==true) ||
					(red2==true && red9==true && red16==true && red23==true) ||
						(red9==true && red16==true && red23==true && red30==true) ||
							(red16==true && red23==true && red30==true && red37==true) ||
					(red3==true && red10==true && red17==true && red24==true) ||
						(red10==true && red17==true && red24==true && red31==true) ||
							(red17==true && red24==true && red31==true && red38==true) ||
					(red4==true && red11==true && red18==true && red25==true) ||
						(red11==true && red18==true && red25==true && red32==true) ||
							(red18==true && red25==true && red32==true && red39==true) ||
					(red5==true && red12==true && red19==true && red26==true) ||
						(red12==true && red19==true && red26==true && red33==true) ||
							(red19==true && red26==true && red33==true && red40==true) ||
					(red6==true && red13==true && red20==true && red27==true) ||
						(red13==true && red20==true && red27==true && red34==true) ||
							(red20==true && red27==true && red34==true && red41==true) ||
					(red7==true && red14==true && red21==true && red28==true) ||
						(red14==true && red21==true && red28==true && red35==true) ||
							(red21==true && red28==true && red35==true && red42==true) ||
					//
					(red22==true && red16==true && red10==true && red4==true) ||
						(red23==true && red17==true && red11==true && red5==true) ||
							(red24==true && red18==true && red12==true && red6==true) ||
								(red25==true && red19==true && red13==true && red7==true) ||
					(red29==true && red23==true && red17==true && red11==true) ||
						(red30==true && red24==true && red18==true && red12==true) ||
							(red31==true && red25==true && red19==true && red13==true) ||
								(red32==true && red26==true && red20==true && red14==true) ||
					(red36==true && red30==true && red24==true && red18==true) ||
						(red37==true && red31==true && red25==true && red19==true) ||
							(red38==true && red32==true && red26==true && red20==true) ||
								(red39==true && red33==true && red27==true && red21==true) ||
					//
					(red42==true && red34==true && red26==true && red18==true) ||
						(red41==true && red33==true && red25==true && red17==true) ||
							(red40==true && red32==true && red24==true && red16==true) ||
								(red39==true && red31==true && red23==true && red15==true) ||
					(red35==true && red27==true && red19==true && red11==true) ||
						(red34==true && red26==true && red18==true && red10==true) ||
							(red33==true && red25==true && red17==true && red9==true) ||
								(red32==true && red24==true && red16==true && red8==true) ||
					(red28==true && red20==true && red12==true && red4==true) ||
						(red27==true && red19==true && red11==true && red3==true) ||
							(red26==true && red18==true && red10==true && red2==true) ||
								(red25==true && red17==true && red9==true && red1==true))
				{
					counter = counter + 1;
					fieldA.setText("                 RED WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter2 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
		}

		if(e.getSource() == button3){
			fieldA.setText("          ");
			if(counter3 < 6){
				counter3++;
			}
			else{
				button3.removeActionListener(this);
			}
			if(color == true){
				if(fill38 == false){
					Label38.setIcon(bluepiece);
					fill38 = true;
					color = false;
					red38 = false;
					blue38 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill31 == false){
					Label31.setIcon(bluepiece);
					fill31 = true;
					color = false;
					red31 = false;
					blue31 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill24 == false){
					Label24.setIcon(bluepiece);
					fill24 = true;
					color = false;
					red24 = false;
					blue24 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill17 == false){
					Label17.setIcon(bluepiece);
					fill17 = true;
					color = false;
					red17 = false;
					blue17 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill10 == false){
					Label10.setIcon(bluepiece);
					fill10 = true;
					color = false;
					red10 = false;
					blue10 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill3 == false){
					Label3.setIcon(bluepiece);
					fill3 = true;
					color = false;
					red3 = false;
					blue3 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				if((blue36==true && blue37==true && blue38==true && blue39==true) ||
					    (blue37==true && blue38==true && blue39==true && blue40==true) ||
						    (blue38==true && blue39==true && blue40==true && blue41==true) ||
							    (blue39==true && blue40==true && blue41==true && blue42==true) ||
					(blue29==true && blue30==true && blue31==true && blue32==true) ||
						(blue30==true && blue31==true && blue32==true && blue33==true) ||
							(blue31==true && blue32==true && blue33==true && blue34==true) ||
								(blue32==true && blue33==true && blue34==true && blue35==true) ||
					(blue22==true && blue23==true && blue24==true && blue25==true) ||
						(blue23==true && blue24==true && blue25==true && blue26==true) ||
							(blue24==true && blue25==true && blue26==true && blue27==true) ||
								(blue25==true && blue26==true && blue27==true && blue28==true) ||
					(blue15==true && blue16==true && blue17==true && blue18==true) ||
						(blue16==true && blue17==true && blue18==true && blue19==true) ||
							(blue17==true && blue18==true && blue19==true && blue20==true) ||
								(blue18==true && blue19==true && blue20==true && blue21==true) ||
					(blue8==true && blue9==true && blue10==true && blue11==true) ||
						(blue9==true && blue10==true && blue11==true && blue12==true) ||
							(blue10==true && blue11==true && blue12==true && blue13==true) ||
								(blue11==true && blue12==true && blue13==true && blue14==true) ||
					(blue1==true && blue2==true && blue3==true && blue4==true) ||
						(blue2==true && blue3==true && blue4==true && blue5==true) ||
							(blue3==true && blue4==true && blue5==true && blue6==true) ||
								(blue4==true && blue5==true && blue6==true && blue7==true) ||
					//
					(blue1==true && blue8==true && blue15==true && blue22==true) ||
						(blue8==true && blue15==true && blue22==true && blue29==true) ||
							(blue15==true && blue22==true && blue29==true && blue36==true) ||
					(blue2==true && blue9==true && blue16==true && blue23==true) ||
						(blue9==true && blue16==true && blue23==true && blue30==true) ||
							(blue16==true && blue23==true && blue30==true && blue37==true) ||
					(blue3==true && blue10==true && blue17==true && blue24==true) ||
						(blue10==true && blue17==true && blue24==true && blue31==true) ||
							(blue17==true && blue24==true && blue31==true && blue38==true) ||
					(blue4==true && blue11==true && blue18==true && blue25==true) ||
						(blue11==true && blue18==true && blue25==true && blue32==true) ||
							(blue18==true && blue25==true && blue32==true && blue39==true) ||
					(blue5==true && blue12==true && blue19==true && blue26==true) ||
						(blue12==true && blue19==true && blue26==true && blue33==true) ||
							(blue19==true && blue26==true && blue33==true && blue40==true) ||
					(blue6==true && blue13==true && blue20==true && blue27==true) ||
						(blue13==true && blue20==true && blue27==true && blue34==true) ||
							(blue20==true && blue27==true && blue34==true && blue41==true) ||
					(blue7==true && blue14==true && blue21==true && blue28==true) ||
						(blue14==true && blue21==true && blue28==true && blue35==true) ||
							(blue21==true && blue28==true && blue35==true && blue42==true) ||
					//
					(blue22==true && blue16==true && blue10==true && blue4==true) ||
						(blue23==true && blue17==true && blue11==true && blue5==true) ||
							(blue24==true && blue18==true && blue12==true && blue6==true) ||
								(blue25==true && blue19==true && blue13==true && blue7==true) ||
					(blue29==true && blue23==true && blue17==true && blue11==true) ||
						(blue30==true && blue24==true && blue18==true && blue12==true) ||
							(blue31==true && blue25==true && blue19==true && blue13==true) ||
								(blue32==true && blue26==true && blue20==true && blue14==true) ||
					(blue36==true && blue30==true && blue24==true && blue18==true) ||
						(blue37==true && blue31==true && blue25==true && blue19==true) ||
							(blue38==true && blue32==true && blue26==true && blue20==true) ||
								(blue39==true && blue33==true && blue27==true && blue21==true) ||
					//
					(blue42==true && blue34==true && blue26==true && blue18==true) ||
						(blue41==true && blue33==true && blue25==true && blue17==true) ||
							(blue40==true && blue32==true && blue24==true && blue16==true) ||
								(blue39==true && blue31==true && blue23==true && blue15==true) ||
					(blue35==true && blue27==true && blue19==true && blue11==true) ||
						(blue34==true && blue26==true && blue18==true && blue10==true) ||
							(blue33==true && blue25==true && blue17==true && blue9==true) ||
								(blue32==true && blue24==true && blue16==true && blue8==true) ||
					(blue28==true && blue20==true && blue12==true && blue4==true) ||
						(blue27==true && blue19==true && blue11==true && blue3==true) ||
							(blue26==true && blue18==true && blue10==true && blue2==true) ||
								(blue25==true && blue17==true && blue9==true && blue1==true)){
					counter = counter + 1;
					fieldA.setText("                 BLUE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter3 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
			else{
				if(fill38 == false){
					Label38.setIcon(redpiece);
					fill38 = true;
					color = true;
					red38 = true;
					blue38 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill31 == false){
					Label31.setIcon(redpiece);
					fill31 = true;
					color = true;
					red31 = true;
					blue31 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill24 == false){
					Label24.setIcon(redpiece);
					fill24 = true;
					color = true;
					red24 = true;
					blue24 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill17== false){
					Label17.setIcon(redpiece);
					fill17 = true;
					color = true;
					red17 = true;
					blue17 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill10 == false){
					Label10.setIcon(redpiece);
					fill10 = true;
					color = true;
					red10 = true;
					blue10 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill3 == false){
					Label3.setIcon(redpiece);
					fill3 = true;
					color = true;
					red3 = true;
					blue3 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				if((red36==true && red37==true && red38==true && red39==true) ||
					    (red37==true && red38==true && red39==true && red40==true) ||
						    (red38==true && red39==true && red40==true && red41==true) ||
							    (red39==true && red40==true && red41==true && red42==true) ||
					(red29==true && red30==true && red31==true && red32==true) ||
						(red30==true && red31==true && red32==true && red33==true) ||
							(red31==true && red32==true && red33==true && red34==true) ||
								(red32==true && red33==true && red34==true && red35==true) ||
					(red22==true && red23==true && red24==true && red25==true) ||
						(red23==true && red24==true && red25==true && red26==true) ||
							(red24==true && red25==true && red26==true && red27==true) ||
								(red25==true && red26==true && red27==true && red28==true) ||
					(red15==true && red16==true && red17==true && red18==true) ||
						(red16==true && red17==true && red18==true && red19==true) ||
							(red17==true && red18==true && red19==true && red20==true) ||
								(red18==true && red19==true && red20==true && red21==true) ||
					(red8==true && red9==true && red10==true && red11==true) ||
						(red9==true && red10==true && red11==true && red12==true) ||
							(red10==true && red11==true && red12==true && red13==true) ||
								(red11==true && red12==true && red13==true && red14==true) ||
					(red1==true && red2==true && red3==true && red4==true) ||
						(red2==true && red3==true && red4==true && red5==true) ||
							(red3==true && red4==true && red5==true && red6==true) ||
								(red4==true && red5==true && red6==true && red7==true) ||
					//
					(red1==true && red8==true && red15==true && red22==true) ||
						(red8==true && red15==true && red22==true && red29==true) ||
							(red15==true && red22==true && red29==true && red36==true) ||
					(red2==true && red9==true && red16==true && red23==true) ||
						(red9==true && red16==true && red23==true && red30==true) ||
							(red16==true && red23==true && red30==true && red37==true) ||
					(red3==true && red10==true && red17==true && red24==true) ||
						(red10==true && red17==true && red24==true && red31==true) ||
							(red17==true && red24==true && red31==true && red38==true) ||
					(red4==true && red11==true && red18==true && red25==true) ||
						(red11==true && red18==true && red25==true && red32==true) ||
							(red18==true && red25==true && red32==true && red39==true) ||
					(red5==true && red12==true && red19==true && red26==true) ||
						(red12==true && red19==true && red26==true && red33==true) ||
							(red19==true && red26==true && red33==true && red40==true) ||
					(red6==true && red13==true && red20==true && red27==true) ||
						(red13==true && red20==true && red27==true && red34==true) ||
							(red20==true && red27==true && red34==true && red41==true) ||
					(red7==true && red14==true && red21==true && red28==true) ||
						(red14==true && red21==true && red28==true && red35==true) ||
							(red21==true && red28==true && red35==true && red42==true) ||
					//
					(red22==true && red16==true && red10==true && red4==true) ||
						(red23==true && red17==true && red11==true && red5==true) ||
							(red24==true && red18==true && red12==true && red6==true) ||
								(red25==true && red19==true && red13==true && red7==true) ||
					(red29==true && red23==true && red17==true && red11==true) ||
						(red30==true && red24==true && red18==true && red12==true) ||
							(red31==true && red25==true && red19==true && red13==true) ||
								(red32==true && red26==true && red20==true && red14==true) ||
					(red36==true && red30==true && red24==true && red18==true) ||
						(red37==true && red31==true && red25==true && red19==true) ||
							(red38==true && red32==true && red26==true && red20==true) ||
								(red39==true && red33==true && red27==true && red21==true) ||
					//
					(red42==true && red34==true && red26==true && red18==true) ||
						(red41==true && red33==true && red25==true && red17==true) ||
							(red40==true && red32==true && red24==true && red16==true) ||
								(red39==true && red31==true && red23==true && red15==true) ||
					(red35==true && red27==true && red19==true && red11==true) ||
						(red34==true && red26==true && red18==true && red10==true) ||
							(red33==true && red25==true && red17==true && red9==true) ||
								(red32==true && red24==true && red16==true && red8==true) ||
					(red28==true && red20==true && red12==true && red4==true) ||
						(red27==true && red19==true && red11==true && red3==true) ||
							(red26==true && red18==true && red10==true && red2==true) ||
								(red25==true && red17==true && red9==true && red1==true)){
					counter = counter + 1;
					fieldA.setText("                 RED WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter3 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
		}

		if(e.getSource() == button4){
			fieldA.setText("          ");
			if(counter4 < 6){
				counter4++;
			}
			else{
				button4.removeActionListener(this);
			}
			if(color == true){
				if(fill39 == false){
					Label39.setIcon(bluepiece);
					fill39 = true;
					color = false;
					red39 = false;
					blue39 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill32 == false){
					Label32.setIcon(bluepiece);
					fill32 = true;
					color = false;
					red32 = false;
					blue32 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill25 == false){
					Label25.setIcon(bluepiece);
					fill25 = true;
					color = false;
					red25 = false;
					blue25 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill18 == false){
					Label18.setIcon(bluepiece);
					fill18 = true;
					color = false;
					red18 = false;
					blue18 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill11 == false){
					Label11.setIcon(bluepiece);
					fill11 = true;
					color = false;
					red11 = false;
					blue11 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill4 == false){
					Label4.setIcon(bluepiece);
					fill4 = true;
					color = false;
					red4 = false;
					blue4 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				if((blue36==true && blue37==true && blue38==true && blue39==true) ||
					    (blue37==true && blue38==true && blue39==true && blue40==true) ||
						    (blue38==true && blue39==true && blue40==true && blue41==true) ||
							    (blue39==true && blue40==true && blue41==true && blue42==true) ||
					(blue29==true && blue30==true && blue31==true && blue32==true) ||
						(blue30==true && blue31==true && blue32==true && blue33==true) ||
							(blue31==true && blue32==true && blue33==true && blue34==true) ||
								(blue32==true && blue33==true && blue34==true && blue35==true) ||
					(blue22==true && blue23==true && blue24==true && blue25==true) ||
						(blue23==true && blue24==true && blue25==true && blue26==true) ||
							(blue24==true && blue25==true && blue26==true && blue27==true) ||
								(blue25==true && blue26==true && blue27==true && blue28==true) ||
					(blue15==true && blue16==true && blue17==true && blue18==true) ||
						(blue16==true && blue17==true && blue18==true && blue19==true) ||
							(blue17==true && blue18==true && blue19==true && blue20==true) ||
								(blue18==true && blue19==true && blue20==true && blue21==true) ||
					(blue8==true && blue9==true && blue10==true && blue11==true) ||
						(blue9==true && blue10==true && blue11==true && blue12==true) ||
							(blue10==true && blue11==true && blue12==true && blue13==true) ||
								(blue11==true && blue12==true && blue13==true && blue14==true) ||
					(blue1==true && blue2==true && blue3==true && blue4==true) ||
						(blue2==true && blue3==true && blue4==true && blue5==true) ||
							(blue3==true && blue4==true && blue5==true && blue6==true) ||
								(blue4==true && blue5==true && blue6==true && blue7==true) ||
					//
					(blue1==true && blue8==true && blue15==true && blue22==true) ||
						(blue8==true && blue15==true && blue22==true && blue29==true) ||
							(blue15==true && blue22==true && blue29==true && blue36==true) ||
					(blue2==true && blue9==true && blue16==true && blue23==true) ||
						(blue9==true && blue16==true && blue23==true && blue30==true) ||
							(blue16==true && blue23==true && blue30==true && blue37==true) ||
					(blue3==true && blue10==true && blue17==true && blue24==true) ||
						(blue10==true && blue17==true && blue24==true && blue31==true) ||
							(blue17==true && blue24==true && blue31==true && blue38==true) ||
					(blue4==true && blue11==true && blue18==true && blue25==true) ||
						(blue11==true && blue18==true && blue25==true && blue32==true) ||
							(blue18==true && blue25==true && blue32==true && blue39==true) ||
					(blue5==true && blue12==true && blue19==true && blue26==true) ||
						(blue12==true && blue19==true && blue26==true && blue33==true) ||
							(blue19==true && blue26==true && blue33==true && blue40==true) ||
					(blue6==true && blue13==true && blue20==true && blue27==true) ||
						(blue13==true && blue20==true && blue27==true && blue34==true) ||
							(blue20==true && blue27==true && blue34==true && blue41==true) ||
					(blue7==true && blue14==true && blue21==true && blue28==true) ||
						(blue14==true && blue21==true && blue28==true && blue35==true) ||
							(blue21==true && blue28==true && blue35==true && blue42==true) ||
					//
					(blue22==true && blue16==true && blue10==true && blue4==true) ||
						(blue23==true && blue17==true && blue11==true && blue5==true) ||
							(blue24==true && blue18==true && blue12==true && blue6==true) ||
								(blue25==true && blue19==true && blue13==true && blue7==true) ||
					(blue29==true && blue23==true && blue17==true && blue11==true) ||
						(blue30==true && blue24==true && blue18==true && blue12==true) ||
							(blue31==true && blue25==true && blue19==true && blue13==true) ||
								(blue32==true && blue26==true && blue20==true && blue14==true) ||
					(blue36==true && blue30==true && blue24==true && blue18==true) ||
						(blue37==true && blue31==true && blue25==true && blue19==true) ||
							(blue38==true && blue32==true && blue26==true && blue20==true) ||
								(blue39==true && blue33==true && blue27==true && blue21==true) ||
					//
					(blue42==true && blue34==true && blue26==true && blue18==true) ||
						(blue41==true && blue33==true && blue25==true && blue17==true) ||
							(blue40==true && blue32==true && blue24==true && blue16==true) ||
								(blue39==true && blue31==true && blue23==true && blue15==true) ||
					(blue35==true && blue27==true && blue19==true && blue11==true) ||
						(blue34==true && blue26==true && blue18==true && blue10==true) ||
							(blue33==true && blue25==true && blue17==true && blue9==true) ||
								(blue32==true && blue24==true && blue16==true && blue8==true) ||
					(blue28==true && blue20==true && blue12==true && blue4==true) ||
						(blue27==true && blue19==true && blue11==true && blue3==true) ||
							(blue26==true && blue18==true && blue10==true && blue2==true) ||
								(blue25==true && blue17==true && blue9==true && blue1==true)){
					counter = counter + 1;
					fieldA.setText("                 BLUE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter4 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
			else{
				if(fill39 == false){
					Label39.setIcon(redpiece);
					fill39 = true;
					color = true;
					red39 = true;
					blue39 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill32 == false){
					Label32.setIcon(redpiece);
					fill32 = true;
					color = true;
					red32 = true;
					blue32 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill25 == false){
					Label25.setIcon(redpiece);
					fill25 = true;
					color = true;
					red25 = true;
					blue25 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill18== false){
					Label18.setIcon(redpiece);
					fill18 = true;
					color = true;
					red18 = true;
					blue18 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill11 == false){
					Label11.setIcon(redpiece);
					fill11 = true;
					color = true;
					red11 = true;
					blue11 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill4 == false){
					Label4.setIcon(redpiece);
					fill4 = true;
					color = true;
					red4 = true;
					blue4 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				if((red36==true && red37==true && red38==true && red39==true) ||
					    (red37==true && red38==true && red39==true && red40==true) ||
						    (red38==true && red39==true && red40==true && red41==true) ||
							    (red39==true && red40==true && red41==true && red42==true) ||
					(red29==true && red30==true && red31==true && red32==true) ||
						(red30==true && red31==true && red32==true && red33==true) ||
							(red31==true && red32==true && red33==true && red34==true) ||
								(red32==true && red33==true && red34==true && red35==true) ||
					(red22==true && red23==true && red24==true && red25==true) ||
						(red23==true && red24==true && red25==true && red26==true) ||
							(red24==true && red25==true && red26==true && red27==true) ||
								(red25==true && red26==true && red27==true && red28==true) ||
					(red15==true && red16==true && red17==true && red18==true) ||
						(red16==true && red17==true && red18==true && red19==true) ||
							(red17==true && red18==true && red19==true && red20==true) ||
								(red18==true && red19==true && red20==true && red21==true) ||
					(red8==true && red9==true && red10==true && red11==true) ||
						(red9==true && red10==true && red11==true && red12==true) ||
							(red10==true && red11==true && red12==true && red13==true) ||
								(red11==true && red12==true && red13==true && red14==true) ||
					(red1==true && red2==true && red3==true && red4==true) ||
						(red2==true && red3==true && red4==true && red5==true) ||
							(red3==true && red4==true && red5==true && red6==true) ||
								(red4==true && red5==true && red6==true && red7==true) ||
					//
					(red1==true && red8==true && red15==true && red22==true) ||
						(red8==true && red15==true && red22==true && red29==true) ||
							(red15==true && red22==true && red29==true && red36==true) ||
					(red2==true && red9==true && red16==true && red23==true) ||
						(red9==true && red16==true && red23==true && red30==true) ||
							(red16==true && red23==true && red30==true && red37==true) ||
					(red3==true && red10==true && red17==true && red24==true) ||
						(red10==true && red17==true && red24==true && red31==true) ||
							(red17==true && red24==true && red31==true && red38==true) ||
					(red4==true && red11==true && red18==true && red25==true) ||
						(red11==true && red18==true && red25==true && red32==true) ||
							(red18==true && red25==true && red32==true && red39==true) ||
					(red5==true && red12==true && red19==true && red26==true) ||
						(red12==true && red19==true && red26==true && red33==true) ||
							(red19==true && red26==true && red33==true && red40==true) ||
					(red6==true && red13==true && red20==true && red27==true) ||
						(red13==true && red20==true && red27==true && red34==true) ||
							(red20==true && red27==true && red34==true && red41==true) ||
					(red7==true && red14==true && red21==true && red28==true) ||
						(red14==true && red21==true && red28==true && red35==true) ||
							(red21==true && red28==true && red35==true && red42==true) ||
					//
					(red22==true && red16==true && red10==true && red4==true) ||
						(red23==true && red17==true && red11==true && red5==true) ||
							(red24==true && red18==true && red12==true && red6==true) ||
								(red25==true && red19==true && red13==true && red7==true) ||
					(red29==true && red23==true && red17==true && red11==true) ||
						(red30==true && red24==true && red18==true && red12==true) ||
							(red31==true && red25==true && red19==true && red13==true) ||
								(red32==true && red26==true && red20==true && red14==true) ||
					(red36==true && red30==true && red24==true && red18==true) ||
						(red37==true && red31==true && red25==true && red19==true) ||
							(red38==true && red32==true && red26==true && red20==true) ||
								(red39==true && red33==true && red27==true && red21==true) ||
					//
					(red42==true && red34==true && red26==true && red18==true) ||
						(red41==true && red33==true && red25==true && red17==true) ||
							(red40==true && red32==true && red24==true && red16==true) ||
								(red39==true && red31==true && red23==true && red15==true) ||
					(red35==true && red27==true && red19==true && red11==true) ||
						(red34==true && red26==true && red18==true && red10==true) ||
							(red33==true && red25==true && red17==true && red9==true) ||
								(red32==true && red24==true && red16==true && red8==true) ||
					(red28==true && red20==true && red12==true && red4==true) ||
						(red27==true && red19==true && red11==true && red3==true) ||
							(red26==true && red18==true && red10==true && red2==true) ||
								(red25==true && red17==true && red9==true && red1==true)){
					counter = counter + 1;
					fieldA.setText("                 RED WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter4 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
		}

		if(e.getSource() == button5){
			fieldA.setText("          ");
			if(counter5 < 6){
				counter5++;
			}
			else{
				button5.removeActionListener(this);
			}
			if(color == true){
				if(fill40 == false){
					Label40.setIcon(bluepiece);
					fill40 = true;
					color = false;
					red40 = false;
					blue40 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill33 == false){
					Label33.setIcon(bluepiece);
					fill33 = true;
					color = false;
					red33 = false;
					blue33 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill26 == false){
					Label26.setIcon(bluepiece);
					fill26 = true;
					color = false;
					red26 = false;
					blue26 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill19 == false){
					Label19.setIcon(bluepiece);
					fill19 = true;
					color = false;
					red19 = false;
					blue19 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill12 == false){
					Label12.setIcon(bluepiece);
					fill12 = true;
					color = false;
					red12 = false;
					blue12 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill5 == false){
					Label5.setIcon(bluepiece);
					fill5 = true;
					color = false;
					red5 = false;
					blue5 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				if((blue36==true && blue37==true && blue38==true && blue39==true) ||
					    (blue37==true && blue38==true && blue39==true && blue40==true) ||
						    (blue38==true && blue39==true && blue40==true && blue41==true) ||
							    (blue39==true && blue40==true && blue41==true && blue42==true) ||
					(blue29==true && blue30==true && blue31==true && blue32==true) ||
						(blue30==true && blue31==true && blue32==true && blue33==true) ||
							(blue31==true && blue32==true && blue33==true && blue34==true) ||
								(blue32==true && blue33==true && blue34==true && blue35==true) ||
					(blue22==true && blue23==true && blue24==true && blue25==true) ||
						(blue23==true && blue24==true && blue25==true && blue26==true) ||
							(blue24==true && blue25==true && blue26==true && blue27==true) ||
								(blue25==true && blue26==true && blue27==true && blue28==true) ||
					(blue15==true && blue16==true && blue17==true && blue18==true) ||
						(blue16==true && blue17==true && blue18==true && blue19==true) ||
							(blue17==true && blue18==true && blue19==true && blue20==true) ||
								(blue18==true && blue19==true && blue20==true && blue21==true) ||
					(blue8==true && blue9==true && blue10==true && blue11==true) ||
						(blue9==true && blue10==true && blue11==true && blue12==true) ||
							(blue10==true && blue11==true && blue12==true && blue13==true) ||
								(blue11==true && blue12==true && blue13==true && blue14==true) ||
					(blue1==true && blue2==true && blue3==true && blue4==true) ||
						(blue2==true && blue3==true && blue4==true && blue5==true) ||
							(blue3==true && blue4==true && blue5==true && blue6==true) ||
								(blue4==true && blue5==true && blue6==true && blue7==true) ||
					//
					(blue1==true && blue8==true && blue15==true && blue22==true) ||
						(blue8==true && blue15==true && blue22==true && blue29==true) ||
							(blue15==true && blue22==true && blue29==true && blue36==true) ||
					(blue2==true && blue9==true && blue16==true && blue23==true) ||
						(blue9==true && blue16==true && blue23==true && blue30==true) ||
							(blue16==true && blue23==true && blue30==true && blue37==true) ||
					(blue3==true && blue10==true && blue17==true && blue24==true) ||
						(blue10==true && blue17==true && blue24==true && blue31==true) ||
							(blue17==true && blue24==true && blue31==true && blue38==true) ||
					(blue4==true && blue11==true && blue18==true && blue25==true) ||
						(blue11==true && blue18==true && blue25==true && blue32==true) ||
							(blue18==true && blue25==true && blue32==true && blue39==true) ||
					(blue5==true && blue12==true && blue19==true && blue26==true) ||
						(blue12==true && blue19==true && blue26==true && blue33==true) ||
							(blue19==true && blue26==true && blue33==true && blue40==true) ||
					(blue6==true && blue13==true && blue20==true && blue27==true) ||
						(blue13==true && blue20==true && blue27==true && blue34==true) ||
							(blue20==true && blue27==true && blue34==true && blue41==true) ||
					(blue7==true && blue14==true && blue21==true && blue28==true) ||
						(blue14==true && blue21==true && blue28==true && blue35==true) ||
							(blue21==true && blue28==true && blue35==true && blue42==true) ||
					//
					(blue22==true && blue16==true && blue10==true && blue4==true) ||
						(blue23==true && blue17==true && blue11==true && blue5==true) ||
							(blue24==true && blue18==true && blue12==true && blue6==true) ||
								(blue25==true && blue19==true && blue13==true && blue7==true) ||
					(blue29==true && blue23==true && blue17==true && blue11==true) ||
						(blue30==true && blue24==true && blue18==true && blue12==true) ||
							(blue31==true && blue25==true && blue19==true && blue13==true) ||
								(blue32==true && blue26==true && blue20==true && blue14==true) ||
					(blue36==true && blue30==true && blue24==true && blue18==true) ||
						(blue37==true && blue31==true && blue25==true && blue19==true) ||
							(blue38==true && blue32==true && blue26==true && blue20==true) ||
								(blue39==true && blue33==true && blue27==true && blue21==true) ||
					//
					(blue42==true && blue34==true && blue26==true && blue18==true) ||
						(blue41==true && blue33==true && blue25==true && blue17==true) ||
							(blue40==true && blue32==true && blue24==true && blue16==true) ||
								(blue39==true && blue31==true && blue23==true && blue15==true) ||
					(blue35==true && blue27==true && blue19==true && blue11==true) ||
						(blue34==true && blue26==true && blue18==true && blue10==true) ||
							(blue33==true && blue25==true && blue17==true && blue9==true) ||
								(blue32==true && blue24==true && blue16==true && blue8==true) ||
					(blue28==true && blue20==true && blue12==true && blue4==true) ||
						(blue27==true && blue19==true && blue11==true && blue3==true) ||
							(blue26==true && blue18==true && blue10==true && blue2==true) ||
								(blue25==true && blue17==true && blue9==true && blue1==true)){
					counter = counter + 1;
					fieldA.setText("                 BLUE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter5 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
			else{
				if(fill40 == false){
					Label40.setIcon(redpiece);
					fill40 = true;
					color = true;
					red40 = true;
					blue40 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill33 == false){
					Label33.setIcon(redpiece);
					fill33 = true;
					color = true;
					red33 = true;
					blue33 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill26 == false){
					Label26.setIcon(redpiece);
					fill26 = true;
					color = true;
					red26 = true;
					blue26 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill19== false){
					Label19.setIcon(redpiece);
					fill19 = true;
					color = true;
					red19 = true;
					blue19 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill12 == false){
					Label12.setIcon(redpiece);
					fill12 = true;
					color = true;
					red12 = true;
					blue12 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill5 == false){
					Label5.setIcon(redpiece);
					fill5 = true;
					color = true;
					red5 = true;
					blue5 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				if((red36==true && red37==true && red38==true && red39==true) ||
					    (red37==true && red38==true && red39==true && red40==true) ||
						    (red38==true && red39==true && red40==true && red41==true) ||
							    (red39==true && red40==true && red41==true && red42==true) ||
					(red29==true && red30==true && red31==true && red32==true) ||
						(red30==true && red31==true && red32==true && red33==true) ||
							(red31==true && red32==true && red33==true && red34==true) ||
								(red32==true && red33==true && red34==true && red35==true) ||
					(red22==true && red23==true && red24==true && red25==true) ||
						(red23==true && red24==true && red25==true && red26==true) ||
							(red24==true && red25==true && red26==true && red27==true) ||
								(red25==true && red26==true && red27==true && red28==true) ||
					(red15==true && red16==true && red17==true && red18==true) ||
						(red16==true && red17==true && red18==true && red19==true) ||
							(red17==true && red18==true && red19==true && red20==true) ||
								(red18==true && red19==true && red20==true && red21==true) ||
					(red8==true && red9==true && red10==true && red11==true) ||
						(red9==true && red10==true && red11==true && red12==true) ||
							(red10==true && red11==true && red12==true && red13==true) ||
								(red11==true && red12==true && red13==true && red14==true) ||
					(red1==true && red2==true && red3==true && red4==true) ||
						(red2==true && red3==true && red4==true && red5==true) ||
							(red3==true && red4==true && red5==true && red6==true) ||
								(red4==true && red5==true && red6==true && red7==true) ||
					//
					(red1==true && red8==true && red15==true && red22==true) ||
						(red8==true && red15==true && red22==true && red29==true) ||
							(red15==true && red22==true && red29==true && red36==true) ||
					(red2==true && red9==true && red16==true && red23==true) ||
						(red9==true && red16==true && red23==true && red30==true) ||
							(red16==true && red23==true && red30==true && red37==true) ||
					(red3==true && red10==true && red17==true && red24==true) ||
						(red10==true && red17==true && red24==true && red31==true) ||
							(red17==true && red24==true && red31==true && red38==true) ||
					(red4==true && red11==true && red18==true && red25==true) ||
						(red11==true && red18==true && red25==true && red32==true) ||
							(red18==true && red25==true && red32==true && red39==true) ||
					(red5==true && red12==true && red19==true && red26==true) ||
						(red12==true && red19==true && red26==true && red33==true) ||
							(red19==true && red26==true && red33==true && red40==true) ||
					(red6==true && red13==true && red20==true && red27==true) ||
						(red13==true && red20==true && red27==true && red34==true) ||
							(red20==true && red27==true && red34==true && red41==true) ||
					(red7==true && red14==true && red21==true && red28==true) ||
						(red14==true && red21==true && red28==true && red35==true) ||
							(red21==true && red28==true && red35==true && red42==true) ||
					//
					(red22==true && red16==true && red10==true && red4==true) ||
						(red23==true && red17==true && red11==true && red5==true) ||
							(red24==true && red18==true && red12==true && red6==true) ||
								(red25==true && red19==true && red13==true && red7==true) ||
					(red29==true && red23==true && red17==true && red11==true) ||
						(red30==true && red24==true && red18==true && red12==true) ||
							(red31==true && red25==true && red19==true && red13==true) ||
								(red32==true && red26==true && red20==true && red14==true) ||
					(red36==true && red30==true && red24==true && red18==true) ||
						(red37==true && red31==true && red25==true && red19==true) ||
							(red38==true && red32==true && red26==true && red20==true) ||
								(red39==true && red33==true && red27==true && red21==true) ||
					//
					(red42==true && red34==true && red26==true && red18==true) ||
						(red41==true && red33==true && red25==true && red17==true) ||
							(red40==true && red32==true && red24==true && red16==true) ||
								(red39==true && red31==true && red23==true && red15==true) ||
					(red35==true && red27==true && red19==true && red11==true) ||
						(red34==true && red26==true && red18==true && red10==true) ||
							(red33==true && red25==true && red17==true && red9==true) ||
								(red32==true && red24==true && red16==true && red8==true) ||
					(red28==true && red20==true && red12==true && red4==true) ||
						(red27==true && red19==true && red11==true && red3==true) ||
							(red26==true && red18==true && red10==true && red2==true) ||
								(red25==true && red17==true && red9==true && red1==true)){
					counter = counter + 1;
					fieldA.setText("                 RED WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter5 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
		}

		if(e.getSource() == button6){
			fieldA.setText("          ");
			if(counter6 < 6){
				counter6++;
			}
			else{
				button6.removeActionListener(this);
			}
			if(color == true){
				if(fill41 == false){
					Label41.setIcon(bluepiece);
					fill41 = true;
					color = false;
					red41 = false;
					blue41 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill34 == false){
					Label34.setIcon(bluepiece);
					fill34 = true;
					color = false;
					red34 = false;
					blue34 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill27 == false){
					Label27.setIcon(bluepiece);
					fill27 = true;
					color = false;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill20 == false){
					Label20.setIcon(bluepiece);
					fill20 = true;
					color = false;
					red20 = false;
					blue20 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill13 == false){
					Label13.setIcon(bluepiece);
					fill13 = true;
					color = false;
					red13 = false;
					blue13 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill6 == false){
					Label6.setIcon(bluepiece);
					fill6 = true;
					color = false;
					red6 = false;
					blue6 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				if((blue36==true && blue37==true && blue38==true && blue39==true) ||
					    (blue37==true && blue38==true && blue39==true && blue40==true) ||
						    (blue38==true && blue39==true && blue40==true && blue41==true) ||
							    (blue39==true && blue40==true && blue41==true && blue42==true) ||
					(blue29==true && blue30==true && blue31==true && blue32==true) ||
						(blue30==true && blue31==true && blue32==true && blue33==true) ||
							(blue31==true && blue32==true && blue33==true && blue34==true) ||
								(blue32==true && blue33==true && blue34==true && blue35==true) ||
					(blue22==true && blue23==true && blue24==true && blue25==true) ||
						(blue23==true && blue24==true && blue25==true && blue26==true) ||
							(blue24==true && blue25==true && blue26==true && blue27==true) ||
								(blue25==true && blue26==true && blue27==true && blue28==true) ||
					(blue15==true && blue16==true && blue17==true && blue18==true) ||
						(blue16==true && blue17==true && blue18==true && blue19==true) ||
							(blue17==true && blue18==true && blue19==true && blue20==true) ||
								(blue18==true && blue19==true && blue20==true && blue21==true) ||
					(blue8==true && blue9==true && blue10==true && blue11==true) ||
						(blue9==true && blue10==true && blue11==true && blue12==true) ||
							(blue10==true && blue11==true && blue12==true && blue13==true) ||
								(blue11==true && blue12==true && blue13==true && blue14==true) ||
					(blue1==true && blue2==true && blue3==true && blue4==true) ||
						(blue2==true && blue3==true && blue4==true && blue5==true) ||
							(blue3==true && blue4==true && blue5==true && blue6==true) ||
								(blue4==true && blue5==true && blue6==true && blue7==true) ||
					//
					(blue1==true && blue8==true && blue15==true && blue22==true) ||
						(blue8==true && blue15==true && blue22==true && blue29==true) ||
							(blue15==true && blue22==true && blue29==true && blue36==true) ||
					(blue2==true && blue9==true && blue16==true && blue23==true) ||
						(blue9==true && blue16==true && blue23==true && blue30==true) ||
							(blue16==true && blue23==true && blue30==true && blue37==true) ||
					(blue3==true && blue10==true && blue17==true && blue24==true) ||
						(blue10==true && blue17==true && blue24==true && blue31==true) ||
							(blue17==true && blue24==true && blue31==true && blue38==true) ||
					(blue4==true && blue11==true && blue18==true && blue25==true) ||
						(blue11==true && blue18==true && blue25==true && blue32==true) ||
							(blue18==true && blue25==true && blue32==true && blue39==true) ||
					(blue5==true && blue12==true && blue19==true && blue26==true) ||
						(blue12==true && blue19==true && blue26==true && blue33==true) ||
							(blue19==true && blue26==true && blue33==true && blue40==true) ||
					(blue6==true && blue13==true && blue20==true && blue27==true) ||
						(blue13==true && blue20==true && blue27==true && blue34==true) ||
							(blue20==true && blue27==true && blue34==true && blue41==true) ||
					(blue7==true && blue14==true && blue21==true && blue28==true) ||
						(blue14==true && blue21==true && blue28==true && blue35==true) ||
							(blue21==true && blue28==true && blue35==true && blue42==true) ||
					//
					(blue22==true && blue16==true && blue10==true && blue4==true) ||
						(blue23==true && blue17==true && blue11==true && blue5==true) ||
							(blue24==true && blue18==true && blue12==true && blue6==true) ||
								(blue25==true && blue19==true && blue13==true && blue7==true) ||
					(blue29==true && blue23==true && blue17==true && blue11==true) ||
						(blue30==true && blue24==true && blue18==true && blue12==true) ||
							(blue31==true && blue25==true && blue19==true && blue13==true) ||
								(blue32==true && blue26==true && blue20==true && blue14==true) ||
					(blue36==true && blue30==true && blue24==true && blue18==true) ||
						(blue37==true && blue31==true && blue25==true && blue19==true) ||
							(blue38==true && blue32==true && blue26==true && blue20==true) ||
								(blue39==true && blue33==true && blue27==true && blue21==true) ||
					//
					(blue42==true && blue34==true && blue26==true && blue18==true) ||
						(blue41==true && blue33==true && blue25==true && blue17==true) ||
							(blue40==true && blue32==true && blue24==true && blue16==true) ||
								(blue39==true && blue31==true && blue23==true && blue15==true) ||
					(blue35==true && blue27==true && blue19==true && blue11==true) ||
						(blue34==true && blue26==true && blue18==true && blue10==true) ||
							(blue33==true && blue25==true && blue17==true && blue9==true) ||
								(blue32==true && blue24==true && blue16==true && blue8==true) ||
					(blue28==true && blue20==true && blue12==true && blue4==true) ||
						(blue27==true && blue19==true && blue11==true && blue3==true) ||
							(blue26==true && blue18==true && blue10==true && blue2==true) ||
								(blue25==true && blue17==true && blue9==true && blue1==true)){
					counter = counter + 1;
					fieldA.setText("                 BLUE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter6 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
			else{
				if(fill41 == false){
					Label41.setIcon(redpiece);
					fill41 = true;
					color = true;
					red41 = true;
					blue41 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill34 == false){
					Label34.setIcon(redpiece);
					fill34 = true;
					color = true;
					red34 = true;
					blue34 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill27 == false){
					Label27.setIcon(redpiece);
					fill27 = true;
					color = true;
					red27 = true;
					blue27 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill20== false){
					Label20.setIcon(redpiece);
					fill20 = true;
					color = true;
					red20 = true;
					blue20 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill13 == false){
					Label13.setIcon(redpiece);
					fill13 = true;
					color = true;
					red13 = true;
					blue13 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill6 == false){
					Label6.setIcon(redpiece);
					fill6 = true;
					color = true;
					red16 = true;
					blue16 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				if((red36==true && red37==true && red38==true && red39==true) ||
					    (red37==true && red38==true && red39==true && red40==true) ||
						    (red38==true && red39==true && red40==true && red41==true) ||
							    (red39==true && red40==true && red41==true && red42==true) ||
					(red29==true && red30==true && red31==true && red32==true) ||
						(red30==true && red31==true && red32==true && red33==true) ||
							(red31==true && red32==true && red33==true && red34==true) ||
								(red32==true && red33==true && red34==true && red35==true) ||
					(red22==true && red23==true && red24==true && red25==true) ||
						(red23==true && red24==true && red25==true && red26==true) ||
							(red24==true && red25==true && red26==true && red27==true) ||
								(red25==true && red26==true && red27==true && red28==true) ||
					(red15==true && red16==true && red17==true && red18==true) ||
						(red16==true && red17==true && red18==true && red19==true) ||
							(red17==true && red18==true && red19==true && red20==true) ||
								(red18==true && red19==true && red20==true && red21==true) ||
					(red8==true && red9==true && red10==true && red11==true) ||
						(red9==true && red10==true && red11==true && red12==true) ||
							(red10==true && red11==true && red12==true && red13==true) ||
								(red11==true && red12==true && red13==true && red14==true) ||
					(red1==true && red2==true && red3==true && red4==true) ||
						(red2==true && red3==true && red4==true && red5==true) ||
							(red3==true && red4==true && red5==true && red6==true) ||
								(red4==true && red5==true && red6==true && red7==true) ||
					//
					(red1==true && red8==true && red15==true && red22==true) ||
						(red8==true && red15==true && red22==true && red29==true) ||
							(red15==true && red22==true && red29==true && red36==true) ||
					(red2==true && red9==true && red16==true && red23==true) ||
						(red9==true && red16==true && red23==true && red30==true) ||
							(red16==true && red23==true && red30==true && red37==true) ||
					(red3==true && red10==true && red17==true && red24==true) ||
						(red10==true && red17==true && red24==true && red31==true) ||
							(red17==true && red24==true && red31==true && red38==true) ||
					(red4==true && red11==true && red18==true && red25==true) ||
						(red11==true && red18==true && red25==true && red32==true) ||
							(red18==true && red25==true && red32==true && red39==true) ||
					(red5==true && red12==true && red19==true && red26==true) ||
						(red12==true && red19==true && red26==true && red33==true) ||
							(red19==true && red26==true && red33==true && red40==true) ||
					(red6==true && red13==true && red20==true && red27==true) ||
						(red13==true && red20==true && red27==true && red34==true) ||
							(red20==true && red27==true && red34==true && red41==true) ||
					(red7==true && red14==true && red21==true && red28==true) ||
						(red14==true && red21==true && red28==true && red35==true) ||
							(red21==true && red28==true && red35==true && red42==true) ||
					//
					(red22==true && red16==true && red10==true && red4==true) ||
						(red23==true && red17==true && red11==true && red5==true) ||
							(red24==true && red18==true && red12==true && red6==true) ||
								(red25==true && red19==true && red13==true && red7==true) ||
					(red29==true && red23==true && red17==true && red11==true) ||
						(red30==true && red24==true && red18==true && red12==true) ||
							(red31==true && red25==true && red19==true && red13==true) ||
								(red32==true && red26==true && red20==true && red14==true) ||
					(red36==true && red30==true && red24==true && red18==true) ||
						(red37==true && red31==true && red25==true && red19==true) ||
							(red38==true && red32==true && red26==true && red20==true) ||
								(red39==true && red33==true && red27==true && red21==true) ||
					//
					(red42==true && red34==true && red26==true && red18==true) ||
						(red41==true && red33==true && red25==true && red17==true) ||
							(red40==true && red32==true && red24==true && red16==true) ||
								(red39==true && red31==true && red23==true && red15==true) ||
					(red35==true && red27==true && red19==true && red11==true) ||
						(red34==true && red26==true && red18==true && red10==true) ||
							(red33==true && red25==true && red17==true && red9==true) ||
								(red32==true && red24==true && red16==true && red8==true) ||
					(red28==true && red20==true && red12==true && red4==true) ||
						(red27==true && red19==true && red11==true && red3==true) ||
							(red26==true && red18==true && red10==true && red2==true) ||
								(red25==true && red17==true && red9==true && red1==true)){
					counter = counter + 1;
					fieldA.setText("                 RED WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter6 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
		}

		if(e.getSource() == button7){
			fieldA.setText("          ");
			if(counter1 < 7){
				counter7++;
			}
			else{
				button7.removeActionListener(this);
			}
			if(color == true){
				if(fill42 == false){
					Label42.setIcon(bluepiece);
					fill42 = true;
					color = false;
					red42 = false;
					blue42 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill35 == false){
					Label35.setIcon(bluepiece);
					fill35 = true;
					color = false;
					red35 = false;
					blue35 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill28 == false){
					Label28.setIcon(bluepiece);
					fill28 = true;
					color = false;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill21 == false){
					Label21.setIcon(bluepiece);
					fill21 = true;
					color = false;
					red28 = false;
					blue28 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill14 == false){
					Label14.setIcon(bluepiece);
					fill14 = true;
					color = false;
					red14 = false;
					blue14 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				else if (fill7 == false){
					Label7.setIcon(bluepiece);
					fill7 = true;
					color = false;
					red7 = false;
					blue7 = true;
					fieldB.setText("           RED GOES NEXT");
					fieldC.setText("");
				}
				if((blue36==true && blue37==true && blue38==true && blue39==true) ||
					    (blue37==true && blue38==true && blue39==true && blue40==true) ||
						    (blue38==true && blue39==true && blue40==true && blue41==true) ||
							    (blue39==true && blue40==true && blue41==true && blue42==true) ||
					(blue29==true && blue30==true && blue31==true && blue32==true) ||
						(blue30==true && blue31==true && blue32==true && blue33==true) ||
							(blue31==true && blue32==true && blue33==true && blue34==true) ||
								(blue32==true && blue33==true && blue34==true && blue35==true) ||
					(blue22==true && blue23==true && blue24==true && blue25==true) ||
						(blue23==true && blue24==true && blue25==true && blue26==true) ||
							(blue24==true && blue25==true && blue26==true && blue27==true) ||
								(blue25==true && blue26==true && blue27==true && blue28==true) ||
					(blue15==true && blue16==true && blue17==true && blue18==true) ||
						(blue16==true && blue17==true && blue18==true && blue19==true) ||
							(blue17==true && blue18==true && blue19==true && blue20==true) ||
								(blue18==true && blue19==true && blue20==true && blue21==true) ||
					(blue8==true && blue9==true && blue10==true && blue11==true) ||
						(blue9==true && blue10==true && blue11==true && blue12==true) ||
							(blue10==true && blue11==true && blue12==true && blue13==true) ||
								(blue11==true && blue12==true && blue13==true && blue14==true) ||
					(blue1==true && blue2==true && blue3==true && blue4==true) ||
						(blue2==true && blue3==true && blue4==true && blue5==true) ||
							(blue3==true && blue4==true && blue5==true && blue6==true) ||
								(blue4==true && blue5==true && blue6==true && blue7==true) ||
					//
					(blue1==true && blue8==true && blue15==true && blue22==true) ||
						(blue8==true && blue15==true && blue22==true && blue29==true) ||
							(blue15==true && blue22==true && blue29==true && blue36==true) ||
					(blue2==true && blue9==true && blue16==true && blue23==true) ||
						(blue9==true && blue16==true && blue23==true && blue30==true) ||
							(blue16==true && blue23==true && blue30==true && blue37==true) ||
					(blue3==true && blue10==true && blue17==true && blue24==true) ||
						(blue10==true && blue17==true && blue24==true && blue31==true) ||
							(blue17==true && blue24==true && blue31==true && blue38==true) ||
					(blue4==true && blue11==true && blue18==true && blue25==true) ||
						(blue11==true && blue18==true && blue25==true && blue32==true) ||
							(blue18==true && blue25==true && blue32==true && blue39==true) ||
					(blue5==true && blue12==true && blue19==true && blue26==true) ||
						(blue12==true && blue19==true && blue26==true && blue33==true) ||
							(blue19==true && blue26==true && blue33==true && blue40==true) ||
					(blue6==true && blue13==true && blue20==true && blue27==true) ||
						(blue13==true && blue20==true && blue27==true && blue34==true) ||
							(blue20==true && blue27==true && blue34==true && blue41==true) ||
					(blue7==true && blue14==true && blue21==true && blue28==true) ||
						(blue14==true && blue21==true && blue28==true && blue35==true) ||
							(blue21==true && blue28==true && blue35==true && blue42==true) ||
					//
					(blue22==true && blue16==true && blue10==true && blue4==true) ||
						(blue23==true && blue17==true && blue11==true && blue5==true) ||
							(blue24==true && blue18==true && blue12==true && blue6==true) ||
								(blue25==true && blue19==true && blue13==true && blue7==true) ||
					(blue29==true && blue23==true && blue17==true && blue11==true) ||
						(blue30==true && blue24==true && blue18==true && blue12==true) ||
							(blue31==true && blue25==true && blue19==true && blue13==true) ||
								(blue32==true && blue26==true && blue20==true && blue14==true) ||
					(blue36==true && blue30==true && blue24==true && blue18==true) ||
						(blue37==true && blue31==true && blue25==true && blue19==true) ||
							(blue38==true && blue32==true && blue26==true && blue20==true) ||
								(blue39==true && blue33==true && blue27==true && blue21==true) ||
					//
					(blue42==true && blue34==true && blue26==true && blue18==true) ||
						(blue41==true && blue33==true && blue25==true && blue17==true) ||
							(blue40==true && blue32==true && blue24==true && blue16==true) ||
								(blue39==true && blue31==true && blue23==true && blue15==true) ||
					(blue35==true && blue27==true && blue19==true && blue11==true) ||
						(blue34==true && blue26==true && blue18==true && blue10==true) ||
							(blue33==true && blue25==true && blue17==true && blue9==true) ||
								(blue32==true && blue24==true && blue16==true && blue8==true) ||
					(blue28==true && blue20==true && blue12==true && blue4==true) ||
						(blue27==true && blue19==true && blue11==true && blue3==true) ||
							(blue26==true && blue18==true && blue10==true && blue2==true) ||
								(blue25==true && blue17==true && blue9==true && blue1==true)){
					counter = counter + 1;
					fieldA.setText("                 BLUE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter7 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
			else{
				if(fill42 == false){
					Label42.setIcon(redpiece);
					fill42 = true;
					color = true;
					red42 = true;
					blue42 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill35 == false){
					Label35.setIcon(redpiece);
					fill35 = true;
					color = true;
					red35 = true;
					blue35 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill28 == false){
					Label28.setIcon(redpiece);
					fill28 = true;
					color = true;
					red28 = true;
					blue28 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill21== false){
					Label21.setIcon(redpiece);
					fill21 = true;
					color = true;
					red21 = true;
					blue21 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill14 == false){
					Label14.setIcon(redpiece);
					fill14 = true;
					color = true;
					red14 = true;
					blue14 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				else if(fill7 == false){
					Label7.setIcon(redpiece);
					fill7 = true;
					color = true;
					red7 = true;
					blue7 = false;
					fieldC.setText("          BLUE GOES NEXT");
					fieldB.setText("");
				}
				if((red36==true && red37==true && red38==true && red39==true) ||
					    (red37==true && red38==true && red39==true && red40==true) ||
						    (red38==true && red39==true && red40==true && red41==true) ||
							    (red39==true && red40==true && red41==true && red42==true) ||
					(red29==true && red30==true && red31==true && red32==true) ||
						(red30==true && red31==true && red32==true && red33==true) ||
							(red31==true && red32==true && red33==true && red34==true) ||
								(red32==true && red33==true && red34==true && red35==true) ||
					(red22==true && red23==true && red24==true && red25==true) ||
						(red23==true && red24==true && red25==true && red26==true) ||
							(red24==true && red25==true && red26==true && red27==true) ||
								(red25==true && red26==true && red27==true && red28==true) ||
					(red15==true && red16==true && red17==true && red18==true) ||
						(red16==true && red17==true && red18==true && red19==true) ||
							(red17==true && red18==true && red19==true && red20==true) ||
								(red18==true && red19==true && red20==true && red21==true) ||
					(red8==true && red9==true && red10==true && red11==true) ||
						(red9==true && red10==true && red11==true && red12==true) ||
							(red10==true && red11==true && red12==true && red13==true) ||
								(red11==true && red12==true && red13==true && red14==true) ||
					(red1==true && red2==true && red3==true && red4==true) ||
						(red2==true && red3==true && red4==true && red5==true) ||
							(red3==true && red4==true && red5==true && red6==true) ||
								(red4==true && red5==true && red6==true && red7==true) ||
					//
					(red1==true && red8==true && red15==true && red22==true) ||
						(red8==true && red15==true && red22==true && red29==true) ||
							(red15==true && red22==true && red29==true && red36==true) ||
					(red2==true && red9==true && red16==true && red23==true) ||
						(red9==true && red16==true && red23==true && red30==true) ||
							(red16==true && red23==true && red30==true && red37==true) ||
					(red3==true && red10==true && red17==true && red24==true) ||
						(red10==true && red17==true && red24==true && red31==true) ||
							(red17==true && red24==true && red31==true && red38==true) ||
					(red4==true && red11==true && red18==true && red25==true) ||
						(red11==true && red18==true && red25==true && red32==true) ||
							(red18==true && red25==true && red32==true && red39==true) ||
					(red5==true && red12==true && red19==true && red26==true) ||
						(red12==true && red19==true && red26==true && red33==true) ||
							(red19==true && red26==true && red33==true && red40==true) ||
					(red6==true && red13==true && red20==true && red27==true) ||
						(red13==true && red20==true && red27==true && red34==true) ||
							(red20==true && red27==true && red34==true && red41==true) ||
					(red7==true && red14==true && red21==true && red28==true) ||
						(red14==true && red21==true && red28==true && red35==true) ||
							(red21==true && red28==true && red35==true && red42==true) ||
					//
					(red22==true && red16==true && red10==true && red4==true) ||
						(red23==true && red17==true && red11==true && red5==true) ||
							(red24==true && red18==true && red12==true && red6==true) ||
								(red25==true && red19==true && red13==true && red7==true) ||
					(red29==true && red23==true && red17==true && red11==true) ||
						(red30==true && red24==true && red18==true && red12==true) ||
							(red31==true && red25==true && red19==true && red13==true) ||
								(red32==true && red26==true && red20==true && red14==true) ||
					(red36==true && red30==true && red24==true && red18==true) ||
						(red37==true && red31==true && red25==true && red19==true) ||
							(red38==true && red32==true && red26==true && red20==true) ||
								(red39==true && red33==true && red27==true && red21==true) ||
					//
					(red42==true && red34==true && red26==true && red18==true) ||
						(red41==true && red33==true && red25==true && red17==true) ||
							(red40==true && red32==true && red24==true && red16==true) ||
								(red39==true && red31==true && red23==true && red15==true) ||
					(red35==true && red27==true && red19==true && red11==true) ||
						(red34==true && red26==true && red18==true && red10==true) ||
							(red33==true && red25==true && red17==true && red9==true) ||
								(red32==true && red24==true && red16==true && red8==true) ||
					(red28==true && red20==true && red12==true && red4==true) ||
						(red27==true && red19==true && red11==true && red3==true) ||
							(red26==true && red18==true && red10==true && red2==true) ||
								(red25==true && red17==true && red9==true && red1==true)){
					counter = counter + 1;
					fieldA.setText("                 RED WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
				if(counter < 43 && counter7 < 7){
					counter++;
				}
				else if(counter == 43){
					counter = counter - 1;
					fieldA.setText("              NO ONE WINS");
					fieldB.setText("                         " + counter);
					fieldC.setText("                 CLICK ->");
					button1.removeActionListener(this);
					button2.removeActionListener(this);
					button3.removeActionListener(this);
					button4.removeActionListener(this);
					button5.removeActionListener(this);
					button6.removeActionListener(this);
					button7.removeActionListener(this);
				}
			}
		}
	}
}