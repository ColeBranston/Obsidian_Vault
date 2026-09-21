package lab02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;


import javax.swing.*;

public class Keyword
{
	public Keyword()
	{
		/*this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS ));
		
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		
		pan.add(jlbl_valid);
		pan2.add(jb_ex);
		
		this.add(pan);
		this.add(pan2);
		
		Listener listener = new Listener();
		jb_ex.addActionListener(listener);*/
		File file = null;
		
		JFileChooser choose = new JFileChooser();
		
		if(choose.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
			file = choose.getSelectedFile();
		try{
		read(file);
		}
		catch(FileNotFoundException ex)
		{
			
		}
	}

/*class Listener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "Example.txt")
		{
			try {
				read("Example.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}*/
	public void read(File port) throws FileNotFoundException
	{
	
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		Scanner input = new Scanner(port);
		String lineString = "";		
		while (input.hasNext())
		{
			lineString = input.nextLine();
			
			String[] words = lineString.split("[\\[\\] \n\t\r><=/.,;:!?(){}]");
			for (int i = 0; i < words.length; i++)
			{
				String key = words[i].toLowerCase();
				
				if(words[i].length()>= 1)
				{
					
				}
				
				if(map.get(key) == null) 
				{
					map.put(key, 1);
				} else 
				{
				int value = map.get(key);
					value++; map.put(key, value);
				}
			}
			
		}
		
		Set<String> x = map.keySet();
		for(Object p: x)
			System.out.println(p+ "\t" + map.get(p));
		
	}
}
