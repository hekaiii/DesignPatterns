package Iterator.test01;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;
import javax.lang.model.element.VariableElement;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/22
 */
public class BookShelf implements Aggregate {

  ArrayList<Book> books = new ArrayList<Book>();
  int size = 0;

  public void addBook(Book book) {
    books.add(book);
    size++;
  }

  public Book getBook(int index) {
    if (index < size) {
      return books.get(index);
    } else {
      throw new NoSuchElementException("没这本书");
    }
  }

  @Override
  public Iterator<Book> createBookIterator() {
    return new BookIterator(this);
  }
}
