import java.util.Scanner;
public class Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your target amount?");
        Double savings = scanner.nextDouble();
        System.out.println("how many months do you want to take to save?");
        int months= scanner.nextInt();
        int days = 30;
        int time = months*days;
        System.out.println("Amount of money you need to save per day is : " +(double) (savings/time));
        scanner.close();
    }
}
