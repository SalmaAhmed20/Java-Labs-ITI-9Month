public interface Complex<T> {
    T getReal();

    T getImaginary();

    Complex<T> add(Complex<T> z);

    Complex<T> subtract(Complex<T> z);

    Complex<T> product(Complex<T> z);

    Complex<T> division(Complex<T> z);

}
