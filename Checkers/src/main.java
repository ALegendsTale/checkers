import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class main {
    public static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	public static JFrame frame1 = new JFrame();
	public static JPanel p1 = new JPanel();
	public static JPanel p2 = new JPanel();
	public static JButton[] barray  = new JButton[64];
	public static JTextField tf1 = new JTextField();
	public static String[] player = {"",""};
	public static String currentdir = System.getProperty("user.dir");
	public static int[] checkersGained = {0,0};
	public static JLabel l1 = new JLabel("Please type your name player 1 and press enter.",SwingConstants.CENTER);
	public static JLabel player1 = new JLabel("[Player 1]",SwingConstants.CENTER);
	public static JLabel player2 = new JLabel("[Player 2]",SwingConstants.CENTER);
	public static Font font1 = new Font("SansSerif", Font.PLAIN, 24);
	public static GridLayout lay = new GridLayout(5,0);
	public static GridLayout lay1 = new GridLayout(8,8);
	public static ImageIcon frameIcon = new ImageIcon(currentdir+"\\resources\\Daniel.png");
	public static ImageIcon redChecker = new ImageIcon(currentdir+"\\resources\\RedChecker3.png");
	public static ImageIcon blackChecker = new ImageIcon(currentdir+"\\resources\\BlackChecker3.png");
	public static JMenuBar jbar = new JMenuBar();
	public static JMenu menu1 = new JMenu("File");
	public static JMenuItem jm1 = new JMenuItem("Restart");
	public static JMenuItem jm2 = new JMenuItem("Exit");

	public static void main(String[] args) {
		gui.creategui();
		actionlisteners.actionsAndKeys();
	}
	
	public static void restart(){
		p1.removeAll();
		main.p1.add(main.jbar);
		main.p1.add(main.tf1);
		main.p1.add(main.l1);
		main.p1.add(main.player1);
		main.p1.add(main.player2);
		
		l1.setText("Please type your name player 1 and press enter.");
		player[0] = ""; player[1] = "";
		player1.setText("[Player 1]"); player2.setText("[Player 2]");
		checkersGained[0] = 0; checkersGained[1] = 0;
		
		for (int i = 0; i < main.barray.length; i++) {
			main.barray[i].setBackground(Color.WHITE);
		}
		int j = 0;
		int k = 0;
		for(int i = 1; i < main.barray.length; i+=2) {
			main.barray[i].setBackground(Color.BLACK);
			main.barray[i].setForeground(Color.WHITE);
			j++;
			if(j > 3) {
				if(k == 0)
					i--;
				else
					i++;
				k = (k + 1) % 2;
				j = 0;
			}
			
		}

		
		j = 0;
		k = 0;
		for(int i = 1; i <= 23; i+=2) {
			main.barray[i].setIcon(main.blackChecker);
			j++;
			if(j > 3) {
				if(k == 0)
					i--;
				else
					i++;
				k = (k + 1) % 2;
				j = 0;
			}
			
		}
		
		j = 0;
		k = 0;
		for(int i = 40; i <= 62; i+=2) {
			main.barray[i].setIcon(main.redChecker);
			j++;
			if(j > 3) {
				if(k != 0)
					i--;
				else
					i++;
				k = (k + 1) % 2;
				j = 0;
			}
			
		}
		//split
	}

}
