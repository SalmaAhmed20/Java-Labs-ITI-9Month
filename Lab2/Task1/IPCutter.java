import java.util.StringTokenizer;

public class IPCutter {
    private
    String cmdLine;
    public
    IPCutter( String s)
    {
        cmdLine =  s;
    }

    boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

    String[] doIPSplit() {
        String[] res = cmdLine.split("\\.");
        //int[] intRes = new int[res.length];
        /*for (int i = 0; i < res.length; i++) {
            if (isNumeric(res[i])){
            intRes[i] = Integer.parseInt(res[i]);
            }
            
        }*/
        return res;
    }
    String [] doIPTokeniz() {
        StringTokenizer s = new StringTokenizer(cmdLine,".");
        String[] intRes = new String[s.countTokens()];
        int i =0;
        //int[] intRes = new int[s.countTokens()];
        while (s.hasMoreTokens()){
            /*
             * String temp =s.nextToken();
             * if (isNumeric(temp))
             * {
             *   intRes[i] = Integer.parseInt(res[i]);
             * }  
             */
            intRes[i] = s.nextToken();
            i++;
        }
        return intRes;
    }
}