package ArraysAndStrings;

public class OneIsUnique {

    //Boolean Array Approach
    public static boolean isUnique(String str)
    {
        boolean[] bool = new boolean[128];
        for(int i = 0;i<str.length();i++)
        {
            int index = str.charAt(i);
            if(bool[index]) return false;
            bool[index] = true;
        }
        return true;
    }

    //Bit-Vector  Approach
    public static boolean isUniqueBit(String str)
    {
        int checker = 0;
        for(int i = 0;i<str.length();i++)
        {
            int ind = str.charAt(i) - 'a';
            int mask = 1 << ind;
            if((checker & mask) != 0) return false;
            checker |= mask;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abcdc"));
        System.out.println(isUnique("abc"));

        System.out.println(isUniqueBit("abcdc"));
        System.out.println(isUniqueBit("abc"));


    }
}
