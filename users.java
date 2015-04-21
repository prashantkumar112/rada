//author:: Prashant Kumar Anuragi
//user window

import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class users extends MouseAdapter implements MouseListener
{
	JFrame userframe;
	JPanel top,bottom,center,centerUp,centerDown,centerDownLeft,centerDownCenter,centerDownRight;
	JButton close,gbutton,fbutton,sbutton;//gbutton=gaurav_button,fbutton=fauji_button,sbutton=sarvesh_button
	ImageIcon gaurav,fauji,sarvesh;
	//BufferedImage bi;
	JLabel gimglabel,fimglabel,simglabel;
	users()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		userframe=new JFrame("User Window");
		userframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		top=new main_panel();
		
		bottom=new JPanel();
		close=new JButton("Close");
		close.addMouseListener(this);
		bottom.add(close);
		bottom.setBackground(new Color(0,0,0,255));
		
		center=new JPanel(new GridLayout(2,1));
		
		centerUp=new JPanel(new GridLayout(1,3));
		
		gaurav=new ImageIcon(getClass().getResource("gaurav.png"));
		/*Image gimg=gaurav.getImage();
		BufferedImage bi=new BufferedImage(gimg.getWidth(null),gimg.getHeight(null),BufferedImage.TYPE_INT_ARGB);
		Graphics g=bi.createGraphics();
		g.drawImage(gimg,0,0,50,50,null);
		IconImage newIcon=new IconImage(bi);*/
		
		fauji=new ImageIcon(getClass().getResource("fauji.png"));
		sarvesh=new ImageIcon(getClass().getResource("sarvesh.png"));
		
		gimglabel=new JLabel(gaurav);
		fimglabel=new JLabel(fauji);
		simglabel=new JLabel(sarvesh);
		
		centerUp.add(gimglabel);
		centerUp.add(fimglabel);
		centerUp.add(simglabel);
		
		
		
		centerDown=new JPanel(new GridLayout(1,3));
		gbutton=new JButton("GAURAV");
		fbutton=new JButton("FAUJI");
		sbutton=new JButton("SARVESH");
		gbutton.addMouseListener(this);
		fbutton.addMouseListener(this);
		sbutton.addMouseListener(this);
		
		
		GridBagConstraints c=new GridBagConstraints();
		c.insets=new Insets(0,0,10,0);
		centerDownLeft=new JPanel(new GridBagLayout());
		c.gridx=0;
		c.gridy=0;
		centerDownLeft.add(gbutton,c);
		
		centerDownCenter=new JPanel(new GridBagLayout());
		c.gridx=0;
		c.gridy=0;
		centerDownCenter.add(fbutton,c);
		
		centerDownRight=new JPanel(new GridBagLayout());
		c.gridx=0;
		c.gridy=0;
		centerDownRight.add(sbutton,c);
		
		
		/*centerDown.add(gbutton);
		centerDown.add(fbutton);
		centerDown.add(sbutton);*/
		centerDown.add(centerDownLeft,BorderLayout.WEST);
		centerDown.add(centerDownCenter,BorderLayout.CENTER);
		centerDown.add(centerDownRight,BorderLayout.EAST);
		
		center.add(centerUp,BorderLayout.NORTH);
		center.add(centerDown,BorderLayout.SOUTH);
		
		
		userframe.add(top,BorderLayout.NORTH);
		userframe.add(center,BorderLayout.CENTER);
		userframe.add(bottom,BorderLayout.SOUTH);
		
		//userframe.setSize(550,400);
		userframe.setVisible(true);
		userframe.pack();
		
	}
	public void mouseClicked(MouseEvent me)
	{
		JButton action=(JButton)me.getSource();
		if (action==gbutton)
		{
			userframe.dispose();
			gaurav gau_window=new gaurav();
		}
		if (action==fbutton)
		{
			userframe.dispose();
			fauji fau_window=new fauji();
		}
		if (action==sbutton)
		{
			userframe.dispose();
			sarvesh sar_window=new sarvesh();
		}
		if(action==close)
		{
			userframe.dispose();
		}
	}
	public static void main(String args[])
	{
		users showusers=new users(); 
	}
	
}