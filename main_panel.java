//author:: Prashant Kumar Anuragi
//main panel that will be shown in every window

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class main_panel extends JPanel
{
	JLabel imglabel;
	ImageIcon head_img;
	
	main_panel()
	{
		setLayout(new BorderLayout());
		//setLayout(new GridLayout());
		head_img=new ImageIcon(getClass().getResource("head_img.png"));
		imglabel=new JLabel(head_img,JLabel.CENTER);
		this.add(imglabel,BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
		main_panel hp=new main_panel();
		hp.setVisible(true);
	}
}