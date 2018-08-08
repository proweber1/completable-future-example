package pl.bestminds.completablefuture.example;

/**
 * Этот класс представляет из себя результаты вычисления
 * класса {@link AsyncCalculator}
 *
 * @author Vyacheslav Gusser (VVGusser@pscb.ru)
 */
class Result {

    private final long factorial;
    private final int hypotenuse;

    Result(long factorial, int hypotenuse) {
        this.factorial = factorial;
        this.hypotenuse = hypotenuse;
    }

    long getFactorial() {
        return factorial;
    }

    int getHypotenuse() {
        return hypotenuse;
    }

    private long sumOfFactorialAndHypotenuse() {
        return factorial + hypotenuse;
    }

    String getAsFormattedString() {
        return String.format("Факториал: %16d%nГипотенуза: %13d%nСумма всех значений: %6d", factorial, hypotenuse, sumOfFactorialAndHypotenuse());
    }
}
