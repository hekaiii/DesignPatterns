package Iterator.test01;

import java.util.NoSuchElementException;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/27
 */
public class BookIterator implements BookShelfIterator{

  BookShelf bookShelf;

  public BookIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
  }

  Integer index = 0;

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
    } else {
      throw new NoSuchElementException("书架上没书了");
    }
  }
}
