import java.util.*;

public class TugasTM2 {
	public TugasTM2() {

		Scanner scan = new Scanner (System.in);

		final int stock = 50;
		int choose;


		System.out.println("Welcome To Panpan Store");
		System.out.println("-----------------------");

		String name;
		System.out.print("Customer's name : ");
		name = scan.nextLine();

		System.out.println();
		System.out.println("1. Pen - $2.99");
		System.out.println("2. Pencil - $1.59");
		System.out.println("3. Eraser - $1.69");
		System.out.println("4. Ruler - $1.99");
		System.out.println("5. Exit");

		System.out.println();
		System.out.print("Choose (one from above): ");
		choose = scan.nextInt();scan.nextLine();

		System.out.println();

		if (choose<0 || choose>4){
			System.out.println("Thanks for Visiting Panpan Store");
			}
		else {
			int quantity;
			System.out.print("Input quantity [1..50]: ");
			quantity = scan.nextInt();scan.nextLine();

		if(quantity > stock){
			System.out.println("Out of Stock");
			}
		else {
			Double Total = new Double(0);

			switch(choose)
			{
				case 1:
				System.out.println("Panpan store");
				System.out.println("Invoice");
				System.out.println("------------------------");
				System.out.println("Item's name   : Pen ");
				System.out.println("Price         : $2.99");
				System.out.println("Quantity      : "+ quantity);


				Total = quantity*2.99;
			break;

				case 2:
				System.out.println("Panpan store");
				System.out.println("Invoice");
				System.out.println("------------------------");
				System.out.println("Item's name   : Pencil ");
				System.out.println("Price         : $1.59");
				System.out.println("Quantity      : " + quantity);


				Total = quantity*1.59 ;
				break;

				case 3:
				System.out.println("Panpan store");
				System.out.println("Invoice");
				System.out.println("------------------------");
				System.out.println("Item's name   : Eraser ");
				System.out.println("Price         : $1.69");
				System.out.println("Quantity      : " + quantity);


				Total = quantity*1.69;
				break;

				case 4:
				System.out.println("Panpan store");
				System.out.println("Invoice");
				System.out.println("------------------------");
				System.out.println("Item's name   : Ruler ");
				System.out.println("Price         : $1.99");
				System.out.println("Quantity      : " + quantity);

				Total = quantity*1.99;
				break;
				}

			System.out.println("");
			System.out.printf("Total: $%.2f\n ", Math.ceil(Total));
			System.out.println();
			System.out.printf("Input your money [ min $%.2f %s", Math.ceil(Total), "] :  $");

			double money = scan.nextFloat();scan.nextLine();

			double change = money - Math.ceil(Total);

			if (money < Math.ceil(Total)){
				System.out.println();
				System.out.println("Not Enough Money");
						}
			else {
				System.out.println();
				System.out.println("Thanks for Shopping");
				System.out.printf("Change : $%.2f\n", change);
			}
			}
		}
		}
	public static void main (String [] args){
		new TugasTM2();
		}
	}