package datastructures.arrays;


/**
 * Substring within String and return the starting index of the pattern found in the string
 * Text : a b c b c f g m
 * Pattern : b c f g
 */
public class SubstringInString {
    public static void main(String[] args) {
        String str = "abcbcfgm";
        String pattern = "bcfg";
        int startingIndex = findSubstringInString(str, pattern);
        System.out.println("Starting Index : "+startingIndex);
    }

    private static int findSubstringInString(String str, String pattern) {
        int j = 0;
        for(int i=0; i< str.length(); i++)
        {
            // If character at i of string and j of pattern matches then increment both i and j
            if(str.charAt(i)==pattern.charAt(j))
            {
                // If j reaches last character and it matches return the index of i by subtracting the length of pattern, to give starting index
                if(j == pattern.length()-1)
                {
                    return i - j;
                }
                j++;
            }
            else {
                // If it doesn't match bring i back to next char
                i = i-j;
                j = 0;
            }
        }
        return 0;
    }
}
