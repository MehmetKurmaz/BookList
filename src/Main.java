import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Kitap 1", 200, "Yazar 1", "01/01/2023"));
        books.add(new Book("Kitap 2", 250, "Yazar 2", "02/01/2023"));
        books.add(new Book("Kitap 3", 300, "Yazar 3", "03/01/2023"));
        books.add(new Book("Kitap 4", 350, "Yazar 4", "04/01/2023"));
        books.add(new Book("Kitap 5", 400, "Yazar 5", "05/01/2023"));
        books.add(new Book("Kitap 6", 450, "Yazar 6", "06/01/2023"));
        books.add(new Book("Kitap 7", 500, "Yazar 7", "07/01/2023"));
        books.add(new Book("Kitap 8", 550, "Yazar 8", "08/01/2023"));
        books.add(new Book("Kitap 9", 600, "Yazar 9", "09/01/2023"));
        books.add(new Book("Kitap 10", 650, "Yazar 10", "10/01/2023"));
        HashMap<String,String> bookAndAuthor = new HashMap<>();
        books.forEach(book -> bookAndAuthor.put(book.getName(), book.getAuthor()));
        bookAndAuthor.forEach((name, author) -> System.out.println("Kitap Adı : " + name + ", Yazarı : " + author));

        System.out.println();

        HashMap<String, String> newMap = new HashMap<>();
        books.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> newMap.put(book.getName(), book.getAuthor()));
        newMap.forEach((name, author) -> System.out.println("Kitap Adı : " + name + ", Yazarı : " + author));
    }
}