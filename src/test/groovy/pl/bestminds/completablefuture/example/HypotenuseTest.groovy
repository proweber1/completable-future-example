package pl.bestminds.completablefuture.example

import spock.lang.Specification

class HypotenuseTest extends Specification {
    def 'test happy day scenario'() {
        given:
        def hypotenuse = new Hypotenuse(a, b)

        expect:
        hypotenuse.calculate() == expected

        where:
        a | b  | expected
        3 | 5  | 6
        2 | 2  | 3
        7 | 14 | 16
        9 | 2  | 10
    }

    def 'when given negative values'() {
        when:
        new Hypotenuse(a, b)

        then:
        thrown(IllegalArgumentException)

        where:
        a  | b
        -1 | -3
        3  | -4
        -6 | 2
    }
}
