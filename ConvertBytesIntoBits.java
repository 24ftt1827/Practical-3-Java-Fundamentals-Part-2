import java.util.Scanner;
public class ConvertBytesIntoBits {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of bytes: ");
            int a =scanner.nextInt();
            int bytes = a; 
            int bits = bytes * 8; 

            System.out.println("Bytes: " + bytes);
            System.out.println("Bits: " + bits);
        }
    }
}
