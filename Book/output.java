import java.time.format.DateTimeFormatter;

public class output {
    public static void main(String[] args) {
        // abstraction is hiding the complexities behind the scenes by using getter and setter methods

        // constructor is a method that is called when an object is created
        User user = new User("John", "2004-04-24");

        Book HarryPotter = new Book("Harry Potter", "J.K. Rowling", 369);
        AudioBook Dracula = new AudioBook("Dracula", "Bram Stoker", 300);

        System.out.println(Dracula.toString());
    }
}
