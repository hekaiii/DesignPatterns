package Iterator.example01;

import java.util.NoSuchElementException;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/25
 */
public class BookShelfIteratorImpl implements BookShelfIterator{

  private BookShelf bookShelf;

  private Integer index = 0;
  public BookShelfIteratorImpl(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
  }

  @Override
  public Boolean hasNext() {
    return index < bookShelf.getLength();
  }

  @Override
  public Book next() {
    if (!hasNext()) {
      throw new NoSuchElementException("没有更多书籍了");
    }
    return bookShelf.getBookAt(index++);
  }
}
