
package models;



/**
 *
 * @author ADMIN
 */
public class Coder extends Person {
    private String language;


    public Coder() {
    }

    public Coder(String language, String name, int age, String phone) {
        super(name, age, phone);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }




    public String toString(){
           return "\nName: " + getName() + "\n" + "Age: " + getAge() + "\n" + "SDT: " + getPhone() + "\n" + "Ngôn ngữ: " + getLanguage();
    }

    public void setAge() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}