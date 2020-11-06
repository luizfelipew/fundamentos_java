package refactors;

import com.sun.corba.se.spi.orb.OperationFactory;

import java.util.Optional;

public class CalculadoraTest {

    public static void main(String[] args) {
        int soma = calculate(1, 2, "add");
        int somaSwitch = calculateUsingSwitch(2, 5, "add");
        int multiplyUsingFactory = calculateUsingFactory(2, 5, "multiply");
        int divideUsingFactory = calculateUsingFactory(10, 5, "divide");

        System.out.println(soma);
        System.out.println(somaSwitch);
        System.out.println("Using operator factory: " + multiplyUsingFactory);
        System.out.println("Using operator factory: " + divideUsingFactory);
    }

    public static int calculateUsingFactory(int a, int b, String operator){
        Operation targetOperation = OperatorFactory
                .getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a, b);

    }

    public static int calculate ( int a, int b, String operator){
        int result = Integer.MIN_VALUE;

        if ("add".equals(operator)) {
            result = a + b;
        } else if ("multiply".equals(operator)) {
            result = a * b;
        } else if ("divide".equals(operator)) {
            result = a / b;
        } else if ("subtract".equals(operator)) {
            result = a - b;
        }
        return result;
    }

    public static int calculateUsingSwitch(int a, int b, String operator) {
        int result = 0;
        switch (operator) {
            case "add":
                result = a + b;
                break;
            // other cases
        }
        return result;
    }
}
