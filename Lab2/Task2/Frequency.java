public class Frequency
{
    private
     String sentence,word;
    public
    Frequency( String s,String w)
    {
        sentence=s;
        word =w;
    }
    void Method1()
    {
        String s[] = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < s.length; i++)
        {
        if (word.equals(s[i]))
            count++;
        }
        System.out.println("Number of Ocurrances = "+count);
    }
    void Method2()
    {
        int count=0;
        String s= new String(sentence);
        while (sentence.contains(word))
        {
            sentence=sentence.replaceFirst("\\s"+word+"\\s", "@");
            count++;
        }
        sentence=s;
        System.out.println("Number of Ocurrances = "+count);
    }

}