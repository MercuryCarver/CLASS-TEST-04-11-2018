
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage first = new Beverage("Coke", 1000, 1.25);
		Beverage second = new Beverage("Sprite", 500, 1.25);
		Beverage third = new Beverage("Fanta", 1000, 1.50);
		System.out.println(first.Name + " has " + first.Calories + " calories and costs $" + first.Cost);
		System.out.println(second.Name + " has " + second.Calories + " calories and costs $" + second.Cost);
		System.out.println(third.Name + " has " + third.Calories + " calories and costs $" + third.Cost);
		
	}

}
