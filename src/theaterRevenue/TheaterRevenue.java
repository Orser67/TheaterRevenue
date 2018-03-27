package theaterRevenue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class creates a movie theater revenue calculator with a GUI
 * @author Chris Orser
 *
 */
public class TheaterRevenue extends JFrame {
	final double PERCENT_REVENUE = .2; //percent of revenue kept by theater
	
	InputPanel inputPanel;
	OutputPanel outputPanel;
	
	JPanel buttonPanel;
	JButton calcButton;
	JButton exitButton;
	JLabel instructionsLabel;
		
	/**
	 * Constructor
	*/
	public TheaterRevenue()
	{
		setTitle("Theater Revenue Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 3));
		
		//create the custom panels
		inputPanel = new InputPanel();
		outputPanel = new OutputPanel();
		buildButtonPanel();
		
		//add to layout
		add(inputPanel);
		add(outputPanel);
		add(buttonPanel);
		
		//pack and display
		pack();
		setVisible(true);
	}
	
	/**
	 * The buildButtonPanel method builds a panel to hold the buttons
	 */
	private void buildButtonPanel()
	{
		//create panel
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		
		//create buttons
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		//Register action listeners
		calcButton.addActionListener(new CalcListener());
		exitButton.addActionListener(new ExitListener());
		
		//add buttons to panel
		buttonPanel.add(calcButton, BorderLayout.CENTER);
		buttonPanel.add(exitButton, BorderLayout.SOUTH);
		
		//create and add label
		instructionsLabel = new JLabel("Do not enter \"$\" sign", SwingConstants.CENTER);
		buttonPanel.add(instructionsLabel, BorderLayout.NORTH);
	}
	
	/**
	 * Private inner class to handle button events
	 */
	private class CalcListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			//retrieve data from text fields
			int adultTicketsSold = inputPanel.getAdultTicketsSold();
			int childTicketsSold = inputPanel.getChildTicketsSold();
			double adultTicketsPrice = inputPanel.getAdultTicketsPrice();
			double childTicketsPrice = inputPanel.getChildTicketsPrice();
		
			//calculate the gross revenue
			double grossAdult = adultTicketsSold * adultTicketsPrice;
			double grossChild = childTicketsSold * childTicketsPrice;
			double totalGross = grossAdult + grossChild;
		
			//Calculate the net revenue
			double netAdult = (adultTicketsSold * adultTicketsPrice) * PERCENT_REVENUE;
			double netChild = (childTicketsSold * childTicketsPrice) * PERCENT_REVENUE;
			double totalNet = netAdult + netChild;
		
			outputPanel.setAdultTicketsGross(grossAdult);
			outputPanel.setChildTicketsGross(grossChild);
			outputPanel.setTotalGross(totalGross);
			outputPanel.setAdultTicketsNet(netAdult);
			outputPanel.setChildTicketsNet(netChild);
			outputPanel.setTotalNet(totalNet);
		}
	}
	
	private class ExitListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			System.exit(0);
		}
	}
	/*
	 * Main method
	 */
	public static void main(String[] args)
	{
		new TheaterRevenue();
	}
}
