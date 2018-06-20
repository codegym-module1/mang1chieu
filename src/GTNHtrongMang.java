import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class GTNHtrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon mang co bao nhieu so: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Nhap du lieu: ");
        for (int i = 0; i < numbers.length; i++) {
            int num = scanner.nextInt();
            numbers[i] = num;
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("GIa thi nho nhat la: " + min);
    }
}
