public class BmiService {
    public double calculate(double growth, double weight) {
        double bmi =  weight / (growth * growth);
        return bmi;
    }
}
