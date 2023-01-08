public class MainClass {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        int r1 = 0,r2=0,r3=0;
        try {
            System.out.println("Try Block");
            r1= myClass.fact(6);
            r2=myClass.BitwiseAnd(-1,6);
            r3=myClass.BitwiseOr(2,6);
        } catch (NegativeValueException | IllegalArgumentException e) {
            System.out.println("Catch Block");
            e.printStackTrace();
        } finally {
            System.out.println("Finally Block");
            System.out.println("fact of 6 = "+r1);
            System.out.println(" Bitwise 2 And 6 = "+r2);
            System.out.println(" Bitwise 2 Or 6 = "+r3);
        }
    }
}
