package Iterator.test03;


import java.util.NoSuchElementException;
import javax.swing.plaf.TreeUI;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/10
 */
public class BookIteratorImpl implements BookInterator{

  BookShelf bookShelf;

  Integer index = 0;

  public BookIteratorImpl(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
  }

  @Override
  public Boolean hasNext() {
    if (index >= bookShelf.size) {
      return false;
    }
    return true;
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
