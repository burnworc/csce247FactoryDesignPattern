/**
 * This is the factory class. 
 * @author Cole
 *
 */
public class Bakery {
	/**
	 * Creates cake according to the type
	 * @param type
	 * @return returns the type of cake 
	 */
	private Cake createCake(String type) {
		if(type.equalsIgnoreCase("carrot cake"))
			return new CarrotCake();
		else if(type.equalsIgnoreCase("black forest cake"))
			return new BlackForestCake();
		else if(type.equalsIgnoreCase("birthday cake"))
			return new BirthdayCake();
		else
			return new Cake();
	}
	
	/**
	 * Creates a cake based on the type 
	 * Calls createCake method for that cake type
	 * @param type
	 * @return returns the cake
	 */
	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		cake.createCake();
		System.out.println("Price: $"+cake.getPrice());
		return cake;
	}
}
