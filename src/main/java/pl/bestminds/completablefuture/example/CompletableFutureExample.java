package pl.bestminds.completablefuture.example;

/**
 * This is main class, see manifest
 *
 * @author Vyacheslav Gusser (VVGusser@pscb.ru)
 */
public class CompletableFutureExample {
    public static void main(String[] args) {
        AsyncCalculator asyncCalculator = new AsyncCalculator(new Factorial(5), new Hypotenuse(2, 2));
        Result calculationResult = asyncCalculator.calculate();

        System.out.println(calculationResult.getAsFormattedString());
    }
}
