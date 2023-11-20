package Task2;

import java.util.List;

public class Magazine extends Book {

	private String name;

	public Magazine(String title, int numPage, int year, String author, double price) {
		super(title, numPage, year, author, price);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String typeOfBook() {
		return "Magazine";
	}

	@Override
	public boolean checkTypeAndYear(int now) {
		return now - this.getYear() == 10;
	}

	@Override
	public int maxChap() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public boolean isMagazineHaveName(String name) {
		return this.getName().equals(name);
	}

	@Override
	public void addChapter(Chapter chapter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getYear();
	}

	
	


	
	
}
