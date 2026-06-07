package ArraysAndStrings;

import java.util.Arrays;

public class TwoCheckPermutation {

    public static boolean checkPermutation(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        int[] freq = new int[128];
        for(char c : s1.toCharArray())
        {
            freq[c]++;
        }

        for(char c : s2.toCharArray()) {
            freq[c]--;
            if (freq[c] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPermutation("silentnsa","listenskf"));
    }
}
