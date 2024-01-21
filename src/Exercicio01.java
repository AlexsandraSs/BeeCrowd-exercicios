import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 30;
        int cod = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n%nRecord: %d years old, %d and gender: %s%n%nMeasue whit eigth decimal places: %.8f%nRouded (three decimal places): %.3f%n", product1, price1, product2, price2, age, cod, gender, measure, measure);
        System.out.printf(Locale.US, "US decimal point: %.3f%n", measure);
    }
}
