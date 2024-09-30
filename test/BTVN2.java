
import java.util.Scanner;

public class BTVN2 {

    public static String tinhTong(int a, int b) {
        return "Tổng là: " + (a + b);
    }

    public static String tinhHieu(int a, int b) {
        return "Hiệu là: " + (a - b);
    }

    public static String tinhTich(int a, int b) {
        return "Tích là: " + (a * b);
    }

    public static String tinhDu(int a, int b) {
        return "Dư là: " + (a % b);
    }

    public static String tinhThuong(int a, int b) {
        return "Thương là: " + (a / b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai:");
        int b = sc.nextInt();
        System.out.println(tinhTong(a, b));
        System.out.println(tinhHieu(a, b));
        System.out.println(tinhTich(a, b));
        System.out.println(tinhDu(a, b));
        System.out.println(tinhThuong(a, b));
        System.out.println(tinhTong(a, b));
    }

}
