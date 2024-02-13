import java.util.Scanner;

public class BubblesortDemo {

	
	static void  printArray(int[] array) {
		for(int elements: array) {
			
			System.out.println(elements+" ");
		}
		System.out.println();
	}
	
	static void bubbleSort(int[] array) {
		int length = array.length;
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int p = array[j];
					array[j] = array[j+1];
					array[j+1] = p;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		int[]a = new int[6];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Before Sorting");
		BubblesortDemo.printArray(a);
		
		System.out.println("After Sorting");
		BubblesortDemo.bubbleSort(a);
		BubblesortDemo.printArray(a);

	}

}
