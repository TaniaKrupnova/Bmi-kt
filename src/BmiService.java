public class BmiService {
    public double calculate (double bmi ){
        int weight = 70;
        System.out.print("Введите вес в килограммах: "+ weight +"кг");

        double height = 1.63;
        System.out.print("Введите рост в метрах: "+ 1.63);

        System.out.printf("Индекс массы тела: %.2fn", bmi);
        return bmi;
    }
}
