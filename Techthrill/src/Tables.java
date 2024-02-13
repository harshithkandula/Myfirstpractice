import java.util.Scanner;

public abstract class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table");
		int num = sc.nextInt();
		int i = 1;
		
		while(i<=10) {
			System.out.println(num+"x"+i+"="+(num*i));
			i++;
		}
		
		//chessboard
		char black = '\u25A0';
		char white = '\u25A1';
		
		
		for(int i1=1;i1<6;i1++) {
			for(int j=1;j<=5;j++) {
				if(i1%2 == 0) {
					char res = (j%2 == 0)? white : black;
					System.out.print(res);
				}
				else {
					char res = (j%2 == 0)? black : white;
					System.out.print(res);
				}
			}
			System.out.println();
		}
	}

}
