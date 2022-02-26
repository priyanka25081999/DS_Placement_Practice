// Find Smallest letter Greater Than Target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Main {
    static public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char letters[] = {'c','f','j'};
        char ans = nextGreatestLetter(letters, 'a');
        System.out.println(ans);
    }
}
