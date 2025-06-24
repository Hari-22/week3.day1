package week3.day1;

public class Amazon extends CanaraBank {
	
	    

	@Override
	public void cashOnDelivery() {
		System.out.println("cod is ");
		recordPaymentDetails("COD", 2000);
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi is :");
		recordPaymentDetails("UPI", 1000);
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Processing Card payment...");
        recordPaymentDetails("Card", 2500.75);
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Processing Internet Banking payment is");
        recordPaymentDetails("Internet Banking", 3300.00);
		
	}
	public static void main(String[] args) {
		Amazon paymentdetails = new Amazon();
		
		paymentdetails.cashOnDelivery();
		paymentdetails.upiPayments();
		paymentdetails.internetBanking();
		paymentdetails.cardPayments();
		

	}

}
