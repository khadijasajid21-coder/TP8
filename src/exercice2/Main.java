package exercice2;

public class Main {
	public static void main(String[] args) {
		NotificationManager mgr = new NotificationManager();
		mgr.addChannel(new Email("khadija.sajid@gmail.com"));
		mgr.addChannel(new SMS("+212538729236"));
		mgr.addChannel(new PUSH("72hf33g"));
		
		mgr.broadcast("schems@gmailcom", "Votre commande est expédiée.");
		mgr.broadcast("+21248712476", "Veuillez vérifier votre compte");
		
	}
}
