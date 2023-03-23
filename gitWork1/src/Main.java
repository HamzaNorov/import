import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму в тенге: ");
        double tenge = input.nextDouble();

        // Курсы обмена валют на 23 марта 2023 года
        double usdExchangeRate = 462.36;
        double eurExchangeRate = 493.48;
        double rubExchangeRate = 5.99;

        //   тенге в доллары рубли и евро
        double usd = tenge / usdExchangeRate;
        double eur = tenge / eurExchangeRate;
        double rub = tenge / rubExchangeRate;

        // Вывод результатов
        System.out.printf("%.2f тенге = %.2f долларов\n", tenge, usd);
        System.out.printf("%.2f тенге = %.2f евро\n", tenge, eur);
        System.out.printf("%.2f тенге = %.2f рубль\n", tenge, rub);
    }
}
