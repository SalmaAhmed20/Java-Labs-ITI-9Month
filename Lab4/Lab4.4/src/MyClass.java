public class MyClass {
    public int fact(int n) throws NegativeValueException {
        if (n < 0)
            throw new NegativeValueException();
        if (n == 1) return 1;
        return n * fact(n - 1);
    }
    public int BitwiseAnd(int A,int B) throws NegativeValueException,IllegalArgumentException {
        if (A < 0 || B <0)
            throw new NegativeValueException();
        if (A==0||B==0)
            throw  new IllegalArgumentException();
        return A & B;
    }

    public int BitwiseOr(int A,int B) throws NegativeValueException {
        if (A < 0 || B <0)
            throw new NegativeValueException();
        return A | B;
    }
}
