package VK;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class xx implements ActionListener
	{
	    static JLabel text;
	    //Driver function
	    public static void main(String args[])
	    {
	    
	     
		//Create a frame
		JFrame frame = new JFrame("Menu");
		
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
	    JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);  
	    textLabel.setPreferredSize(new Dimension(300, 100));      
	    frame.getContentPane().add(textLabel, BorderLayout.CENTER);      
	    //Display the window.       
	    frame.setLocationRelativeTo(null);       
	    frame.pack();       
	    frame.setVisible(true);    
	    }    
	   
		
		//Create an object
		xx obj = new xx();
		//Create a Menu
		
		
		JMenu menu = new JMenu("EmployeesDetails");
		
		
		//Create Menu Items
		JMenuItem item[] = new JMenuItem[5];
		for(int i=0;i<5;i++)
		{
		    item[i]=new JMenuItem("Item "+(i+1));
		    item[i].addActionListener(obj);
		    menu.add(item[i]);
		}
		//Create a menu bar
		JMenuBar mb=new JMenuBar();
		mb.add(menu);
		frame.setJMenuBar(mb);
		//Create the label
		text = new JLabel();
		frame.add(text);
		//Display the frame
		frame.setVisible(true);
	    }
	    //Function to display the menu item selected
	    public void actionPerformed(ActionEvent e)
	    {
		text.setText("Menu Item Selected : "+e.getActionCommand());
	    }
	 
	}
	  		
	

	    
	 
          
          
          
        
	

