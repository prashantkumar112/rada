//author :: Prashant Kumar Anuragi

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class fauji extends MouseAdapter implements MouseListener
{
	JFrame fframe;
	JPanel top,center,centerUp, centerDown,bottom;
	JButton close,updateRada,back;
	ImageIcon fauji;
	JLabel fimglabel,fname,reason,liye,diye,date;
	
	fauji()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		fframe=new JFrame("fauji");
		fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		fname=new JLabel("FAUJI");
		fauji=new ImageIcon(getClass().getResource("fauji.png"));
		fimglabel=new JLabel(fauji);
		
		centerUp.add(fname);
		centerUp.add(fimglabel);
		
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
		
		fframe.add(top,BorderLayout.NORTH);
		fframe.add(center,BorderLayout.CENTER);
		fframe.add(bottom,BorderLayout.SOUTH);
		
		fframe.setVisible(true);
		fframe.pack();
	}
	
	public void mouseClicked(MouseEvent me)
	{
		JButton action=(JButton)me.getSource();
		
		if(action==close)
		{
			fframe.dispose();
		}
		
		if(action==updateRada)
		{
			updateRada.setText("UPDATED");
		}
		if(action==back)
		{
			fframe.dispose();
			users usr_window=new users();
		}
	}
	public static void main(String args[])
	{
		fauji fau_frame=new fauji();
	}
	
}