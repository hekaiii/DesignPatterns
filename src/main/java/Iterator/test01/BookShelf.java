package Iterator.test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/27
 */
public class BookShelf implements Aggregate{

  List<Book> books = new ArrayList<>();
  Integer size = 0;

  public void addBook(Book book) {
    books.add(book);
    size++;
  }

  public Book getBook(Integer index) {
    return books.get(index);
  }

  @Override
  public BookShelfIterator createBookShelfIterator() {
    return  new BookIterator(this);
  }
}
