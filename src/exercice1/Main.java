package exercice1;

public class Main {
	public static void main(String[] args) {
		 PaymentProcessor processor = new PaymentProcessor();
		 
		 processor.addMethod(new CreditCard("1234-4574-2749-8483", "khadija", 4000));
		 processor.addMethod(new PayPal("khadija.sajid@gmail.com", 1000));
		 processor.addMethod(new Bitcoin("1A2b3C4d5E", 0.10));
		 
		 double montant = 3000;
		 processor.processPayments(montant);
	}

}
