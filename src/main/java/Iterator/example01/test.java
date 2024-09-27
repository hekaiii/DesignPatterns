package Iterator.example01;

import java.util.ArrayList;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/25
 */
public class test {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(new ArrayList<>());
    bookShelf.appendBook(new Book("book1"));
    bookShelf.appendBook(new Book("book2"));
    bookShelf.appendBook(new Book("book3"));
    bookShelf.appendBook(new Book("book4"));
    BookShelfIterator iterator = bookShelf.creatorIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().getName());
    }
  }
}
