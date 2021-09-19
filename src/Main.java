public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        System.out.print("Введите вес в килограммах: "+ weight +"кг");

        double height = 1.63;
        System.out.print("Введите рост в метрах: "+ 1.63);

        double bmi = weight / (height * height);

        System.out.printf("Индекс массы тела: %.2fn", bmi);



    }

}




















