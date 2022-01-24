
package Task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    int a = 2;
    int b = 3;

    @Test
    public void testCalculator() {
        //Создаётся экземпляр тестируемого класса
        Calculator calculator = new Calculator();
        //Далее путём вызова функции созданного ранее экземпляра класса присваиваем результат исполнения функции в переменную
        int result = calculator.multiply(a, b);
        //Здесь сравнения полученного результата от функции с ожидаемым результатом
        assertEquals(4, result);
    }
}
