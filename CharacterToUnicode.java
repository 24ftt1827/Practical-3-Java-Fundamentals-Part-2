import java.util.Scanner;
public class CharacterToUnicode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        String a = scanner.nextLine();
        char letter = a.charAt(0);
        int unicode = (int) letter;
        System.out.println("the unicode for this character is : " + unicode);
        scanner.close();

    }
}
