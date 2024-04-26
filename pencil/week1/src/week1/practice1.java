package week1;

public class practice1 {

	public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;
        
        while (i < len1 && j < len2) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }
        
        while (i < len1) {
            merged.append(word1.charAt(i));
            i++;
        }
        
        while (j < len2) {
            merged.append(word2.charAt(j));
            j++;
        }
        
        return merged.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqcd"
    }

}
