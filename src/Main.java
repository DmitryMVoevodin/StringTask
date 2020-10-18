import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static boolean proverka(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        java.util.Arrays.sort(s1Array);
        java.util.Arrays.sort(s2Array);
        for(int i = 0; i<s1Array.length; i++){
            if(s1Array[i]!=s2Array[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s1="", s2="";
        try {
            s1 = bufferedReader.readLine();
            s2 = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(proverka(s1,s2)) System.out.println("Является");
        else System.out.println("Не является");
    }
}
