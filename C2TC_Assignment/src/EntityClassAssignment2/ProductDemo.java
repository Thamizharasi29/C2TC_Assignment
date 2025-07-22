package EntityClassAssignment2;

	import java.util.Scanner;

	public class ProductDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Product[] products = new Product[4];

	        for (int i = 0; i < 4; i++) {
	            System.out.println("Enter details for Product " + (i + 1) + ":");
	            System.out.print("Product ID: ");
	            int id = Integer.parseInt(sc.nextLine());
	            System.out.print("Product Name: ");
	            String name = sc.nextLine();
	            System.out.print("Price: ");
	            double price = Double.parseDouble(sc.nextLine());
	            products[i] = new Product(id, name, price);
	        }

	        System.out.println("\nProduct Details:");
	        for (Product p : products) {
	            p.display();
	        }
	        sc.close();
	    }
	}


