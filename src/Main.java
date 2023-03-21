public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int result = service.calculate(84, 1.8);
        System.out.println(result);
    }
}

