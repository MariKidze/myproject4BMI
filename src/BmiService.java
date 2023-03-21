public class BmiService {
    public int calculate(int weightKg, double heightMeters) {
        double result = (weightKg / (heightMeters * heightMeters));
        return (int) result;
    }
}