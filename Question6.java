import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Put in 10 numbers");
int [] array = new int[10];
for(int i = 0; i<=array.length-1;i++) {
	array[i] = input.nextInt(); 
}
int sum = array[0];
for(int b = 1; b<=array.length-1;b++) {
	sum = sum + array[b];
}
System.out.println(sum);
	}

}
