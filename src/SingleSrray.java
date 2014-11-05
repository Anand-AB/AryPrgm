import java.util.Scanner;

public class SingleSrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[5];
		System.out.println("Enter the Numbers");
		Scanner s=new Scanner(System.in);
		
		for (int i = 0; i < ar.length; i++) {
			ar[i]=s.nextInt();
			
		}
		System.out.println("The Numbers of Array is");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(" "+ar[i]+" ");
		}
	}

}
	