package AllSets;

import java.util.HashSet;

class Book {
	int PSNumber;
	String Designation;

	public Book(int PSNumber, String Designation) {
		this.PSNumber = PSNumber;
		this.Designation = Designation;
	}
}

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Book> HS = new HashSet<Book>();
		Book B1 = new Book(10645280, "Sr. Test Engineer");
		Book B2 = new Book(10645986, "Sr. Software Developer");
		Book B3 = new Book(10635529, "Sr. Test Engineer");
		Book B4 = new Book(10645672, "Sr. Project Lead");

		HS.add(B1);
		HS.add(B2);
		HS.add(B4);
		HS.add(B3);
		// HS.add(B3);
		// HS.add(null);

		for (Book b : HS) {
			System.out.println(b.PSNumber + " " + b.Designation);
		}
	}

}
