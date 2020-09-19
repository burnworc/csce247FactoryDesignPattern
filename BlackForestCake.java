/**
 * Sets the attributes for the Black Forest Cake
 * @author Cole
 *
 */
public class BlackForestCake extends Cake {
	public BlackForestCake() {
		super();
		name = "Black Forest Cake";
		price = 74.99;
		numLayers = 3;
		shape = shape.ROUND;
		flavor = "Black Forest";
		icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}
}
