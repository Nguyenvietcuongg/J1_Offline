package models;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Person {

    static Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private String phone;

    public Person() {
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setAge(int age) {

        while (true) {
//            age = 0;
//            System.out.println("Nhập tuổi: ");
//            int ageInput = sc.nextInt();  // tạo biến ageInput để tránh xung đột với age
            if (age < 18) {
                System.out.println("Xin vui lòng nhập tuổi trên 18!");
                age = sc.nextInt();
            } else {
                this.age = age;
            }

        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
