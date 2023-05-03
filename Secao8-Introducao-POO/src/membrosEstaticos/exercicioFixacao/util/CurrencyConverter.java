package membrosEstaticos.exercicioFixacao.util;

public class CurrencyConverter {
    public static double iof = 0.06;
    public static double converter(double currencyValue, double desiredValue){
        return (currencyValue + (currencyValue * iof)) * desiredValue;
    }
}
