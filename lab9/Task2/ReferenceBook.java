package Task2;

import java.util.ArrayList;
import java.util.List;

public class ReferenceBook extends Book {

	private String field;
	private List<Chapter> chapters;

	public ReferenceBook(String title, int numPage, int year, String author, double price) {
		super(title, numPage, year, author, price);
		// TODO Auto-generated constructor stub
		this.field = field;
		this.chapters = new ArrayList<>();
	}

	@Override
	public String typeOfBook() {
		return "Reference Book";
	}

	@Override
	public boolean checkTypeAndYear(int now) {
		return false;
	}

	@Override
	public int maxChap() {
		int max = 0;
		for (Chapter chapter : chapters) {
			if (chapter.getNumPage() > max) {
				max = chapter.getNumPage();
			}
		}
		return max;
	}

	@Override
	public boolean isMagazineHaveName(String name) {
		// TODO Auto-generated method stub
		return false;
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
