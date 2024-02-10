package Client;

import Entity.Product;
import Model.ProductRequest;
import Service.ProductService;

import java.time.LocalDate;
import java.util.Scanner;

public class InventoryManagementSystem {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Inventory managment system");
            System.out.println("1.Add product");
            System.out.println("2.Display all products");
            System.out.println("3.Notify for low stock products");
            System.out.println("4.Add category");
            System.out.println("5.Display all categories");
            System.out.println("6.Discription");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ju lutem fusni te dhenat");
                    createProduct(scanner);
                    break;
            }
        } while (choice != 6);
        scanner.close();
    }

    public static void getUserProductData(ProductRequest request) {
        ProductService productService = new ProductService();
        productService.create(request);
        System.out.println(request);

    }

    public static void createProduct(Scanner scanner)  {

        ProductRequest product = new ProductRequest();
        System.out.println("1)Ju lutem fusni emrin e produktit");
        String name = scanner.next();
        product.setName(name);
        System.out.println("2)Ju lutem fusni pershkrimin e productit");
        String description = scanner.next();
        product.setDescription(description);
        System.out.println("3)Ju lutem fusni cmimin e productit");
        Double price = scanner.nextDouble();
        product.setPrice(price);
        System.out.println("4)Vendosni kategorine e produktit");
        Long catId= scanner.nextLong();
        product.setCategory(catId);
        System.out.println("5)Vendosni sasine e produktit");
        Integer quantity=scanner.nextInt();
        product.setQuantity(quantity);
        ProductService productService = new ProductService();
        productService.create(product);

    }
}