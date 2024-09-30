package BaiTapVeNha;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Buoi3 {

    public static void main(String[] args) {
        //Ham BufferReader ham nhap vao dang String (dung file .txt)
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai:");
        int b = sc.nextInt();;
        while (b == 0) {
            System.out.println("Số không hợp lệ. Vui lòng nhập lại!");
            b = sc.nextInt();
        }
        int option = 1;
        while (option != 0) {
            System.out.println("Lựa chọn OPTION:");
            System.out.println("1. Tính tổng ");
            System.out.println("2. Tính hiệu");
            System.out.println("3. Tính tích");
            System.out.println("4. Tính thương");
            System.out.println("Chọn 0 để kết thúc!");
            System.out.println("Mời bạn chọn OPTION: ");
            option = sc.nextInt();
            switch (option) {   // chi tuong tac voi hang so    
                case 1:
                    System.out.println("a + b = " + (a + b));
                    break;
                case 2:
                    System.out.println("a - b = " + (a - b));
                    break;
                case 3:
                    System.out.println("a * b = " + (a * b));
                    break;
                case 4:
                    System.out.println("a / b = " + (a / b));
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
