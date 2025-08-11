
public class Movie {
	String title;
	String director; 
	int year; 
	
	public Movie(String title, String director, int year) {
		this.title = title; 
		this.director = director;
		this.year = year; 
	}
	void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Director: " + director);
		System.out.println("Year: " + year);  
	}
}
	
