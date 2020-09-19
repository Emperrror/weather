import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      weather Jun = new weather("June");
      weather Jul = new weather("July");
      Jun.calendar();
      Jul.calendar();
        System.out.println(Jun.average());
        System.out.println(Jul.average());

    }
}