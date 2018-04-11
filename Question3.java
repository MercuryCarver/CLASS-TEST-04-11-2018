import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Put in 5 names");
Scanner input = new Scanner(System.in);
String [] array2 = new String [5];
for(int i = 0; i<=array2.length-1;i++) {
	array2[i]=input.nextLine();
	}
for(int b = 0; b<=array2.length-1;b++) {
	System.out.println(array2[b]);
}

	}

}
