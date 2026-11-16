class Product {
    int productId;
    String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }
}

class Electronics extends Product {
    String brand;
    int warranty;

    Electronics(int productId, String productName, String brand, int warranty) {
        super(productId, productName);
        this.brand = brand;
        this.warranty = warranty;
    }

    void displayElectronics() {
        displayProduct();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " months");
    }
}

class Clothing extends Product {
    String size;
    String material;

    Clothing(int productId, String productName, String size, String material) {
        super(productId, productName);
        this.size = size;
        this.material = material;
    }

    void displayClothing() {
        displayProduct();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

public class Main {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, "Smartphone", "Samsung", 12);
        Clothing c = new Clothing(102, "Jacket", "L", "Cotton");

        System.out.println("--- Electronics Details ---");
        e.displayElectronics();

        System.out.println("\n--- Clothing Details ---");
        c.displayClothing();
    }
}
