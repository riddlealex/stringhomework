import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String phone = "+7960-415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный!");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий!");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Телефон начинается не с 7!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача!");
        }
    }
}