package week3.day1;

public abstract class CanaraBank implements Paayments {

	
	 public void recordPaymentDetails(String paymentType, double amount) {
	        System.out.println("Type: " + paymentType);
	        System.out.println("Amount: ₹" + amount);
	    }
	
	
}
