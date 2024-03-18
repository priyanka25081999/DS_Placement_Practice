// Problem Statement - https://medium.com/@miniChang8/leetcode-encode-and-decode-strings-4dde7e0efa1c
// Time complexity: encode: O(n) decode: O(n)
// Space complexity: encode: O(n) decode: O(n)

public class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}

/*
The encode function iterates over each string in the given list (strs). For each string, it performs constant time operations to append its length, 
followed by a '#' symbol, and then the string itself. Since the length of each string and the '#' symbol are constants, the time complexity of appending them is O(1) for each string.

The decode function iterates over the input string (str). It looks for '#' symbols to determine the length of each string in the encoded string. 
This operation involves searching through the string to find the delimiter '#', which might occur multiple times. However, the length of each string and the '#' symbol are constants, 
so the time complexity for finding them is O(1).
*/
