package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String Args[]) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int x = sc.nextInt();
		for(int i = 1; i <= x; i ++) {
			System.out.println("Common, Used or Imported ? [C;U;I]: ");
			char type = sc.next().charAt(0);
			System.out.println("Product data #" + i);
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				Product product = new Product(name, price);
				productList.add(product);
			} else if (type == 'u'){
				System.out.print("Manufacture date: ");
				Date manufactureDate = sdf.parse(sc.next());
				
				Product product = new UsedProduct(name, price, manufactureDate);
				productList.add(product);
			} else {
				System.out.print("customs fee: ");
				double custonsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, custonsFee);
				productList.add(product);
			}
			

		}
		
		System.out.println(" ");
		
		System.out.println("Price Tag's: ");
			for (Product product : productList) {
				System.out.println( product.priceTag());
		
	    }
	}
}
