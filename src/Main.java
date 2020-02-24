public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.99;
        double weight = 81.5;
        double bmi = service.calculate(growth, weight);
        bmi = bmi * 100;
        int i = (int) Math.round(bmi);
        bmi = (double) i / 100;
        System.out.println("Индекс BMI для роста " + growth + " м " + "и веса " + weight + " кг " + "составляет " + bmi);
    }
}
