/**
 * Sets the attributes for a carrot cake
 * @author Cole
 *
 */
public class CarrotCake extends Cake {
	public CarrotCake() {
		super();
		name = "Carrot Cake";
		price = 54.99;
		numLayers = 2;
		shape = Shape.ROUND;
		flavor = "Carrot";
		icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");	
	}
}
