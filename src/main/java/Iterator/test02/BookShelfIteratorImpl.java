package Iterator.test02;

import java.util.NoSuchElementException;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/9
 */
public class BookShelfIteratorImpl implements BookShelfIterator {
  BookShelf bookShelf;

  int index = 0;

  public BookShelfIteratorImpl(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
  }

  @Override
  public Boolean hasNext() {
    if (bookShelf.size <= index) {
      return false;
    } else {
//      System.out.println("index"+index);
      return true;
    }
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
