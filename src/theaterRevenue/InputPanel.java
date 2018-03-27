package theaterRevenue;
import javax.swing.*;
import java.awt.*;

/**
 * The InputPanel class creates a panel for entering ticket data
 */

public class InputPanel extends JPanel{
	
	private JLabel adultTPLabel;
	private JLabel adultTSLabel;
	private JLabel childTPLabel;
	private JLabel childTSLabel;
	
	private JTextField adultTicketsPrice;
	private JTextField adultTicketsSold;
	private JTextField childTicketsPrice;
	private JTextField childTicketsSold;
	
	/**
	 * Constructor
	 */
	public InputPanel()
	{
		//GridLayout manager with four rows and two column
		setLayout(new GridLayout(4, 2));
		//Border
		setBorder(BorderFactory.createTitledBorder("Ticket information"));
		
		//create labels
		adultTPLabel = new JLabel("Adult ticket prices: ");
		adultTSLabel = new JLabel("Adult tickets sold: ");
		childTPLabel = new JLabel("Child ticket prices: ");
		childTSLabel = new JLabel("Child tickets sold: ");
		
		//create text fields
		adultTicketsPrice = new JTextField();
		adultTicketsSold = new JTextField();
		childTicketsPrice = new JTextField();
		childTicketsSold = new JTextField();
		
		//add in correct order
		add(adultTPLabel);
		add(adultTicketsPrice);
		add(adultTSLabel);
		add(adultTicketsSold);
		add(childTPLabel);
		add(childTicketsPrice);
		add(childTSLabel);
		add(childTicketsSold);
	}
	
	/**
	 * adultTicketsSold method
	 * @return The number of adult ticket sold
	 */
	public int getAdultTicketsSold()
	{
		int tickets = 0;
		String stringTickets;
		stringTickets = adultTicketsSold.getText();
		
		//prompt for user input if invalid data entered
		try {
			tickets = Integer.parseInt(stringTickets);
		}
		catch (NumberFormatException e)
		{
			adultTicketsSold.setText("Enter an integer");
		}
		return tickets;
	}
	
	/**
	 * childTicketsSold method
	 * @return The number of adult ticket sold
	 */
	public int getChildTicketsSold()
	{
		int tickets = 0;
		String stringTickets;
		stringTickets = childTicketsSold.getText();
		
		//prompt for user input if invalid data entered
		try {
			tickets = Integer.parseInt(stringTickets);
		}
		catch (NumberFormatException e)
		{
			childTicketsSold.setText("Enter an integer");
		}
		return tickets;
	}
	
	/**
	 * getAdultTicketsPrice method
	 * @return The price of adult tickets
	 */
	public double getAdultTicketsPrice()
	{
		double price = 0;
		String stringPrice;
		stringPrice = adultTicketsPrice.getText();
		
		//remove dollar sign if necessary
		if(stringPrice.charAt(0) == '$')
		{
			stringPrice = stringPrice.substring(1);
		}
		
		//prompt for user input if invalid data entered
		try {
			price = Double.parseDouble(stringPrice);
		}
		catch (NumberFormatException e)
		{
			adultTicketsPrice.setText("Enter a number");
		}
		return price;
	}
	
	/**
	 * getChildTicketsPrice method
	 * @return The price of children's tickets
	 */
	public double getChildTicketsPrice()
	{
		double price = 0;
		String stringPrice;
		stringPrice = childTicketsPrice.getText();
		
		//remove dollar sign if necessary
		if(stringPrice.charAt(0) == '$')
		{
			stringPrice = stringPrice.substring(1);
		}
		
		//prompt for user input if invalid data entered
		try {
			price = Double.parseDouble(stringPrice);
		}
		catch (NumberFormatException e)
		{
			childTicketsPrice.setText("Enter a number");
		}
		return price;
	}
	
}
