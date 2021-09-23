
public class ArraySumTester {

	public static void main(String[] args) {
		int[] arrayNumbers = {0,1,2,3};
		
		int suma = arrayNumbers[0];
		
		for (int i = 1; i < arrayNumbers.length; i++) {
			suma = arrayNumbers[i] + suma;
		}
		
		System.out.println(suma);

	}
}
