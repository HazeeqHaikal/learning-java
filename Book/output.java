import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class output {
    public static void main(String[] args) {
        User user = new User("John", "2004-04-24");

        Book book = new Book();

        book.title = "The Lord of the Rings";
        book.author = "J.R.R. Tolkien";

        user.borrow(book);

        System.out.printf("%s was born on %s and he is now %d years old", user.name,
                user.birthDay.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")), user.age());

        System.out.printf("\n%s borrowed %s by %s", user.name, book.title, book.author);

    }
}
