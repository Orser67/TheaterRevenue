package theaterRevenue;
import javax.swing.*;

import java.awt.*;

/**
 * The InputPanel class creates a panel for entering ticket data
 * To-do: add string formatters to output properly formatted data
 */

public class OutputPanel extends JPanel{
	
	private JLabel adultTGLabel;
	private JLabel adultTNLabel;
	private JLabel childTGLabel;
	private JLabel childTNLabel;
	private JLabel totalGLabel;
	private JLabel totalNLabel;
	
	private JLabel adultTicketsGross;
	private JLabel adultTicketsNet;
	private JLabel childTicketsGross;
	private JLabel childTicketsNet;
	private JLabel totalGross;
	private JLabel totalNet;
	
	/**
	 * Constructor
	 */
	public OutputPanel()
	{
		//GridLayout manager with six rows and one column
		setLayout(new GridLayout(6, 2));
		//Border
		setBorder(BorderFactory.createTitledBorder("Revenue information"));
		
		//create non-changing labels
		adultTGLabel = new JLabel("Total adult gross: ");
		adultTNLabel = new JLabel("Total adult net: ");
		childTGLabel = new JLabel("Total child gross: ");
		childTNLabel = new JLabel("Total child net: ");
		totalGLabel = new JLabel("Total gross: ");
		totalNLabel = new JLabel("Total net: ");
		
		//create output labels
		adultTicketsGross = new JLabel();
		adultTicketsNet = new JLabel();
		childTicketsGross = new JLabel();
		childTicketsNet = new JLabel();
		totalGross = new JLabel();
		totalNet = new JLabel();
		
		//add text labels
		add(adultTGLabel);
		add(adultTicketsGross);
		add(adultTNLabel);
		add(adultTicketsNet);
		add(childTGLabel);
		add(childTicketsGross);
		add(childTNLabel);
		add(childTicketsNet);
		add(totalGLabel);
		add(totalGross);
		add(totalNLabel);
		add(totalNet);
	}
	
	/*
	 * setAdultTicketsGross method
	 * @set the gross for adult tickets
	 */
	public void setAdultTicketsGross(double doubleGross)
	{
		String stringGross = Double.toString(doubleGross);
		adultTicketsGross.setText("$" + stringGross);
	}
	
	/*
	 * setChildTicketGross method
	 * @set gross for child tickets
	 */
	public void setChildTicketsGross(double doubleGross)
	{
		String stringGross = Double.toString(doubleGross);
		childTicketsGross.setText("$" + stringGross);
	}
	
	/*
	 * setTotalGross method
	 * @set the gross for all tickets
	 */
	public void setTotalGross(double doubleGross)
	{
		String stringGross = Double.toString(doubleGross);
		totalGross.setText("$" + stringGross);
	}
	
	/*
	 * setAdultTicketsNet method
	 * @set the net for adult tickets
	 */
	public void setAdultTicketsNet(double doubleNet)
	{
		String stringNet = Double.toString(doubleNet);
		adultTicketsNet.setText("$" + stringNet);
	}
	
	/*
	 * setChildTicketsNet method
	 * @set the net for adult tickets
	 */
	public void setChildTicketsNet(double doubleNet)
	{
		String stringNet = Double.toString(doubleNet);
		childTicketsNet.setText("$" + stringNet);
	}
	
	/*
	 * setAdultTicketsNet method
	 * @set the net for adult tickets
	 */
	public void setTotalNet(double doubleNet)
	{
		String stringNet = Double.toString(doubleNet);
		totalNet.setText("$" + stringNet);
	}
}
