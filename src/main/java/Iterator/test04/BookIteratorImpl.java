package Iterator.test04;

import java.util.NoSuchElementException;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class BookIteratorImpl implements BookIterator{

  BookShelf bookShelf;

  Integer index = 0;
  public BookIteratorImpl(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
  }

  @Override
  public Boolean hasNext() {
    if (index < bookShelf.size) {
      return true;
    }
    return false;
  }

  @Override
  public Book next() {
    if (hasNext()) {
      return bookShelf.getBook(index++);
    }
    throw new NoSuchElementException("书架上没书了");
  }
}
