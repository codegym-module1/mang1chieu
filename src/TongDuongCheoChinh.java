import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao kich thuoc: ");
        int size = scanner.nextInt();
        int[][] bang = new int[size][size];
        int result = tinhDuongCheo(bang, size, scanner);

        System.out.println("Tong duong cheo chinh la: " + result);
    }

    static int tinhDuongCheo(int[][] bang, int size, Scanner scanner) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhap phan tu thu " + j + " trong hang " + i + " la: ");
                bang[j][i] = scanner.nextInt();
                if (i == j) {
                    result += bang[j][i];
                }
            }
        }
        return result;
    }
}
