package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CateGoryBook {
	private List<Book> list;

	public CateGoryBook() {
		this.list = new ArrayList<>();
	}

	public List<Book> getList() {
		return list;
	}

	public int sumPrice() {
		int result = 0;
		for (Book book : list) {
			result += book.getPrice();
		}
		return result;
	}

	public Book maxChapReferenceBook() {
		Book result = null;
		int max = 0;
		for (Book book : list) {
			if (book.getNumPage() > max) {
				max = book.getNumPage();
				result = book;
			}
		}
		return result;
	}

	public boolean isMagazineHaveName(String name) {
		for (Book book : list) {
			if (book.isMagazineHaveName(name))
				return true;

		}
		return false;
	}

	public List<Book> getBookByYear(int year) {
		List<Book> list = new ArrayList<>();
		for (Book book : list) {
			if (book.sameYear(year)) {
				list.add(book);
			}
		}
		return list;
	}

	public void sortBook() {
		list.sort(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if (o1.getYear() - o2.getYear() == 0)
					return o2.getYear() - o1.getYear();
				else
					return o1.getTitle().compareTo(o2.getTitle());
			}
		});
	}

	public Map<Integer, Integer> getBookByYear() {
		Map<Integer, Integer> result = new HashMap<>();
		for (Book book : list) {
			result.put(book.getYear(), result.getOrDefault(book.getYear(), 0) + 1);
		}
		return result;
	}

	public void addBook(Book book) {
		list.add(book);
	}

	public static void main(String[] args) {
		Book b1 = new Magazine("Car", 100, 2020, "Ferrari", 50000.0);
		Book b2 = new Magazine("Football", 50, 2023, "Mourinho", 30000.0);
		Book b3 = new Magazine("SmartPhone", 90, 2021, "Apple", 10000.0);

		Chapter c1 = new Chapter("X", 20);
		Chapter c2 = new Chapter("Y", 10);
		Chapter c3 = new Chapter("Z", 25);
		Chapter c4 = new Chapter("A", 30);
		Chapter c5 = new Chapter("B", 10);
		Chapter c6 = new Chapter("C", 40);

		Book b4 = new ReferenceBook("OPP", 100, 2020, "Monkey", 100000.0);
		Book b5 = new ReferenceBook("Algorithm", 120, 2021, "Lamp", 200000.0);
		Book b6 = new ReferenceBook("Structure", 90, 2022, "Banana", 300000.0);

		b4.addChapter(c1);
		b5.addChapter(c2);
		b6.addChapter(c3);
		b4.addChapter(c4);
		b5.addChapter(c5);
		b6.addChapter(c6);

		CateGoryBook cateGoryBook = new CateGoryBook();
		cateGoryBook.addBook(b1);
		cateGoryBook.addBook(b2);
		cateGoryBook.addBook(b3);
		cateGoryBook.addBook(b4);
		cateGoryBook.addBook(b5);
		cateGoryBook.addBook(b6);

		System.out.println(b1.typeOfBook());
		System.out.println(b4.typeOfBook());

		System.out.println(b2.checkTypeAndYear(2033));
		System.out.println(b4.checkTypeAndYear(2031));

		System.out.println(b3.checkSameTypeAndAuthor(b1));
		System.out.println(b6.checkSameTypeAndAuthor(b1));

		System.out.println(cateGoryBook.sumPrice());

		System.out.println(cateGoryBook.maxChapReferenceBook());

//		System.out.println(cateGoryBook.isMagazineHaveName("Football"));
//		System.out.println(cateGoryBook.isMagazineHaveName("OPP"));

		System.out.println(Arrays.toString(cateGoryBook.getBookByYear(2021).toArray()));

		cateGoryBook.sortBook();
		System.out.println(Arrays.toString(cateGoryBook.list.toArray()));
		
		 System.out.println(cateGoryBook.getBookByYear());

	}
}
