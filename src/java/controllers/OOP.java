package controllers;

import java.util.InputMismatchException;
import java.util.Scanner;
import models.Coder;

/**
 *
 * @author ADMIN
 */
public class OOP {

    static Scanner sc = new Scanner(System.in);

    public static void chon(Coder coder) {
        try {
            int languageChoose = sc.nextInt();
            while (languageChoose < 1 || languageChoose > 4) {
                System.out.println("Xin mời bạn nhập lại!");
                languageChoose = sc.nextInt();
                switch (languageChoose) {
                    case 1:
                        coder.setLanguage("Java");
                        break;
                    case 2:
                        coder.setLanguage("C");
                        break;
                    case 3:
                        coder.setLanguage("C#");
                        break;
                    case 4:
                        coder.setLanguage("Python");
                        break;

                }

            }
        } catch (Exception e) {
        }
    }

    public static void choose() {

        System.out.println("Lựa chọn ngôn ngữ: ");
        System.out.println("1.Java");
        System.out.println("2.C");
        System.out.println("3.C#");
        System.out.println("4.Python");
        System.out.println("Mời bạn nhập lựa chọn:");

    }

    public static void input(Coder coder) {  // Phương thức input nhận coder của lớp Coder làm tham số.

        while (true) {
            try {
                System.out.println("Nhập tên: ");
                String name = sc.nextLine();
                coder.setName(name);
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập vào, Bạn vui lòng nhập lại!");
                String name = sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Nhập tuổi: ");
                int age = sc.nextInt();
                coder.setAge(age);
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập vào, Bạn vui lòng nhập lại!");
                int age = sc.nextInt();
                sc.nextLine();
                coder.setAge(age);
            }
        }
        while (true) {
            try {
                int age = sc.nextInt();
                coder.setAge(age);
            } catch (Exception e) {
                System.out.println("Lỗi nhập vào, Bạn vui lòng nhập lại!");
                int age = sc.nextInt();
            }
        }
    }
//        while(true){
//            
//            try {
//            System.out.println("Nhập tên: ");
//            String name = sc.nextLine();
//            coder.setName(name);    //Gán giá trị cho thuộc tính name của đối tượng coder
//            System.out.println("Nhập tuổi: ");
//            int age = sc.nextInt();
//            coder.setAge(age);
//
//            System.out.println("Nhập SDT: ");
//            String phone = sc.next();
//            coder.setPhone(phone);
//            choose();
//            int languageChoose = sc.nextInt();
//        } catch (Exception e) {
//            System.out.println("Lỗi nhập vào, Bạn vui lòng nhập lại!");
//            
//        }
//        }
//    }

    public static void main(String[] args) {
        Coder coder3 = new Coder();
        Coder coder1 = new Coder();
        Coder coder2 = new Coder();

        System.out.println("Nhập thông tin  coder 1!.");
        input(coder1);
        System.out.println("Nhập thông tin coder 2!.");
        input(coder2);
        System.out.println("Nhập thông tin coder 3!.");
        input(coder3);

        System.out.println("Thông tin coder 1:");
        System.out.println(coder1.toString());
        System.out.print("Thông tin coder 2:");
        System.out.println(coder2.toString());
        System.out.print("Thông tin coder 3:");
        System.out.println(coder3.toString());

    }

}
