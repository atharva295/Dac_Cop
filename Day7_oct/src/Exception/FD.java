package Exception;


public class FD extends Account {
	private int tenure;
	private int amount;
	private double roi ;
	
	public FD() {
		
	}
	public FD(String name, long accNumber, int amount, int tenure,double roi) {
		super.name = name ;
		super.accNumber = accNumber ;
		this.amount = amount;
		this.tenure = tenure ;
		this.roi = roi ;
		
	}
	
	
	@Override
	public String toString() {
		return "FdAccount [Name="+super.name+
				"\n Account Number= "+super.accNumber+
				"\n amount=" + amount + 
				"\n roi=" + roi +
				"tenure=" + tenure + "]";
	}


	protected int getTenure() {
		return tenure;
	}
	
	protected int getAmount() {
		return amount;
	}
	protected void setAmount(int amount) {
		this.amount = amount;
	}
	protected double getRoi() {
		return roi;
	}
	
	public double calIntrest() {
		double intr ;
		intr = (amount*tenure*roi)/100 ;
		return intr ;
	}
	
	
}
