public class BmiService {
    public double calculate(double height, double weight) {
        double index = weight /Math.pow(height, 2) ;
        return index;
    }

}
