/**
 * 
 * this class holds the server's information and methods pertaining to the server's salary
 * @author Emma Gertje
 *
 */
public class Server {
	private String name;
	private double cashTips;
	private double cardTips;
	private double salary;
	private double hoursWorked;
	
	Server(String name2, double cashTips, double cardTips, double salary, double hoursWorked) {
		this.name = name2;
		this.cashTips = cashTips;
		this.cardTips = cardTips;
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}
	
	// returns the cash tips the server got for a night
	  public double getCashTips() {
	    return this.cashTips;
	  }
	 
	// returns the card tips the server got for a night
	  public double getCardTips() {
		    return this.cardTips;
		  }
	
	// returns the amount in terms of salary the server got for a night
		  public double getSalaryEarnings() {
		    return this.salary*this.hoursWorked;
		  }
		  
	// returns the total amount the server earned for the night
		  public double totalEarnings() {
			  return this.cashTips + this.cardTips + (this.hoursWorked*this.salary);
		  }
		  
	// returns the hourly wage of the server with all of their earnings
		  public double hourlyWage() {
			  return (this.cashTips + this.cardTips + (this.salary*this.hoursWorked))/this.hoursWorked;
		  }
		  
	// returns if the server earned minimum wage or not
		  public boolean isMinimumWageEarned(double minimumWage) {
			  if (((this.cashTips + this.cardTips + (this.salary*this.hoursWorked))/this.hoursWorked) >= minimumWage) {
				  return true;
			  }
			  else {
				  return false;
			  }
		  }
		  
	//returns the amount of money the server still needs if they did not make minimum wage
		  public double moneyStillNeeded(double minimumWage) {
			  if (((this.cashTips + this.cardTips + (this.salary*this.hoursWorked))/this.hoursWorked) < minimumWage) {
				  return ((minimumWage*this.hoursWorked) - (this.cashTips + this.cardTips + (this.hoursWorked*this.salary)));
			  }
			  else {
				  return 0;
			  }
		  }
		  
	//returns the phrases I will use in the main method 
		  public String mainMethodResponse(double minWage) {
			  if(this.isMinimumWageEarned(minWage)) {
	            return "This server earned minimum wage. They do not need to be payed any more money for their shift.";
	            }
			  
			  else {
				return"This server did not earn minimum wage. They need to be payed $" + this.moneyStillNeeded(minWage) + " more for their shift.";
			  }
		  }
		  
}
		 
	




