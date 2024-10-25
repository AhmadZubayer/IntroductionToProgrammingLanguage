class Books{
	String name;
	String genre;
	int year;
	
	public Books(String name, String genre, int year) {
		this.setName(name);
		this.setGenre(genre);
		this.setYear(year);
	}
	
	// Constructor overloading 
	// Copy constructor for book3
	public Books(Books book) {
		this.copy(book);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	// COPY OBJECTS----------------------
	// Same Attributes, different books
	public void copy(Books book) {
		this.setName(book.getName());
		this.setGenre(book.getGenre());
		this.setYear(book.getYear());	
	}
	

	

}


public class CopyObjects_Books {
	public static void main(String[] args) {
		Books book1 = new Books("The Haunting of Hill House", "Gothic Horror Novel", 1959);
		Books book2 = new Books("Deception Point", "Mystery-thriller novel", 2001);
		//book2= book1; 
		// DO NOT do this. Pointing to the same address in the memory, displays same memory address 
		
		book2.copy(book1);
		
		Books book3 = new Books(book1); // Requires a "Copy constructor"
		
		System.out.println(book1);  // Displays Memory address 
		System.out.println(book2);
		System.out.println(book3);
		// 3 different memory address
		System.out.println();
		System.out.println(book1.getName());
		System.out.println(book1.getGenre());
		System.out.println(book1.getYear());
		System.out.println();
		System.out.println(book2.getName());
		System.out.println(book2.getGenre());
		System.out.println(book2.getYear());
		System.out.println();
		System.out.println(book3.getName());
		System.out.println(book3.getGenre());
		System.out.println(book3.getYear());
		
	}
   
}
