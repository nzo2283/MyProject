
/**
 * @author Nora
 * @editedCode from Joel
 */
public class Product {

	private String item;
	private int cals;


	/**
	 * @param name The name of the food/beverage
	 * @param cals The amount of calories in the item
	 */
	public Product(String item, int cals) {
		
		this.item = item;
		this.cals = cals;
	}

	/** 
	 * @return a text representation of the item eaten/drank and the corresponding calories
	 */
	public String toString(){
		return this.item + ": " + this.cals + " Calories";
	}
	
	/** 
	 * @return calories per product
	 */
	public int getCals() {
		return cals;
	}
	
	
	/** 
	 * @void sets calories per product
	 */
	public void setCals ( int cals) {
	     this.cals = cals;
	}


	/** 
	 * @return the name of the item consumed
	 */
	public String getItem(){
		return item;
	}

	


}



