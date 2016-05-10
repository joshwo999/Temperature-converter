
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Converter extends JFrame
	{
		static double convertedTemp;
		static String userTemp;
		static String userScale;
		static JFrame frame = new JFrame();
		public static void main(String[] args)
			{
				convertTemperatures();
			}
		public static void convertTemperatures()
		{
			String[] scales={"Farenheit", "Celsius"};
			
			final JComboBox<String> combo = new JComboBox<>(scales);
			String title="Input temperature and scale.";
			userTemp= JOptionPane.showInputDialog(null, combo, title,JOptionPane.INFORMATION_MESSAGE );
			double number= Double.parseDouble(userTemp);
			
			 Object scale =(String)combo.getSelectedItem();
			if(scale.equals("Farenheit"))
					{
						convertedTemp=(5.0/9.0)*(number-32.0);
						JOptionPane.showMessageDialog(frame, userTemp+" "+((String) scale).substring(0,1)+" = " + convertedTemp + " C");	
					}
			else
				{
					convertedTemp=(number*9.0/5.0)+(32);
					JOptionPane.showMessageDialog(frame, userTemp+" "+((String) scale).substring(0,1)+" = " + convertedTemp + " F");
				}
			
			/*
			if((userScale.equals("f"))||(userScale.equals("F")))
				{
				 convertedTemp=(5.0/9.0)*(number-32.0);
				 JOptionPane.showMessageDialog(frame, userTemp+" "+userScale.toUpperCase()+" = " + convertedTemp + " C");
				}
			else
				{
					convertedTemp=(number*9.0/5.0)+(32);
					JOptionPane.showMessageDialog(frame, userTemp+" "+userScale.toUpperCase()+" = " + convertedTemp + " F");
				}
				*/
			
		}

	}



/*
switch(scale)
{
	case ;
			{
				convertedTemp=(5.0/9.0)*(number-32.0);
				JOptionPane.showMessageDialog(frame, userTemp+" "+userScale.toUpperCase()+" = " + convertedTemp + " C");
				break;
			}
	default:
			{
				convertedTemp=(number*9.0/5.0)+(32);
				JOptionPane.showMessageDialog(frame, userTemp+" "+userScale.toUpperCase()+" = " + convertedTemp + " F");
				break;
			}
}
*/