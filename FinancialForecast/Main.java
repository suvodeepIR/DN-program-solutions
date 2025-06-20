

public class Main {
    public static void main (String [] args) {

        double startingmoney = 1000;
        double rate = 0.1;
        int years = 5;

        double FinalAmount = FinancialForecast.Futurevalue(startingmoney , rate, years);

        System.out.printf("Money after %d years: %.2f", years, FinalAmount );

    }
}
