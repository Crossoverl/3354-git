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
        if (!args[0].contains("-")) {
            for (String arg : args)
                sum += Integer.parseInt(arg);
        }
        else
            for (int i = 1; i < args.length; i++) {
                sum -= Integer.parseInt(args[i]);
            }
        return sum;
    }
}
