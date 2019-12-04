import java.util.Scanner;

public class RecursCompfTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        RecursCompf c = new RecursCompf();
        while (true) {
            System.out.println("Введите формулу -> ");
            c.compile(scanner.nextLine().toCharArray());
        }
    }
}
