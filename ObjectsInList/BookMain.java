package ObjectsInList;
import java.util.Scanner;
import java.util.ArrayList;
public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Title of the book: ");
            String title = scan.nextLine();
            if (title.isBlank()) break;
            System.out.print("How many pages: ");
            Integer page = Integer.valueOf(scan.nextLine());
            System.out.print("Published Year: ");
            Integer year = Integer.valueOf(scan.nextLine());
            books.add(new Book(title, page, year));
        }
        System.out.println("What information will be printed?");
        String info = scan.nextLine();

        if (info.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));
            }
        } else if (info.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getName());
            }
        }
    }
}
