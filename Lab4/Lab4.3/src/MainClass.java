public class MainClass {


    public static void main(String[] args) {
        DoubleComplex c1=new DoubleComplex(5,10);
        DoubleComplex c2=new DoubleComplex(12,1);
        Complex<Double> c3 =c1.add(c2);
        System.out.println("complex Number: "+c3.getReal()+"+"+c3.getImaginary()+"i");
        c3=c1.subtract(c2);
        System.out.println("complex Number: "+c3.getReal()+"+"+c3.getImaginary()+"i");
        c3=c1.product(c2);
        System.out.println("complex Number: "+c3.getReal()+"+"+c3.getImaginary()+"i");
        c3=c1.division(c2);
        if(c3 != null)
            System.out.println("complex Number: "+c3.getReal()+"+"+c3.getImaginary()+"i");
    }



}
