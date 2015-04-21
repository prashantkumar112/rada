//author :: Prashant Kumar Anuragi

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class gaurav extends MouseAdapter implements MouseListener
{
	JFrame gframe;
	JPanel top,center,centerUp, centerDown,bottom;
	JButton close,updateRada,back;
	ImageIcon gaurav;
	JLabel gimglabel,gname,reason,liye,diye,date;
	
	gaurav()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		gframe=new JFrame("GAURAV");
		gframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		top=new main_panel();
		
		bottom=new JPanel();
		close=new JButton("CLOSE");
		updateRada=new JButton("UPDATE RADA");
		back=new JButton("BACK");
		
		close.addMouseListener(this);
		updateRada.addMouseListener(this);
		back.addMouseListener(this);
		
		bottom.add(close);
		bottom.add(updateRada);
		bottom.add(back);
		bottom.setBackground(new Color(0,0,0,255));
		
		center=new JPanel(new GridLayout(2,1));
		
		centerUp=new JPanel(new GridLayout(1,2));
		gname=new JLabel("GAURAV KUMAR");
		gaurav=new ImageIcon(getClass().getResource("gaurav.png"));
		gimglabel=new JLabel(gaurav);
		
		centerUp.add(gname);
		centerUp.add(gimglabel);
		
		centerDown=new JPanel(new GridLayout(1,4));
		reason=new JLabel("WAJAH");
		liye=new JLabel("ROKDO LIYO");
		diye=new JLabel("ROKDO DIYO");
		date=new JLabel("TAREEK PE TAREEKH");
		centerDown.add(reason);
		centerDown.add(liye);
		centerDown.add(diye);
		centerDown.add(date);
		
		center.add(centerUp);
		center.add(centerDown);
		
		gframe.add(top,BorderLayout.NORTH);
		gframe.add(center,BorderLayout.CENTER);
		gframe.add(bottom,BorderLayout.SOUTH);
		
		gframe.setVisible(true);
		gframe.pack();
	}
	
	public void mouseClicked(MouseEvent me)
	{
		JButton action=(JButton)me.getSource();
		
		if(action==close)
		{
			gframe.dispose();
		}
		
		if(action==updateRada)
		{
			updateRada.setText("UPDATED");
		}
		if(action==back)
		{
			gframe.dispose();
			users usr_window=new users();
		}
	}
	public static void main(String args[])
	{
		gaurav gau_frame=new gaurav();
	}
	
}