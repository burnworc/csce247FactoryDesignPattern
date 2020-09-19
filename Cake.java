/**
 * Holds variables to to keep track of the cake name, number of layers, decorations, shape, flavor and icing.
 * @author Cole
 *
 */
import java.util.*;
public class Cake {
	protected String name, flavor, icing;
	protected double price;
	protected int numLayers;
	protected Shape shape;
	protected ArrayList<String> decorations;
	
	/**
	 * Creates an empty decorations list
	 */
	public Cake() {
		decorations = new ArrayList<>();
	}

	/**
	 * Creates a cake
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	
	/**
	 * Displays a message depending on the number of layers and other cake information
	 */
	private void createLayers() {
		switch(shape) {
		case CUPCAKES:
			System.out.println("Creating "+flavor+" cupcakes");
			break;
		case BUNT:
			System.out.println("Creating a "+flavor+" bunt cake");
			break;
		case ROUND:
		case SHEET:
			if(numLayers == 1)
				System.out.println("Creating a 1 layer "+shape.toString().toLowerCase()+" "+flavor+" cake");
			else
				System.out.println("Creating a "+numLayers+" layered "+shape.toString().toLowerCase()+" "+flavor+" cake");
			break;
		}
	}
	
	/**
	 * Displays the cake frosting information
	 */
	private void frostCake() {
		System.out.println("Frost cake with "+icing+" icing.");
	}
	
	/**
	 * Displays the decoration items used
	 */
	private void addDecorations() {
		for(String item : decorations) {
			System.out.println("Adding "+item+".");
		}
	}
	
	/**
	 * Returns the price of the cake
	 * @return
	 */
	public double getPrice() {
		return price;
	}
}
