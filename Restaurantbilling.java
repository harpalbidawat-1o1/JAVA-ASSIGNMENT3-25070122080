class Restaurantbilling {

    static int totalOrders = 0;

    // Dine-in bill
    static double calculateBill(double amount) {
        totalOrders++;
        return amount;
    }

    // Takeaway bill
    static double calculateBill(double amount, double packingCharge) {
        totalOrders++;
        return amount + packingCharge;
    }

    // Delivery bill
    static double calculateBill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return amount + packingCharge + deliveryCharge;
    }

    public static void main(String[] args) {

        System.out.println("Dine-in Bill: ₹" + calculateBill(500));

        System.out.println("Takeaway Bill: ₹" + calculateBill(500, 30));

        System.out.println("Delivery Bill: ₹" + calculateBill(500, 30, 50));

        System.out.println("Total Orders: " + totalOrders);
    }
}