import java.util.Scanner;
public class InventoryCounter{
		
	private String[] catalog = {"Overpowered Lasers", "Brand New Hyperdrive", "Captain's Chair",
		"Cargo Bay Door Hatch", "Shiny Dials"};	
	private double[] price = {40.00, 100.00, 10.00, 20.00, 1.00};	
	
	private int lookUpPrice;
	private int saleQuantity;
	private String toBeSold;
	
	private void itemLookUp() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Whatcha lookin' for, Buddy?");
		String purchase = keys.nextLine();
		for (int x = 0; x < catalog.length; x++) {
			if (purchase.equalsIgnoreCase(catalog[x])) {
				lookUpPrice = x;
				toBeSold = catalog[x];
				break;			
				}
			else {
				System.out.println("Item not found.");
				}
			}		
		}
	private void makeSale() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Input quantity " + toBeSold + " to purchase.");
		saleQuantity = keys.nextInt();
		System.out.println("Sold " + saleQuantity + " for " + (price[lookUpPrice] * saleQuantity ));
		}
	
	private void transaction() {
		this.itemLookUp();
		this.makeSale();
		}	
			
	
	public static void main(String[] args){
		InventoryCounter demo = new InventoryCounter();
		demo.transaction();
		}
	
	}
