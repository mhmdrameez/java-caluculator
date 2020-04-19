import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculator implements ActionListener{	
	boolean  isoperatorClicked=false;
	
	
	JFrame jf;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton addButton;
	JButton minButton;
	JButton clearButton;
	String oldValue;
	
	
	
	
	
	
	JLabel displayLabel;
	public calculator(){
		jf=new JFrame(" BASIC CALCULATOR");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(30,50,540,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,320,80,80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,320,80,80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230,320,80,80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230,430,80,80);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330,130,80,80);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(330,230,80,80);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minButton=new JButton("-");
		minButton.setBounds(330,320,80,80);
		minButton.addActionListener(this);
		jf.add(minButton);
		
		addButton=new JButton("+");
		addButton.setBounds(330,430,80,80);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton=new JButton("c");
		clearButton.setBounds(430,430,80,80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	
	
		
	}
	public static void main(String a[])
	{
		new calculator();
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==sevenButton)
		{
			if(isoperatorClicked)
			{
				displayLabel.setText("7");
				isoperatorClicked=false;
				
				
			}
			else 
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"7");
		    }
		}
		else if(e.getSource()==eightButton)
		{
			
			if(isoperatorClicked)
			{
				displayLabel.setText("8");
				isoperatorClicked=false;
				
				
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"8");
		    }
	    }
	   else if(e.getSource()==nineButton)
	    {
				if(isoperatorClicked)
			{
				displayLabel.setText("9");
				isoperatorClicked=false;
				
				
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"9");
		    }			
		}
	   else if(e.getSource()==fourButton)
	    {
				if(isoperatorClicked)
			{
				displayLabel.setText("4");
				isoperatorClicked=false;
				
				
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"4");
		    }
		}
	   else if(e.getSource()==fiveButton)
	    {
				if(isoperatorClicked)
			{
				displayLabel.setText("5");
				isoperatorClicked=false;
				
				
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"5");
		    }
			
			
			
			
			
			
		}
	 else if(e.getSource()==sixButton)
	    {
				if(isoperatorClicked)
			{
				displayLabel.setText("6");
				isoperatorClicked=false;
				
				
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"6");
		    }
	   }
	
	 else if(e.getSource()==oneButton)
	    {
				if(isoperatorClicked)
			{
				displayLabel.setText("1");
				isoperatorClicked=false;
				
				
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"1");
		    }	
		}
		else if(e.getSource()==twoButton)
	    {
				if(isoperatorClicked)
			{
				displayLabel.setText("2");
				isoperatorClicked=false;	
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"2");
		    }	
		}
		else if(e.getSource()==threeButton)
	    {
				if(isoperatorClicked)
			{
				displayLabel.setText("3");
				isoperatorClicked=false;	
			}
			else
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"3");
		    }	
		}
		else if(e.getSource()==dotButton)
	    {
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+".");
		}
		else if(e.getSource()==equalButton)
	    {
			
			String newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float  newValueF=Float.parseFloat(newValue);
			
			float result=oldValueF+newValueF;
			displayLabel.setText(result+"");
			
		}
		else if(e.getSource()==zeroButton)
	    {
			if(isoperatorClicked)
			{
				displayLabel.setText("0");
				isoperatorClicked=false;	
			}
			else 
			{
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"0");
		    }	
		}
		else if(e.getSource()==divButton)
	    {
			displayLabel.setText("/");
		}
		else if(e.getSource()==mulButton)
	    {
			displayLabel.setText("*");
		}
		else if(e.getSource()==addButton)
	    {
			isoperatorClicked=true;
			oldValue=displayLabel.getText();
			
		}
		else if(e.getSource()==minButton)
	    {
			displayLabel.setText("-");
		}
		else if(e.getSource()==clearButton)
	    {
			displayLabel.setText("");
		}
		
	
	}

	
}
