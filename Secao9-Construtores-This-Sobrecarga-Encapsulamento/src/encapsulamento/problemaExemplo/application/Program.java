package encapsulamento.problemaExemplo.application;

import encapsulamento.problemaExemplo.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Products products = new Products(name, price);

        products.setName("Computer");
        System.out.println("Update name: " + products.getName());
        products.setPrice(1200.00);
        System.out.println("Update price: " + products.getPrice());

        System.out.println();
        System.out.println("Product data: " + products);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        products.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + products);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        products.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + products);




        sc.close();


    }
}
