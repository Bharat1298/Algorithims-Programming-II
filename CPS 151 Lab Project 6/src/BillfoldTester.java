/**
 * CPS 151 - Algorithms & Programming II
 * 
 * Lab 06 - Interfaces
 * 
 * @author Lacie Stiffler
 */
public class BillfoldTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billfold b = new Billfold();
	     
	      b.addCard( new DriverLicense("John Doe", 2020) );
	      b.addCard( new CallingCard("Omega Card", "301233985945", 1030) );
	      b.addCard( new IDCard("Mary Smith", "95-741208") );
	      
	      b.compareCards();
	}

}
