package Iterator.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/25
 */
public class BookShelf implements Aggregate{

  private List<Book> books = new ArrayList<>();

  public BookShelf(List<Book> books) {
    this.books = books;
  }

  public Book getBookAt(Integer index) {
    return books.get(index);
  }

  public void appendBook(Book book) {
    this.books.add(book);
  }

  public Integer getLength() {
    return books.size();
  }

  @Override
  public BookShelfIterator creatorIterator() {
    return new BookShelfIteratorImpl(this);
  }

}
