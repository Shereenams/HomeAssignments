package week1.day2.homeAssignments;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully"); //To print the statement
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Bood issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();		//create object to call both methods
		lib.addBook("Harry potter");		//method called.
		lib.issueBook();
	}

}
