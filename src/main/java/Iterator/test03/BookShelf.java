package Iterator.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/10
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
  public BookInterator creatIterator() {
    return new BookIteratorImpl(this);
  }
}
