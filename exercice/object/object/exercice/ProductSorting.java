package javacore.chapter05.object.exercice;

public class ProductSorting {

    String name;
    String category;
    double price;
    char currency;

    public ProductSorting(String name, String category, double price, char currency) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public void displayProduct() {
        System.out.println("Product Name : " + this.name + " | Category : " + this.category + " | Price : " + this.price + this.currency);
    }

    public double convertToUSD() {
        switch (this.currency) {
            case '$':
                return this.price;
            case '€':
                return this.price / 0.95;
            case '¥':
                return this.price / 7.27;
            case '£':
                return this.price / 0.79;
            default:
                return 0;
        }
    }

    public static void bubbleSort(ProductSorting[] productArray) {
        for (int i = 0; i < productArray.length - 1; i++) {
            for (int j = 0; j < productArray.length - i - 1; j++) {
                if (productArray[j].convertToUSD() > productArray[j + 1].convertToUSD()) {
                    // Inverser les positions
                    ProductSorting temp = productArray[j];
                    productArray[j] = productArray[j + 1];
                    productArray[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        ProductSorting[] productArray = generateFakeProductList();
        bubbleSort(productArray);
        for (ProductSorting product : productArray) {
            product.displayProduct();
        }
    }

    public static ProductSorting[] generateFakeProductList() {
        ProductSorting[] productArray = new ProductSorting[10];
        productArray[0] = new ProductSorting("Samsung G9", "Gaming Screen", 1499.99, '$');
        productArray[1] = new ProductSorting("Porsche 911", "Car", 120000, '€');
        productArray[2] = new ProductSorting("IKEA Sofa", "Seating", 599.99, '£');
        productArray[3] = new ProductSorting("MacBook Pro M3", "Laptop", 2499.99, '$');
        productArray[4] = new ProductSorting("Rolex Submariner", "Watch", 9500, '€');
        productArray[5] = new ProductSorting("Bose QuietComfort 45", "Headphones", 329.99, '$');
        productArray[6] = new ProductSorting("Dyson V15 Detect", "Vacuum Cleaner", 7390.10, '¥');
        productArray[7] = new ProductSorting("Harley-Davidson Fat Boy", "Motorcycle", 20300, '€');
        productArray[8] = new ProductSorting("Canon EOS R5", "Camera", 3899, '$');
        productArray[9] = new ProductSorting("Lego Millennium Falcon", "Toy", 849.99, '$');
        return productArray;
    }
}
