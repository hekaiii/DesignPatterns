package Iterator.test03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/10
 */
public class client {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.addBook(new Book("book=001"));
    bookShelf.addBook(new Book("book=002"));
    bookShelf.addBook(new Book("book=003"));
    bookShelf.addBook(new Book("book=004"));
    BookInterator bookInterator = bookShelf.creatIterator();
    while (bookInterator.hasNext()) {
      System.out.println(bookInterator.next());
    }
  }
}
