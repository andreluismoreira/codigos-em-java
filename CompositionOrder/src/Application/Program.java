package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.OrderStatus;
import Entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client Data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email =sc.nextLine();
		System.out.print("BirthDate [dd/MM/yyyy]: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter Order Data ");
		System.out.print("Enter the OrderStatus: ");
		String orderStatus = sc.next();
		
		Order order = new Order( new Date(),OrderStatus.valueOf(orderStatus), client);
		
		System.out.println("how many Itens you want to order: ");
		int x = sc.nextInt();
		
		for (int i = 1; i <=x; i ++) {
			System.out.println("Enter #"+ i + "° product data: " );
			System.out.print("Name: ");
			String productName = sc.next();
			System.out.print("Price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
		
			order.addOrder(orderItem);
		}
		
		System.out.println(" ");
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		sc.close();
	}

}
