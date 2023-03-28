package t1;

@interface CalculatorOperation {
    String value();
    String description();
}

public class Calculator {

    /**
     * The first operand of the calculation.
     */
    private double operand1;

    /**
     * The second operand of the calculation.
     */
    private double operand2;

    /**
     * Creates a new Calculator instance.
     * @param operand1 The first operand of the calculation.
     * @param operand2 The second operand of the calculation.
     */
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    /**
     * Adds the two operands together.
     * @return The sum of the two operands.
     */
    @CalculatorOperation(value = "+", description = "Addition")
    public double add() {
        return operand1 + operand2;
    }

    /**
     * Subtracts the second operand from the first operand.
     * @return The difference between the two operands.
     */
    @CalculatorOperation(value = "-", description = "Subtraction")
    public double subtract() {
        return operand1 - operand2;
    }

    /**
     * Multiplies the two operands together.
     * @return The product of the two operands.
     */
    @CalculatorOperation(value = "*", description = "Multiplication")
    public double multiply() {
        return operand1 * operand2;
    }

    /**
     * Divides the first operand by the second operand.
     * @return The quotient of the two operands.
     */
    @CalculatorOperation(value = "/", description = "Division")
    public double divide() {
        return operand1 / operand2;
    }
}
