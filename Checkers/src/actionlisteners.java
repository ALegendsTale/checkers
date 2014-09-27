import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;

public class actionlisteners implements ActionListener, KeyListener, MouseListener {
	
	public void actionPerformed(ActionEvent e) {
		// ACTIONS------------------------------------------------------------------------------------------------------
		if (e.getSource() == main.barray[1]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[3]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[5]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[7]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[8]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[10]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[12]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[14]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[17]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[19]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[21]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[23]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[24]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[26]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[28]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[30]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[33]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[35]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[37]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[39]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[40]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[42]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[44]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[46]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[49]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[51]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[53]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[55]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[56]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[58]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[60]){
			main.l1.setText("Moving");
		}
		if (e.getSource() == main.barray[62]){
			main.l1.setText("Moving");
		}
		// FALSE--------------------------------------------------------------------------------------------------------
		if (e.getSource() == main.barray[0])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[2])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[4])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[6])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[9])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[11])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[13])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[15])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[16])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[18])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[20])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[22])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[25])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[27])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[29])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[31])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[32])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[34])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[36])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[38])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[41])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[43])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[45])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[47])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[48])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[50])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[52])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[54])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[57])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[59])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[61])
			main.l1.setText("You have chosen an invalid move!");
		if (e.getSource() == main.barray[63])
			main.l1.setText("You have chosen an invalid move!");
		// JMenu--------------------------------------------------------------------------------------------------------
		if (e.getSource() == main.jm1){
			main.restart();
		}
		if (e.getSource() == main.jm2)
			System.exit(0);
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		// KEYS--------------------------------------------------------------------------------------------------------------
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			if (main.player[0].equals("")){
			main.player[0] = main.tf1.getText();
			main.l1.setText("Please type your name player 2 and press enter.");
			main.player1.setText(main.player[0]+"          You have gained "+main.checkersGained[0]+" checkers.");
			main.tf1.setText("");
			}
			else if (main.player[1].equals("")){
				main.player[1] = main.tf1.getText();
				main.player2.setText(main.player[1]+"          You have gained "+main.checkersGained[1]+" checkers.");
				System.out.println(main.player[1]);
				main.l1.setText("The game has began!");
				main.tf1.setText("");
				main.p1.remove(main.tf1);
			}
	}

	public void keyReleased(KeyEvent e) {
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	if (e.getSource() == main.barray[1]){
		main.barray[1].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[3]){
		main.barray[3].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[5]){
		main.barray[5].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[7]){
		main.barray[7].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[8]){
		main.barray[8].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[10]){
		main.barray[10].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[12]){
		main.barray[12].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[14]){
		main.barray[14].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[17]){
		main.barray[17].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[19]){
		main.barray[19].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[21]){
		main.barray[21].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[23]){
		main.barray[23].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[24]){
		main.barray[24].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[26]){
		main.barray[26].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[28]){
		main.barray[28].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[30]){
		main.barray[30].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[33]){
		main.barray[33].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[35]){
		main.barray[35].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[37]){
		main.barray[37].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[39]){
		main.barray[39].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[40]){
		main.barray[40].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[42]){
		main.barray[42].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[44]){
		main.barray[44].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[46]){
		main.barray[46].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[49]){
		main.barray[49].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[51]){
		main.barray[51].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[53]){
		main.barray[53].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[55]){
		main.barray[55].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[56]){
		main.barray[56].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[58]){
		main.barray[58].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[60]){
		main.barray[60].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
	}
	if (e.getSource() == main.barray[62]){
		main.barray[62].setBorder(BorderFactory.createLineBorder(Color.GREEN, 3, false));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
	if (e.getSource() == main.barray[1]){
		main.barray[1].setBorder(null);
	}
	if (e.getSource() == main.barray[3]){
		main.barray[3].setBorder(null);
	}
	if (e.getSource() == main.barray[5]){
		main.barray[5].setBorder(null);
	}
	if (e.getSource() == main.barray[7]){
		main.barray[7].setBorder(null);
	}
	if (e.getSource() == main.barray[8]){
		main.barray[8].setBorder(null);
	}
	if (e.getSource() == main.barray[10]){
		main.barray[10].setBorder(null);
	}
	if (e.getSource() == main.barray[12]){
		main.barray[12].setBorder(null);
	}
	if (e.getSource() == main.barray[14]){
		main.barray[14].setBorder(null);
	}
	if (e.getSource() == main.barray[17]){
		main.barray[17].setBorder(null);
	}
	if (e.getSource() == main.barray[19]){
		main.barray[19].setBorder(null);
	}
	if (e.getSource() == main.barray[21]){
		main.barray[21].setBorder(null);
	}
	if (e.getSource() == main.barray[23]){
		main.barray[23].setBorder(null);
	}
	if (e.getSource() == main.barray[24]){
		main.barray[24].setBorder(null);
	}
	if (e.getSource() == main.barray[26]){
		main.barray[26].setBorder(null);
	}
	if (e.getSource() == main.barray[28]){
		main.barray[28].setBorder(null);
	}
	if (e.getSource() == main.barray[30]){
		main.barray[30].setBorder(null);
	}
	if (e.getSource() == main.barray[33]){
		main.barray[33].setBorder(null);
	}
	if (e.getSource() == main.barray[35]){
		main.barray[35].setBorder(null);
	}
	if (e.getSource() == main.barray[37]){
		main.barray[37].setBorder(null);
	}
	if (e.getSource() == main.barray[39]){
		main.barray[39].setBorder(null);
	}
	if (e.getSource() == main.barray[40]){
		main.barray[40].setBorder(null);
	}
	if (e.getSource() == main.barray[42]){
		main.barray[42].setBorder(null);
	}
	if (e.getSource() == main.barray[44]){
		main.barray[44].setBorder(null);
	}
	if (e.getSource() == main.barray[46]){
		main.barray[46].setBorder(null);
	}
	if (e.getSource() == main.barray[49]){
		main.barray[49].setBorder(null);
	}
	if (e.getSource() == main.barray[51]){
		main.barray[51].setBorder(null);
	}
	if (e.getSource() == main.barray[53]){
		main.barray[53].setBorder(null);
	}
	if (e.getSource() == main.barray[55]){
		main.barray[55].setBorder(null);
	}
	if (e.getSource() == main.barray[56]){
		main.barray[56].setBorder(null);
	}
	if (e.getSource() == main.barray[58]){
		main.barray[58].setBorder(null);
	}
	if (e.getSource() == main.barray[60]){
		main.barray[60].setBorder(null);
	}
	if (e.getSource() == main.barray[62]){
		main.barray[62].setBorder(null);
		}
	}
	
	public static void actionsAndKeys(){
		// Buttons-----------------------------------------------------------------------------------------------------------
		for(int i = 0; i <= 63; i++){
			main.barray[i].addActionListener(new actionlisteners());
			main.barray[i].addKeyListener(new actionlisteners());
			main.barray[i].addMouseListener(new actionlisteners());
		}
		// JMenu--------------------------------------------------------------------------------------------------------
		main.jm1.addActionListener(new actionlisteners());
		main.jm2.addActionListener(new actionlisteners());
		// Text--------------------------------------------------------------------------------------------------------------
		main.tf1.addKeyListener(new actionlisteners());
	}
	
}
