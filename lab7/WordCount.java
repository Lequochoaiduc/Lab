package EX7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class WordCount {
String Word ;
int count;
public WordCount(String Word, int count) {
	super();
	this.Word = Word;
	this.count = count;
}

@Override
public int hashCode() {
	 final int  prime = 31;
	 int result = 1;
	 result = prime * result + Word.hashCode();
		result = prime * result + count;
		return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())
		return false;
	WordCount other = (WordCount) obj;
	return Objects.equals(Word, other.Word) && count == other.count;
}

public String getWord() {
	return Word;
}
public void setCh(String Word) {
	this.Word = Word;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return "WordCount [ch=" + Word + ", count=" + count + "]";
}
public static void main(String[] args) throws FileNotFoundException {
	File file = new File("res/LOVE.txt");
	Scanner sc = new Scanner(file);
	while (sc.hasNext()) {
		String string = (String) sc.next();
		System.out.println(string);
		WordCount wc = new WordCount(string, 0);
		System.out.println(wc.hashCode());
	}
	
}
}
