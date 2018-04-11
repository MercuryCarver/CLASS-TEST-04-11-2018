import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Put in 5 numbers");
int [] array = new int[5];
for(int i = 0; i<=array.length-1;i++) {
	array[i]=input.nextInt();
}
for(int b = 0; b<=array.length-1;b++) {
	if((array[b]%2==0)&&(array[b]%3==0)&&(array[b]>10)) {
		System.out.println(array[b] + " is divisible by 2, 3 and greater than 10 ");
	}
}
	}

}
