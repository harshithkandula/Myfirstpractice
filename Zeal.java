import java.util.*;
public class Zeal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String s=sc.nextLine();
        int l=s.length();
        
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            System.out.println(c);
        }
    }
}
