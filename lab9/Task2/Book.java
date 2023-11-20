package Task2;

public abstract class Book {
	private String title;
	private int numPage;
	private int year;
	private String author;
	private double price;

	public Book(String title, int numPage, int year, String author, double price) {
		this.title = title;
		this.numPage = numPage;
		this.year = year;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumPage() {
		return numPage;
	}

	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract String typeOfBook();
	public abstract boolean checkTypeAndYear(int now); 
	
	public boolean checkSameTypeAndAuthor(Book other) {
		return this.getClass().equals(other.getClass()) && this.getAuthor().equals(other.getAuthor());
	}
	public abstract int maxChap();
	public abstract boolean isMagazineHaveName(String name);
	public boolean sameYear(int year) {
		return this.getYear() == year;
	}
	public abstract void addChapter(Chapter chapter);
}
