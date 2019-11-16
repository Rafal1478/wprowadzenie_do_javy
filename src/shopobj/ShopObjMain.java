package shopobj;

import java.util.Scanner;

public class ShopObjMain {
    public static void main(String[] args) {
//        Warehouse warehouse = new Warehouse();
//        Product iron = new Product("żelazko", 100);
//        warehouse.addProduct(new Product("żelazko", 100),2);
//        warehouse.addProduct(new Product("odkurzacz", 300), 3);
//        warehouse.addProduct(iron, 2);
//        warehouse.displayProducts();
//        warehouse.takeProduct("żelazko");
//        System.out.println();
//        warehouse.displayProducts();

        Warehouse warehouse =new Warehouse();
        Scanner scanner = new Scanner(System.in);
        while (true){
           displayActions();

            String choice =  scanner.nextLine();
            switch (choice) {
                case "buy" :
                    System.out.println("Instert product name");
                    String productToBuyName = scanner.nextLine();
                    Product buyingDProduct = warehouse.takeProduct(productToBuyName);
                    if(buyingDProduct == null) {
                        System.out.println("NO product chooosen");
                        break;
                    }
                    System.out.println("You have to pay " + buyingDProduct.getPrice() + " zł");
                case "disp" :
                    warehouse.displayProducts();
                    break;
                case "add" :
                    System.out.println("Insert product name"); // "żelazko\n"
                    String productName = scanner.nextLine();// ""
                    System.out.println("Insert product price");// "100\n"
                    int productPrice = scanner.nextInt();//"\n"
                    System.out.println("insert product count");// "\n3\n"
                    int productCount = scanner.nextInt();//"\n"
                    scanner.nextLine();// ""
                    warehouse.addProduct(new Product(productName, productPrice), productCount);
                    System.out.println("Product has been added");
                    break;
                case "end" :
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Unexpected choice,");
                    break;
            }
        }
    }
    public static void displayActions() {
        System.out.println("Select action: ");
        System.out.println(" - buy");
        System.out.println(" - add");
        System.out.println(" - disp");
        System.out.println(" - end");
    }
}
