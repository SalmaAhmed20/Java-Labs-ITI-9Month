@MyAnno(str = "In Anno",val = 100)
public class MyClass {
    private String s1;

    @MyAnno(str = "In Anno",val = 100)    public MyClass(String s1) {
        this.s1 = s1;
    }
    @MyAnno(str = "In Anno",val = 100)
    public String getS1() {
        return s1;
    }

    @MyAnno(str = "In Anno",val = 100)
    public void setS1(String s1) {
        this.s1 = s1;
    }
}
