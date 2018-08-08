package pl.bestminds.completablefuture.example;

import java.util.concurrent.CompletableFuture;

/**
 * Этот класс делает асинхронные вычисления над классами
 * факториала и гипотенузы
 *
 * @author Vyacheslav Gusser (VVGusser@pscb.ru)
 */
class AsyncCalculator {
    /*
     * Этот класс делает вычисления асинхронными с помощью
     * Java CompletableFuture класса.
     */

    private final Factorial factorial;
    private final Hypotenuse hypotenuse;

    AsyncCalculator(Factorial factorial, Hypotenuse hypotenuse) {
        this.factorial = factorial;
        this.hypotenuse = hypotenuse;
    }

    Result calculate() {
        return CompletableFuture.supplyAsync(factorial::calculate)
                .thenCombineAsync(CompletableFuture.supplyAsync(hypotenuse::calculate), Result::new)
                .join();
    }
}
