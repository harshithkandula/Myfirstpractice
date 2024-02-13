import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ps;
		System.out.println("Enter the plot size:");
		ps = sc.nextInt();
		System.out.println("Enter the number of divisions inserted into plot");
		int d = sc.nextInt();
		
		float p = ps/d;
		System.out.println("Size of each plot:"+p);
		
		String visionfilepath = "D:\\my vision\\history rehabilation.docx";
		FileReader fr = null;
		
		try {
			fr = new FileReader(visionfilepath);
			fr.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally, Obstacle resolved");
		}
		
		
		System.out.println("Thank You");
		sc.close();
		}

}
