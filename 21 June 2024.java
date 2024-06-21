class Solution {

    String compareFrac(String str) {
        // Code here
        int i = 0;
        int a = 0, b = 0, c = 0, d = 0;

        // Extract a
        while (str.charAt(i) != '/') a = a * 10 + (str.charAt(i++) - '0');
        i++; // skip '/'
        
        // Extract b
        while (str.charAt(i) != ',') b = b * 10 + (str.charAt(i++) - '0');
        i += 2; // skip ', '

        // Extract c
        while (str.charAt(i) != '/') c = c * 10 + (str.charAt(i++) - '0');
        i++; // skip '/'

        // Extract d
        while (i < str.length()) d = d * 10 + (str.charAt(i++) - '0');

        // Compare fractions a/b and c/d using cross-multiplication
        int lhs = a * d;
        int rhs = b * c;

        if (lhs == rhs) return "equal";
        return lhs > rhs ? a + "/" + b : c + "/" + d;
    }
}
