import java.math.BigInteger;

public class FactorialCalc {
    private BigInteger factorial = new BigInteger("1");

    public BigInteger calculate(long number) {
        if (number < 0) {
            throw new FactorialDataException(number);
        } else if (number < 2) {
            return BigInteger.valueOf(1);
        } else {
            for (long i = 2; i <= number; i++) {
                BigInteger k = BigInteger.valueOf(i);
                factorial = factorial.multiply(k);
            }
            return factorial;
        }
    }
}
