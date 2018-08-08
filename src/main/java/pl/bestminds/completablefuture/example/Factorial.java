package pl.bestminds.completablefuture.example;

import java.util.stream.IntStream;

/**
 * Данный класс представляет из себя факториал числа
 *
 * @author Vyacheslav Gusser (VVGusser@pscb.ru)
 */
class Factorial {
    private final int number;

    Factorial(int number) {
        if (number > 10 || number < 1) {
            throw new IllegalArgumentException("number should be <= 10 and should be >= 1");
        }

        this.number = number;
    }

    long calculate() {
        return IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
    }
}
