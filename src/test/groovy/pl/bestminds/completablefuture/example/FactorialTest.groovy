package pl.bestminds.completablefuture.example

import spock.lang.Specification

class FactorialTest extends Specification {
    def 'test that factorial works fine'() {
        given:
        def factorial = new Factorial(number)

        when:
        def result = factorial.calculate()

        then:
        result == expected

        where:
        number | expected
        2      | 2
        5      | 120
        10     | 3628800
    }

    def 'exception when given number > 10 or < 1'() {
        when:
        new Factorial(number)

        then:
        thrown(IllegalArgumentException)

        where:
        number << [11, 200, 150, 100, 10_000, 0, -1, -2, -30, -123]
    }
}
