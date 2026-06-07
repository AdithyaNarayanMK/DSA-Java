package ArraysAndStrings;

public class ThreePalindromePermutation {

    public static boolean canPermutePalindrome(String s) {
        int[] freq = new int[26];
        boolean foundOdd = false;
        for(char c : s.toCharArray())
        {
            freq[c - 'a']++;
        }
        for(int count : freq)
        {
            if(count % 2 == 1)
            {
                if(foundOdd) return false;
                foundOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(canPermutePalindrome("racecar"));
        System.out.println(canPermutePalindrome("racecardsfa"));

    }
}
