import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter String : ");
        String str = scanner.nextLine();

        if (str==null)
            System.out.println( false);
        else if (str.isEmpty() )
            System.out.println( false);
        else System.out.println(str.chars().allMatch(Character::isLetter));
    }
}
