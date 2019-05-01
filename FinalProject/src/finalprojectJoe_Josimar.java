

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/*
This application will print out the number of point per game average
from the top 5 leading scores in the 2019 NBA season. 
*/

class Points implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private int x; 
	 private String y;
	 //get function
	 int getx() {
		return x;
	}
	// set function
	public void setx(int x) {
		this.x= x;
	}
	public Points(int x, String y) {
		setx(x);
		setY(y);
	}
	//to string function string that outputs name of player and int 
	// that outputs points
	public String toString() {
		return String.format("%d , %s", x,y) ;
	}
	 //get function
	public String getY() {
		return y;
	}
	// set function
	public void setY(String y) {
		this.y = y;
	}
}
public class finalprojectJoe_Josimar {

	private JFrame frame;

//launches the program 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalprojectJoe_Josimar window = new finalprojectJoe_Josimar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public finalprojectJoe_Josimar() {
		initialize();
	}

		// Initialize the contents of the frame.
	 //This menu has jbuttons and icons of nba players and professor Klump. 
	 //
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jbutton with name of player picture of player in outputs points and name of player
		JButton DLillard = new JButton("Damian Lillard");
		DLillard.setIcon(new ImageIcon("src\\r.png"));
		DLillard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Points b = new Points(33,"Points Per Game: Damian Lilard:");
				System.out.println(b);
			}
		});
				//jbutton with name of player picture of player in outputs points and name of player
		JButton kleonardbutton = new JButton("Kawhi Leonard");
		kleonardbutton.setIcon(new ImageIcon("src\\z.png"));
		kleonardbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Points k = new Points(27,"Points Per Game: Kawhi Lenard:");
				System.out.println(k);
			}
		});
				//jbutton with name of player picture of player in outputs points and name of player
		JButton pGeorgebutton = new JButton("Paul George");
		pGeorgebutton.setToolTipText("j");
		pGeorgebutton.setIcon(new ImageIcon("src\\x.png"));
		pGeorgebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Points j = new Points(28 , "Points Per Game: Paul George:");
				System.out.println(j);
			}
		});
		frame.getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		frame.getContentPane().add(DLillard);
		//jlabel that says NBA PPG leaders. 
		JLabel lblNbaPointsPer = new JLabel("NBA PPG Leaders");
		frame.getContentPane().add(lblNbaPointsPer);
		lblNbaPointsPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblNbaPointsPer.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label);
		frame.getContentPane().add(kleonardbutton);
		
		JLabel label_1 = new JLabel("");
		frame.getContentPane().add(label_1);
				//jbutton with name of player picture of player in outputs points and name of player
		JButton jhardenbutton = new JButton("James Harden");
		jhardenbutton.setIcon(new ImageIcon("src\\m.png"));
		jhardenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Points v = new Points(26,"Points Per Game: James Harden:");
				System.out.println(v);
			}
		});
		frame.getContentPane().add(jhardenbutton);
				//jbutton with name of player picture of player in outputs points and name of player
		JButton KDurant = new JButton("Kevin Durant");
		
		KDurant.setIcon(new ImageIcon("src\\i.png"));
		KDurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Points g = new Points(32,"Points Per Game: Kevin Durant:");
				System.out.println(g);
			}
		});
		frame.getContentPane().add(KDurant);
		
		JLabel label_2 = new JLabel("");
		frame.getContentPane().add(label_2);
		frame.getContentPane().add(pGeorgebutton);
		
		JLabel label_3 = new JLabel("");
		frame.getContentPane().add(label_3);
				//jbutton with name name of professor and teacher rating :)
		JButton RayKlump = new JButton("Ray Klump");
		RayKlump.setIcon(new ImageIcon("src\\t.png"));
		RayKlump.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Points g = new Points(100," Teacher Rating : Ray Klump:");
				System.out.println(g);
			}
		});
		frame.getContentPane().add(RayKlump);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		// jmenu with file 
		JMenu mnFile = new JMenu("file");
		menuBar.add(mnFile);
		// jmenu with exit and exits out of program when performed
		JMenuItem mnSave = new JMenuItem("exit");
		mnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		mnFile.add(mnSave);
		
		JMenu mnEdit = new JMenu("edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmLoad = new JMenuItem("load");
		mntmLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnEdit.add(mntmLoad);
		
		JMenuItem mnSave_1 = new JMenuItem("save");
		mnEdit.add(mnSave_1);
	}
}
