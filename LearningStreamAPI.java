import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class Product {
    private final String id;
    private final String name;
    private final String category;
    private final String brand;
    private final double price;
    private final double rating;
    private final int stock;
    private final boolean onSale;
    private final boolean available;
    private final int reviewCount;

    public Product(String id,String name, String brand, double price, String category, boolean available, int stock, double rating, int reviewCount) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.available = available;
        this.stock = stock;
        this.rating = rating;
        this.onSale = false; // par défaut
        this.reviewCount = reviewCount;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", stock=" + stock +
                ", onSale=" + onSale +
                ", available=" + available +
                ", reviewCount=" + reviewCount +
                '}';
    }
    // Getters
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public boolean isAvailable() { return available; }
    public int getStock() { return stock; }
    public double getRating() { return rating; }
    public boolean isOnSale() { return onSale; }

    public static void main(String[] args) {
        List<Product> products = generateFakeProductList();

        // 1. Affichez tous les produits du catalogue en utilisant forEach sur un Stream.
        System.out.println("1. Tous les produits :");
        products.stream()
                .forEach(System.out::println);

        // 2. Affichez dans la console la liste des noms de tous les produits (un nom par ligne).
        System.out.println("\n2. Noms des produits :");
        products.stream()
                .map(Product::getName)
                .forEach(System.out::println);

        // 3. Créez une nouvelle liste contenant uniquement les produits dont le prix est inférieur ou égal à 50€, puis affichez cette liste.
        System.out.println("\n3. Produits <= 50€ :");
        List<Product> cheapProducts = products.stream()
                .filter(p -> p.getPrice() <= 50)
                .collect(Collectors.toList());
        cheapProducts.forEach(System.out::println);

        // 4. Calculez et affichez le nombre de produits dont la catégorie est "Informatique".
        System.out.println("\n4. Nombre de produits Informatique :");
        long informatiqueCount = products.stream()
                .filter(p -> p.getCategory().equals("Informatique"))
                .count();
        System.out.println(informatiqueCount);

        // 5. Créez une liste des marques présentes dans le catalogue, sans doublons, puis affichez cette liste.
        System.out.println("\n5. Marques uniques :");
        List<String> brands = products.stream()
                .map(Product::getBrand)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(brands);

        // 6. Calculez et affichez le prix moyen de tous les produits du catalogue.
        System.out.println("\n6. Prix moyen :");
        double averagePrice = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);
        System.out.println(averagePrice);

        // 7. Trouvez et affichez le produit le plus cher du catalogue.
        System.out.println("\n7. Produit le plus cher :");
        Product mostExpensive = products.stream()
                .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);
        System.out.println(mostExpensive);

        // 8. Vérifiez si tous les produits marqués comme available == true ont un stock strictement supérieur à 0.
        System.out.println("\n8. Disponibilité :");
        boolean allAvailable = products.stream()
                .filter(Product::isAvailable)
                .allMatch(p -> p.getStock() > 0);
        if (allAvailable) {
            System.out.println("✅ Tous les produits disponibles ont du stock.");
        } else {
            System.out.println("🚨 Attention : certains produits indiqués comme disponibles n'ont pas de stock !");
        }

        // 9. Créez une liste contenant les 5 produits disponibles les moins chers, triés par prix croissant, puis affichez cette liste.
        System.out.println("\n9. 5 produits les moins chers :");
        List<Product> cheapestProducts = products.stream()
                .filter(Product::isAvailable)
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .limit(5)
                .collect(Collectors.toList());
        cheapestProducts.forEach(System.out::println);

        // 10. Créez une liste des noms de tous les produits de la catégorie "Mode", triés par ordre alphabétique, puis affichez la liste.
        System.out.println("\n10. Produits Mode :");
        List<String> modeProducts = products.stream()
                .filter(p -> p.getCategory().equals("Mode"))
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(modeProducts);

        // 11. Créez une Collection de type Map<String, List<Product>> qui regroupe les produits par catégorie.
        System.out.println("\n11. Produits par catégorie :");
        Map<String, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        productsByCategory.forEach((category, prods) -> {
            System.out.println(category + ":");
            prods.forEach(System.out::println);
        });

        // 12. Créez une Map<String, Long> qui contient pour chaque marque le nombre de produits correspondants.
        System.out.println("\n12. Nombre de produits par marque :");
        Map<String, Long> productsByBrand = products.stream()
                .collect(Collectors.groupingBy(Product::getBrand, Collectors.counting()));
        System.out.println(productsByBrand);

        // 13. Créez une Map<Boolean, List<Product>> qui sépare les produits en deux groupes : true → produits en promotion, false → les autres.
        System.out.println("\n13. Produits en promotion :");
        Map<Boolean, List<Product>> promotionProducts = products.stream()
                .collect(Collectors.partitioningBy(Product::isOnSale));
        promotionProducts.forEach((onSale, prods) -> {
            System.out.println(onSale ? "En promotion :" : "Pas en promotion :");
            prods.forEach(System.out::println);
        });

        // 14. Trouvez un produit de la catégorie "Jeux vidéo" avec une note >= 4.7.
        System.out.println("\n14. Produit Jeux vidéo >= 4.7 :");
        Product gameProduct = products.stream()
                .filter(p -> p.getCategory().equals("Jeux vidéo") && p.getRating() >= 4.7)
                .findAny()
                .orElse(null);
        if (gameProduct != null) {
            System.out.println("✅ Produit trouvé : " + gameProduct.getName());
        } else {
            System.out.println("❌ Aucun produit trouvé.");
        }

        // 15. BONUS : Chiffre d'affaires théorique par marque.
        System.out.println("\n15. CA théorique par marque :");
        Map<String, Double> caByBrand = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getBrand,
                        Collectors.summingDouble(p -> p.getPrice() * p.getStock())
                ));
        System.out.println(caByBrand);
    }

    public static List<Product> generateFakeProductList() {
        return List.of(
                new Product("P01", "Clavier mécanique", "Informatique", "LogiTech", 89.99, 4.7, 25, true, true, 320),
                new Product("P02", "Souris gaming", "Informatique", "Razer", 59.99, 4.6, 40, false, true, 410),
                new Product("P03", "Écran 27 pouces", "Informatique", "Asus", 249.99, 4.5, 12, true, true, 190),
                new Product("P04", "Tapis de souris XXL", "Informatique", "SteelSeries", 29.99, 4.3, 60, false, true, 250),
                new Product("P05", "Chaise de bureau", "Maison", "SecretLab", 399.99, 4.8, 5, true, true, 95),
                new Product("P06", "Lampe de bureau LED", "Maison", "Philips", 39.99, 4.4, 30, false, true, 210),
                new Product("P07", "Casque audio sans fil", "Téléphonie", "Sony", 199.99, 4.6, 18, true, true, 340),
                new Product("P08", "Smartphone milieu de gamme", "Téléphonie", "Samsung", 449.99, 4.2, 8, false, true, 520),
                new Product("P09", "Housse de smartphone", "Téléphonie", "Spigen", 19.99, 4.5, 100, true, true, 610),
                new Product("P10", "Câble USB-C", "Téléphonie", "Anker", 12.99, 4.7, 200, false, true, 720),
                new Product("P11", "Basket de running", "Sport", "Nike", 89.99, 4.4, 50, true, true, 430),
                new Product("P12", "T-shirt de sport", "Sport", "Adidas", 29.99, 4.1, 80, false, true, 150),
                new Product("P13", "Haltères 10kg", "Sport", "Domyos", 49.99, 4.6, 20, false, true, 90),
                new Product("P14", "Tapis de yoga", "Sport", "Decathlon", 24.99, 4.3, 70, true, true, 270),
                new Product("P15", "Aspirateur sans fil", "Maison", "Dyson", 499.99, 4.8, 7, true, true, 610),
                new Product("P16", "Mixeur plongeant", "Cuisine", "Moulinex", 69.99, 4.2, 22, false, true, 130),
                new Product("P17", "Batterie de cuisine 10 pièces", "Cuisine", "Tefal", 159.99, 4.5, 10, true, true, 260),
                new Product("P18", "Couteau de chef", "Cuisine", "Zwilling", 79.99, 4.7, 15, false, true, 340),
                new Product("P19", "Perceuse-visseuse", "Bricolage", "Bosch", 129.99, 4.6, 14, true, true, 380),
                new Product("P20", "Boîte à outils 100 pièces", "Bricolage", "Makita", 199.99, 4.4, 9, false, true, 210),
                new Product("P21", "Peinture blanche 10L", "Bricolage", "Dulux", 59.99, 4.0, 0, false, false, 120),
                new Product("P22", "Jeu de plateau fantasy", "Jeux vidéo", "Asmodee", 49.99, 4.8, 35, true, true, 540),
                new Product("P23", "Manette sans fil", "Jeux vidéo", "Microsoft", 69.99, 4.6, 28, false, true, 430),
                new Product("P24", "Console next-gen", "Jeux vidéo", "Sony", 549.99, 4.9, 0, true, false, 980),
                new Product("P25", "Fauteuil gaming", "Maison", "DXRacer", 299.99, 4.5, 6, false, true, 260),
                new Product("P26", "Oreiller mémoire de forme", "Maison", "Emma", 79.99, 4.3, 40, true, true, 310),
                new Product("P27", "Crème hydratante", "Beauté", "Nivea", 9.99, 4.1, 120, false, true, 140),
                new Product("P28", "Sérum visage", "Beauté", "The Ordinary", 29.99, 4.6, 60, true, true, 380),
                new Product("P29", "Tondeuse barbe", "Beauté", "Philips", 59.99, 4.4, 35, false, true, 220),
                new Product("P30", "Parfum homme", "Beauté", "Dior", 89.99, 4.7, 18, true, true, 510),
                new Product("P31", "Salon de jardin", "Jardin", "AliceGarden", 399.99, 4.2, 0, false, false, 80),
                new Product("P32", "Tondeuse à gazon", "Jardin", "Bosch", 279.99, 4.5, 5, true, true, 140),
                new Product("P33", "Tuyau d’arrosage 30m", "Jardin", "Hozelock", 39.99, 4.0, 25, false, true, 90),
                new Product("P34", "Guirlande lumineuse extérieure", "Jardin", "Philips Hue", 59.99, 4.6, 15, true, true, 260),
                new Product("P35", "Manteau d’hiver", "Mode", "Uniqlo", 129.99, 4.4, 30, false, true, 300),
                new Product("P36", "Jean slim", "Mode", "Levi's", 99.99, 4.3, 50, true, true, 410),
                new Product("P37", "Pull en laine", "Mode", "Sandro", 149.99, 4.2, 12, false, true, 150),
                new Product("P38", "Chaussures de ville", "Mode", "Clarks", 109.99, 4.4, 20, true, true, 210),
                new Product("P39", "Sac à dos urbain", "Mode", "Eastpak", 59.99, 4.5, 45, false, true, 370),
                new Product("P40", "Montre connectée", "Téléphonie", "Apple", 399.99, 4.8, 9, true, true, 890)
        );
    }

} 