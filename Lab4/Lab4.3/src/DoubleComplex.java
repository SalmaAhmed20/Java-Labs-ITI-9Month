public class DoubleComplex implements  Complex<Double>{
    private double r,i;

    public DoubleComplex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setI(double i) {
        this.i = i;
    }

    @Override
    public Double getReal() {
        return r;
    }

    @Override
    public Double getImaginary() {
        return i;
    }

    @Override
    public Complex<Double> add(Complex<Double> z) {
        return new DoubleComplex(this.r+z.getReal(),this.i+z.getImaginary());
    }

    @Override
    public Complex<Double> subtract(Complex<Double> z) {
        return new DoubleComplex(this.r-z.getReal(),this.i-z.getImaginary());
    }

    @Override
    public Complex<Double> product(Complex<Double> z) {
        return new DoubleComplex(this.r*z.getReal(),this.i*z.getImaginary());
    }

    @Override
    public Complex<Double> division(Complex<Double> z) {
        if (z.getReal()==0|| z.getImaginary() ==0) {
            System.out.println("divide by zero not allowed");
            return null;
        }
        return new DoubleComplex(this.r/z.getReal(),this.i/z.getImaginary());
    }
}
