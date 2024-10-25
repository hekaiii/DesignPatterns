package Iterator.test04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class BookShelf implements Aggregate {

  ArrayList<Book> books = new ArrayList<>();
  Integer size = 0;

  public void addBook(Book book) {
    books.add(book);
    size++;
  }

  public Book getBook(Integer index) {
    return books.get(index);
  }

  @Override
  public BookIterator createIterator() {
    return new BookIteratorImpl(this);
  }
}
