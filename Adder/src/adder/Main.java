package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please provide at least two integers to add");
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid character provided");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        return sum;
    }
}
