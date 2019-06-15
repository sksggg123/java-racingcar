package edu.nextstep.stepone;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * author       : gwonbyeong-yun <sksggg123>
 * ------------------------------------------
 * | email        : sksggg123               |
 * | github       : github.com/sksggg123    |
 * | blog         : sksggg123.github.io     |
 * ------------------------------------------
 * project      : java-racingcar
 * create date  : 2019-06-14 14:33
 */
public class OperatorTest {

    @Test
    void 덧셈() {
        Operator operator = new Operator();
        assertThat(operator.add(1,2)).isEqualTo(3);
        assertThat(operator.add(2,3)).isEqualTo(5);
        assertThat(operator.add(3,4)).isEqualTo(7);
        assertThat(operator.add(1000,2000)).isEqualTo(3000);
    }

    @Test
    void 뺄셈() {
        Operator operator = new Operator();
        assertThat(operator.minus(1,2)).isEqualTo(-1);
        assertThat(operator.minus(2,1)).isEqualTo(1);
        assertThat(operator.minus(100,200)).isEqualTo(-100);
        assertThat(operator.minus(200,100)).isEqualTo(100);
    }

    @Test
    void 곱셈() {
        Operator operator = new Operator();
        assertThat(operator.multiply(1,2)).isEqualTo(2);
        assertThat(operator.multiply(2,1)).isEqualTo(2);
        assertThat(operator.multiply(2,2)).isEqualTo(4);
        assertThat(operator.multiply(10,2)).isEqualTo(20);
    }

    @Test
    void 나눗셈() {
        Operator operator = new Operator();
        assertThat(operator.divided(1,2)).isEqualTo(0);
        assertThat(operator.divided(2,1)).isEqualTo(2);
        assertThat(operator.divided(2,2)).isEqualTo(1);
        assertThat(operator.divided(10,2)).isEqualTo(5);
    }

    @Test
    void 연산결과() {
        Operator operator = new Operator();
        assertThat(operator.doOperation("+", 10, 2)).isEqualTo(12);
        assertThat(operator.doOperation("-", 10, 2)).isEqualTo(8);
        assertThat(operator.doOperation("*", 10, 2)).isEqualTo(20);
        assertThat(operator.doOperation("/", 10, 2)).isEqualTo(5);
    }

    /*
    연산 종합 테스트
     */
    @Test
    void 종합테스트() {
        CalculatorApplication app = new CalculatorApplication();
        assertThat(app.start("3 + 2 - 1")).isEqualTo(4);
        assertThat(app.start("3 + 2 * 3")).isEqualTo(15);
        assertThat(app.start("3 + 2 - 5 + 10 / 2")).isEqualTo(5);
    }
}
