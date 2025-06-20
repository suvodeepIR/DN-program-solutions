public class FinancialForecast {
    
    public static double Futurevalue(double money, double rate, int years) {

        if (years == 0) {
        return money;
    }

    return Futurevalue(money, rate, years - 1) * (1 + rate) ;
}
}
