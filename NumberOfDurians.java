import java.util.Scanner;
public class NumberOfDurians {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
System.out.println("Each durian costs 15.75");
double durian;
double a;
System.out.println("How much money do you have?");
double money = scanner.nextDouble();
durian = 15.75;
a = (money/durian);
System.out.println("number of durians bought is : " + (int)a);
scanner.close();
}
}  