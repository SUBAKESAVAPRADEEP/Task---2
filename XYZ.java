package Pradeep;


    import java.util.Scanner;

    public class XYZ {
        public static void main(String[] args) {
            // Accept five product information from user and store in an array
            Product[] products = new Product[5];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter details for product " + (i + 1) + ":");
                System.out.print("PId: ");
                String pic = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Read the newline character

                products[i] = new Product(pic, price, quantity);
            }

            // Find pic of the product with the highest price
            String picWithHighestPrice = findPicWithHighestPrice(products);
            System.out.println("Product with the highest price: " + picWithHighestPrice);

            // Calculate and return the total amount spent on all products
            double totalAmountSpent = calculateTotalAmountSpent(products);
            System.out.println("Total amount spent on all products: " + totalAmountSpent);
        }

        // Method to find the pic of the product with the highest price
        public static String findPicWithHighestPrice(Product[] products) {
            double highestPrice = Double.MIN_VALUE;
            String picWithHighestPrice = "";

            for (Product product : products) {
                if (product.getPrice() > highestPrice) {
                    highestPrice = product.getPrice();
                    picWithHighestPrice = product.getPic();
                }
            }

            return picWithHighestPrice;
        }

        // Method to calculate and return the total amount spent on all products
        public static double calculateTotalAmountSpent(Product[] products) {
            double totalAmountSpent = 0;

            for (Product product : products) {
                totalAmountSpent += product.getPrice() * product.getQuantity();
            }

            return totalAmountSpent;}
    }



