import java.util.Scanner;


public class MultiAry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]=new int[3][2];
		System.out.println("Enter the Numbers");
		Scanner s=new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++){
			ar[i][j]=s.nextInt();
		}
		}
		System.out.println("The Numbers of Array is");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				
			System.out.print(" "+ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}

	
