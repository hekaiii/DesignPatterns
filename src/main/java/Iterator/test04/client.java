package Iterator.test04;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class client {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.addBook(new Book("book=01"));
    bookShelf.addBook(new Book("book=02"));
    bookShelf.addBook(new Book("book=03"));
    bookShelf.addBook(new Book("book=04"));
    BookIterator iterator = bookShelf.createIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());

    }
  }
}
