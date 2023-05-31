package Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "/a/b/c/../";
        System.out.println(simplifyPath(str));

    }

    public static String simplifyPath(String s){

       StringBuffer sb = new StringBuffer(s);
        int indexOfString = sb.indexOf("..");
        if (sb.lastIndexOf("/")==sb.length()-1){
            sb.deleteCharAt(sb.length()-1);
        }
        if (indexOfString > 0){
            sb.delete(indexOfString-2,indexOfString+3);
        }

        return sb.toString();
    }
}
