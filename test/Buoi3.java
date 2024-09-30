/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Buoi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ham BufferReader ham nhap vao dang String (dung file .txt)
        System.out.println("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai:");
        int b = sc.nextInt();
        System.out.println("Chon OPTION: ");
        int option = sc.nextInt();
        switch(option){   // chi tuong tac voi hang so    
            case 1: 
                System.out.println("a + b = " + (a + b));
                break;
            case 2: 
                System.out.println("a - b = " + (a - b));
                break;
            case 3:
                System.out.println("a * b = " + (a * b)); break;
                case 4:
                System.out.println("a / b = " + (a / b)); break;
            case 5:
                System.exit(0);
        }
    }
}

