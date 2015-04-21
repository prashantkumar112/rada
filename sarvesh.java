//author :: Prashant Kumar Anuragi

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class sarvesh extends MouseAdapter implements MouseListener
{
	JFrame sframe;
	JPanel top,center,centerUp, centerDown,bottom;
	JButton close,updateRada,back;
	ImageIcon sarvesh;
	JLabel simglabel,sname,reason,liye,diye,date;
	
	sarvesh()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		sframe=new JFrame("SARVESH");
		sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		sname=new JLabel("SARVESH AMETA");
		sarvesh=new ImageIcon(getClass().getResource("sarvesh.png"));
		simglabel=new JLabel(sarvesh);
		
		centerUp.add(sname);
		centerUp.add(simglabel);
		
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
		
		sframe.add(top,BorderLayout.NORTH);
		sframe.add(center,BorderLayout.CENTER);
		sframe.add(bottom,BorderLayout.SOUTH);
		
		sframe.setVisible(true);
		sframe.pack();
	}
	
	public void mouseClicked(MouseEvent me)
	{
		JButton action=(JButton)me.getSource();
		
		if(action==close)
		{
			sframe.dispose();
		}
		
		if(action==updateRada)
		{
			updateRada.setText("UPDATED");
		}
		if(action==back)
		{
			sframe.dispose();
			users usr_window=new users();
		}
	}
	public static void main(String args[])
	{
		sarvesh sar_frame=new sarvesh();
	}
	
}