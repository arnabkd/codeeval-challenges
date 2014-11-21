public class Main {

	private static boolean isPrime(int num) {

        if (num == 2) return true;
        if (num == 1) return false;

        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

	public static void main (String [] args){
        int i = 1;
        int primesProcessed = 0;
     
        int sum = 0;

        while(primesProcessed < 1000){
            

            if (isPrime(i))
            {
                sum += i;
                primesProcessed++;
            }
            i++;
        }

        System.out.println(sum);
	}
}