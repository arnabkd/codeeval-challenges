public class Main {

	private static boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
	
    private static boolean isPalindrome(int num){
    	String n = Integer.toString(num);
    	return n.charAt(0) == n.charAt(n.length()-1);
    }

	public static void main (String [] args){
        for (int i = 1000; i >=2; i--){
        	if (isPalindrome(i) && isPrime(i)){
        		System.out.println(i);
        		return;
        	}
        }
	}
}