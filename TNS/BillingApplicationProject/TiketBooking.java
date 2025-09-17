package BillingApplicationProject;

public class TiketBooking {
    private String stageEvent;
	private String customer;
	private String noOfSeats;
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TiketBooking() {      //default constructor
		super();
	}
    public TiketBooking(String stageEvent, String customer, Integer noOfSeats) {   //parameter constructor
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = "noOfSeats";
	}
	
	 // Overloaded methods
    public void makePayment(Double amount) {
        System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\nAmount %.1f paid in cash\n",
                stageEvent, customer, noOfSeats, amount);
    }

    public void makePayment(String walletNumber, Double amount) {
        System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\nAmount %.1f paid using wallet number %s\n",
                stageEvent, customer, noOfSeats, amount, walletNumber);
    }

    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\nHolder name:%s\nAmount %.1f paid using %s card\nCCV:%s\n",
                stageEvent, customer, noOfSeats, name, amount, creditCard, ccv);
    }

}
