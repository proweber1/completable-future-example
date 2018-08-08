package pl.bestminds.completablefuture.example

import spock.lang.Specification

class AsyncCalculatorTest extends Specification {
    def 'happy day scenario'() {
        given:
        def calculator = new AsyncCalculator(new Factorial(factorial), new Hypotenuse(catchet1, catchet2))

        when:
        def result = calculator.calculate()

        then:
        result != null
        result.hypotenuse == expectedHypotenuse
        result.factorial == expectedFactorial

        where:
        factorial | expectedFactorial | catchet1 | catchet2 | expectedHypotenuse
        5         | 120               | 2        | 2        | 3
        2         | 2                 | 7        | 14       | 16
    }
}
