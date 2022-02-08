public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.85;
        double weight = 65.8;
        double index = service.calculate(height, weight);
        System.out.println("Индекс массы тела равен: " + index);
    }
}
