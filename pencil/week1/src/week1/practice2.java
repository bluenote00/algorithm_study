package week1;

public class practice2 {
	 public String gcdOfStrings(String str1, String str2) {
	        if (!(str1 + str2).equals(str2 + str1)) {
	            return ""; // 두 문자열의 합이 서로 같지 않으면 공통된 부분 문자열이 없음
	        }
	        
	        // str1과 str2의 최대공약문자열을 찾기 위해 유클리드 호제법을 사용
	        // 두 문자열의 길이의 최대공약수를 구함
	        int gcdLength = gcd(str1.length(), str2.length());
	        
	        // 최대공약수만큼의 길이를 갖는 부분 문자열을 추출하여 반환
	        return str1.substring(0, gcdLength);
	    }
	    
	    // 최대공약수를 계산하는 메서드
	    private int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	    	practice2 solution = new practice2();

	        // Test cases
	        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));  // Output: "ABC"
	        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));  // Output: "AB"
	        System.out.println(solution.gcdOfStrings("LEET", "CODE"));  // Output: ""
	    }
}
