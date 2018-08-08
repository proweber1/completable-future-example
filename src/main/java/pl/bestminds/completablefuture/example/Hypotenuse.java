package pl.bestminds.completablefuture.example;

/**
 * Этот класс представляет из себя гипотенузу
 *
 * @author Vyacheslav Gusser (VVGusser@pscb.ru)
 */
public class Hypotenuse {

    private final int a;
    private final int b;

    Hypotenuse(int a, int b) {
        this.a = requirePositive(a, "a");
        this.b = requirePositive(b, "b");
    }

    private static int requirePositive(int v, String catheterName) {
        if (v < 0) {
            throw new IllegalArgumentException("catheter " + catheterName + " must have positive value");
        }
        return v;
    }

    int calculate() {
        return (int) Math.ceil(Math.sqrt((a * a) + (b * b)));
    }
}
