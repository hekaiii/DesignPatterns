package Iterator.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/22
 */
public class client {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.addBook(new Book("BOOK1"));
    bookShelf.addBook(new Book("BOOK2"));
    bookShelf.addBook(new Book("BOOK3"));
    bookShelf.addBook(new Book("BOOK4"));
    Iterator<Book> iterator = bookShelf.createBookIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
