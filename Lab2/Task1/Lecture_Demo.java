public class Lecture_Demo{
    public static void main(String[] args) {
        String cmdLine = "61.12.2a.1";
        IPCutter ipCutter =new IPCutter(cmdLine);
        String [] outSplit=ipCutter.doIPSplit();
        String [] outTokeniz=ipCutter.doIPTokeniz();
        System.out.println("----Using Split-----");
        for (int i =0; i <outSplit.length;i++)
        {
            System.out.println(outSplit[i]);
        }
        System.out.println("----Using Tokenizer-----");
        for (int i =0; i <outTokeniz.length;i++)
        {
            System.out.println(outTokeniz[i]);
        }

    }
}