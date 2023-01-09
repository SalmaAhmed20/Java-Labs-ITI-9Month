import dictionaryPkg.Dictionary;

public class MainClass {
    public static void main(String[] args) {
        Dictionary d1=new Dictionary();
        d1.addSorted('a',"Apple");
        d1.addSorted('a',"America");
        d1.addSorted('b',"Book");
        d1.addSorted('b',"Banana");
        //d1.printAll();
        d1.addSorted('d',"Desk");
        d1.addSorted('d',"Duck");
        d1.addSorted('c',"Car");
        d1.addSorted('c',"Chair");
        d1.printAll();

        //-----
        System.out.println("---specific key--");
        d1.printSpecific('d');
        d1.addSorted('a',"");
        d1.addSorted('a',"Apple");
        d1.printAll();
        d1.printSpecific('k');
    }
}
