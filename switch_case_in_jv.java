import java.util.Scanner;

public class switch_case_in_jv {

    public static void main(String[] args) {

        int choice;
        System.out.println("Pick one: 1.Hi\t 2.Hey\t 3.hello\t");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        switch (choice) {
            case 1 -> System.out.println("You said Hi");
            case 2 -> System.out.println("You said Hey");
            case 3 -> System.out.println("You said hello");
            default -> System.out.println("Select one option");
        }
    }
}
