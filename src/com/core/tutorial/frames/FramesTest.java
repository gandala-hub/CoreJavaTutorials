package com.core.tutorial.frames;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FramesTest {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		  final JTextField tf=new JTextField();  
		    tf.setBounds(50,50, 150,20);  
	
		 JButton b=new JButton("Click Here");  
		    b.setBounds(50,100,95,30);  
		    b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
				tf.setText("Welcome to Javatpoint.");  
		        }  
		    }); 
		    
		    frame.add(b);
		    frame.add(tf);  
		    frame.setSize(400,400);  
		    frame.setLayout(null);  
		    frame.setVisible(true);   
		
	}	

}


