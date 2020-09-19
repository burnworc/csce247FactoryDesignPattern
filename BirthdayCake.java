/**
 * Sets the attributes for the birthday cake
 * @author Cole
 *
 */
public class BirthdayCake extends Cake {
	public BirthdayCake() {
		super();
		name = "Birthday Cake";
		price = 109.99;
		numLayers = 1;
		shape = Shape.SHEET;
		flavor = "Funfetti";
		icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");
	}
}
