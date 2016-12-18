package iterator_pattern;

public class BookShelf {
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsiza){
		this.books = new Book[maxsiza];
	}
	
	public Book getBookAt(int index){
		return books[index];
	}
	
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	
	public int getLength(){
		return last;
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
