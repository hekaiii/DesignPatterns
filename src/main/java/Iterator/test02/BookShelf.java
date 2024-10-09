package Iterator.test02;

import java.util.ArrayList;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/9
 */
public class BookShelf implements Aggregate{

  ArrayList<Book> books = new ArrayList<>();
  int size = 0;

  public void addBook(Book book) {
    books.add(book);
    size++;
  }

  public Book getBook(int index) {
    return books.get(index);
  }

  @Override
  public BookShelfIterator createBookShelfIterator() {
    return new BookShelfIteratorImpl(this) ;
  }
}
