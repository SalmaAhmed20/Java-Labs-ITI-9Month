public class Lab2_2{
    public static void main(String[] args) {
        String s = "Hi 1 and welcome 1 and good 1 morning";
        Frequency f  = new Frequency(s, "1");
        System.out.println("-----------Method 1--------");
        f.Method1();
        System.out.println("-----------Method 2 --------");
        f.Method2();

    }
}