package BaiTapVeNha;


import java.util.Scanner;

public class BTVN2NC {
    public static int tinh(int a, int b){
        if(a > b && a % 2 == 0){
            return (a + b);
        } else {
            return Math.abs(a - b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai:");
        int b = sc.nextInt();
        System.out.println(tinh(a,b)
        );
    }
}
 

