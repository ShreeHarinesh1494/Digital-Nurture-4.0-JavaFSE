package Week1.Algorithms_Data_Structures.FinancialForecasting;


public class FinancialForecast
{


    public static double futureValue(double presentValue, double growthRate, int years)
    {

        if (years == 0)
        {
            return presentValue;
        }


        return futureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args)
    {
        double presentValue = 1000;
        double growthRate = 0.10;
        int years = 5;

        double predictedValue = futureValue(presentValue, growthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, predictedValue);
    }
}

