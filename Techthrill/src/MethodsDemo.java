import java.util.Scanner;

public class MethodsDemo {
	
	int getMaximumValue(int[] array) {
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	
	static int getMinimumValue(int[] array) {
		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] productPrices = {1200, 4500, 6300, 5900, 11700, 29000, 47000};
		int[] crctScores = {97, 109, 153, 51, 7};
		int[] covidCases = {7000000, 5500000, 11000000, 4000000, 2500000};
		
		int max_price = productPrices[0];
		
		for(int i=1;i<productPrices.length;i++) {
			if(productPrices[i]>max_price) {
				max_price = productPrices[i];
			}
		}
		System.out.println("Maximum Product price:"+max_price);
		
		MethodsDemo cs1 = new MethodsDemo();
		
		System.out.println("High Score: "+cs1.getMaximumValue(crctScores));
		System.out.println("High Covid Cases: "+cs1.getMaximumValue(covidCases));
		System.out.println("High Product Price: "+cs1.getMaximumValue(productPrices));

		System.out.println("Low Cricket Score: "+MethodsDemo.getMinimumValue(crctScores));
		System.out.println("Low Covid Cases: "+MethodsDemo.getMinimumValue(covidCases));
		System.out.println("Low Product Price: "+MethodsDemo.getMinimumValue(productPrices));
	}

}
