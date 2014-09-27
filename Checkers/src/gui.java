import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class gui {

	public static void creategui() {
		main.frame1.setVisible(true);
		int x = (int) ((main.dimension.getWidth() * .45));
		int y = (int) ((main.dimension.getHeight() * .9));
		System.out.println(x);
		System.out.println(y);
		main.frame1.setSize(x, y);
		main.frame1.setLocationRelativeTo(null);
		main.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.frame1.setTitle("Checkers Game");
		main.frame1.setIconImage(main.frameIcon.getImage());
		main.frame1.add(main.p1, BorderLayout.NORTH);
		main.frame1.add(main.p2, BorderLayout.CENTER);

		for (int i = 0; i < main.barray.length; i++) {
			main.barray[i] = new JButton();
			main.p2.add(main.barray[i]);
			main.barray[i].setBackground(Color.WHITE);
		}
		setstuff();
	}

	public static void setstuff() {
		int j = 0;
		int k = 0;
		for (int i = 1; i < main.barray.length; i += 2) {
			main.barray[i].setBackground(Color.BLACK);
			main.barray[i].setForeground(Color.WHITE);
			j++;
			if (j > 3) {
				if (k == 0)
					i--;
				else
					i++;
				k = (k + 1) % 2;
				j = 0;
			}

		}

		j = 0;
		k = 0;
		for (int i = 1; i <= 23; i += 2) {
			main.barray[i].setIcon(main.blackChecker);
			j++;
			if (j > 3) {
				if (k == 0)
					i--;
				else
					i++;
				k = (k + 1) % 2;
				j = 0;
			}

		}

		j = 0;
		k = 0;
		for (int i = 40; i <= 62; i += 2) {
			main.barray[i].setIcon(main.redChecker);
			j++;
			if (j > 3) {
				if (k != 0)
					i--;
				else
					i++;
				k = (k + 1) % 2;
				j = 0;
			}

		}

		System.out.println(main.barray[0].getSize());

		main.p1.setLayout(main.lay);
		main.p1.add(main.jbar);
		main.p1.add(main.tf1);
		main.p1.add(main.l1);
		main.p1.add(main.player1);
		main.p1.add(main.player2);

		main.jbar.add(main.menu1);
		main.menu1.add(main.jm1);
		main.menu1.add(main.jm2);

		main.p2.setLayout(main.lay1);

		main.l1.setFont(main.font1);
	}
}
