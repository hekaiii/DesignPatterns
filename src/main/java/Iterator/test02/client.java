package Iterator.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/9
 */
public class client {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.addBook(new Book("book-1"));
    bookShelf.addBook(new Book("book-2"));
    bookShelf.addBook(new Book("book-3"));
    bookShelf.addBook(new Book("book-4"));
    BookShelfIterator bookShelfIterator = bookShelf.createBookShelfIterator();
    while (bookShelfIterator.hasNext()) {
      System.out.println(bookShelfIterator.next());
    }
  }

}
