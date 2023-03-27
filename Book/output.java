import java.time.LocalDate;

import java.time.LocalDate;

public class output {
    public static void main(String[] args) {
        User youngerUser = new User();

        youngerUser.name = "John";
        youngerUser.birthDay = LocalDate.parse("2004-04-24");

        System.out.printf("%s was born on %s", youngerUser.name, youngerUser.birthDay.toString());
    }
}
